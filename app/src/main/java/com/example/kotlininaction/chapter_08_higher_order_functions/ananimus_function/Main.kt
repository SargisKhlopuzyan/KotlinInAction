package com.example.kotlininaction.chapter_08_higher_order_functions.ananimus_function

import com.example.kotlininaction.chapter_05_less_then_5.PersonKt

fun main() {

    val people = listOf(PersonKt("A"), PersonKt("Alice"), PersonKt("K"))
    lookForAlice(people)

    people.filter(fun(person): Boolean {
     return person.name == "Alice"
    })

}

//inline
fun lookForAlice(people: List<PersonKt>) {
    people.forEach(
        fun(personKt) {
            if (personKt.name == "Alice") return
            println("${personKt.name} is not Alice")
        }
    )
}