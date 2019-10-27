package com.example.kotlininaction.chapter_6_the_kotlin_type_system.collection_read_only_and_mutable

fun main() {

    val list = listOf<String>("a", "b", "c")
    printInUppercase(list)
}

fun printInUppercase(list: List<String>) {
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}