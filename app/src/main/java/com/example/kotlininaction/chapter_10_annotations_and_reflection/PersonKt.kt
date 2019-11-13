package com.example.kotlininaction.chapter_10_annotations_and_reflection

/**
 * Created by FastShift, Inc., on 11/12/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    val personKt = PersonKt("Alice", 28)
    println("${serialize(personKt)}")
}

fun serialize(personKt: PersonKt): String {
    return ""
}

fun <T> deserialize(json: String): T? {
    //TODO
    return null
}

data class PersonKt(val name: String, val age: Int)

