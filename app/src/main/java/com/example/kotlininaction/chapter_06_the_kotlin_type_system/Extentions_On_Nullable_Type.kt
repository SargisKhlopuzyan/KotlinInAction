package com.example.kotlininaction.chapter_06_the_kotlin_type_system

fun main() {
    verifyUserInput(" ")
}

fun verifyUserInput(input: String?) {
//    if (input.isNullOrEmpty()) {
    if (input.isNullOrEmpty2()) {
        println("isNullOrEmpty2 => Please fill in the required fields")
    }

    if (input.isNullOrBlank2()) {
        println("isNullOrBlank2 => Please fill in the required fields")
    }
}

fun String?.isNullOrEmpty2() = this == null || this.isEmpty()
fun String?.isNullOrBlank2() = this == null || this.isBlank()