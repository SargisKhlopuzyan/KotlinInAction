package com.example.kotlininaction.chapter_07_operator_overloading.delegate

fun main(args: Array<String>) {

    var emails = loadEmails(Person("a"))

    val collection = DelegatingColaction<String>()
    collection.innerList = emails as ArrayList<String>
    println("emails: $emails")
    println("emails: $collection")
}