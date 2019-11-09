package com.example.kotlininaction.chapter_7_operator_overloading

fun main() {
    plusTwoPoints()
}

fun plusTwoPoints() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
//    val result = p1.plus(p2)
    val result = p1 + p2

    println("result : $result")
}

