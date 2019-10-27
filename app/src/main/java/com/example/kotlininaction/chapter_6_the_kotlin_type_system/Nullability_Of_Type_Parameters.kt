package com.example.kotlininaction.chapter_6_the_kotlin_type_system

fun main() {
    printNullableObjectHashCode(null)
    printNullableObjectHashCode("Sargis")
    printNotNullableObjectHashCode(Person(name = "Sargis", company = null))

    callJavaClass()
}


fun <T> printNullableObjectHashCode(t: T) {
    println("HashCode of $t is ${t.hashCode()}")
}

fun <T : Any> printNotNullableObjectHashCode(t: T) {
    println("HashCode of $t is ${t.hashCode()}")
}

fun callJavaClass() {
    val personJava = PersonJava("Sargis")
    println("${personJava?.getName()?.toUpperCase()}")
    println("${personJava.getName().toUpperCase()}")
}