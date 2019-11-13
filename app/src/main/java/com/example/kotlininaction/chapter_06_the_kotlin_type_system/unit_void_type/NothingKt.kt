package com.example.kotlininaction.chapter_06_the_kotlin_type_system.unit_void_type

import com.example.kotlininaction.chapter_06_the_kotlin_type_system.Company
import com.example.kotlininaction.chapter_06_the_kotlin_type_system.Person

fun main() {
    val companyNullable: Company? = Person("Sargis", null).company
    println("companyNullable : $companyNullable")

    /** In this example compiler infers that the type of address is non-null*/
    val company = Person("Sargis", null).company ?: fail("No Address")
}

fun fail(message: String): Nothing {
    throw NullPointerException(message)
}

