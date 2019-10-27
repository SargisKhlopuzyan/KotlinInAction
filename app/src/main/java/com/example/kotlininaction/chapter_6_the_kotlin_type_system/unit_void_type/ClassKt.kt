package com.example.kotlininaction.chapter_6_the_kotlin_type_system.unit_void_type

class ClassKt : InterfaceKt<Unit> {
    override fun interfaceFunction() {
        println("interfaceFunction is called")
    }
}

fun main() {
    val classKt = ClassKt()
    classKt.interfaceFunction()
}