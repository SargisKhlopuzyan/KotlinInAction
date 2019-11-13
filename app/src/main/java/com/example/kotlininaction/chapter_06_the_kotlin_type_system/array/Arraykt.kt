package com.example.kotlininaction.chapter_06_the_kotlin_type_system.array

fun main(args: Array<String>) {
    val arrays = arrayFunction()
    println("arrays : ${arrays[0]} , ${arrays[1]}")
}

fun arrayFunction(): Array<String> {
    val letters = Array(26) {
//        it -> it.toString()
            it ->
        ('a' + it).toString()
    }
    return letters
}