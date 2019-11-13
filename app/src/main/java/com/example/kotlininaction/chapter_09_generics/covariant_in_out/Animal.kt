package com.example.kotlininaction.chapter_09_generics.covariant_in_out

/**
 * Created by FastShift, Inc., on 11/11/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
fun main() {
    val herd =
        Herd<Cat>()
    herd.addAnimal(Cat())
    herd.addAnimal(Cat())
    herd.addAnimal(Cat())
//    feedAll(herd)
    takeCareOfCats(herd)
}


/**************************************************************/

open class Animal {
    fun feed() {
        println("${this} is feeding")
    }
}

class Cat : Animal() {
    fun cleanLitter() {
        println("Cat[ ${this} ] is cleaning litter")
    }
}

/**************************************************************/

class Herd<out T : Animal> {

    private val animals = mutableListOf<T>()

    fun addAnimal(animal : Animal) {
        animals.add(animal as T)
    }

    val size: Int get() = animals.size

    operator fun get(i: Int): T {
        return animals[i]
    }
}

/**************************************************************/

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
    }
    feedAll(cats)
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}


/**************************************************************/

class HerdConstructor<out T : Animal>(private var leadAnimals: T, vararg varargAnimals: T) {

    private val animalList = mutableListOf<T>()

    fun addAnimal(animal : Animal) {
        animalList.add(animal as T)
    }

    val size: Int get() = animalList.size

    operator fun get(i: Int): T {
        return animalList[i]
    }
}

/**************************************************************/