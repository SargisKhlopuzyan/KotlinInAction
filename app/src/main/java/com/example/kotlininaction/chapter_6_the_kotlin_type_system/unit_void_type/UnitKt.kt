package com.example.kotlininaction.chapter_6_the_kotlin_type_system.unit_void_type

fun main() {
    /** Returns : Unit function is called : kotlin.Unit*/
    println("Unit function is called : ${doFunction()}")
}

fun doFunction() = Unit

