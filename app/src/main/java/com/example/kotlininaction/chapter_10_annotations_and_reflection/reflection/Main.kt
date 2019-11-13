package com.example.kotlininaction.chapter_10_annotations_and_reflection.reflection

import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlin.reflect.full.memberProperties

/**
 * Created by FastShift, Inc., on 11/13/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
fun main() {
    val personKt = PersonKt()
    val kClass: KClass<PersonKt> = personKt.javaClass.kotlin
    println("kClass: $kClass")
    println("kClass.simpleName: ${kClass.simpleName}")

    kClass.memberProperties.forEach {
        println("memberProperties: ${it.name}")
    }

    val kProperty = ::count
    kProperty.set(40)
    println("count: ${kProperty.get()}")
    println("count: ${kProperty()}")

    val person =
        com.example.kotlininaction.chapter_10_annotations_and_reflection.PersonKt("Alice", 24)
    val memberProperty: KProperty1<com.example.kotlininaction.chapter_10_annotations_and_reflection.PersonKt, Int> =
        com.example.kotlininaction.chapter_10_annotations_and_reflection.PersonKt::age
    println("memberProperty: ${memberProperty.get(person)}")
}

var count = 40