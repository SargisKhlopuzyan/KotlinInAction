package com.example.kotlininaction.chapter_08_higher_order_functions

import com.example.kotlininaction.chapter_08_higher_order_functions.map.TransformingSequenceKt

fun main() {

    var lambda1 = { a: Float -> a.toInt() }
    var lambda2 = { a: Int -> a.toString() }
    val result = foo(1F, lambda1 = lambda1, lambda2 = lambda2) {
        it.isNotEmpty()
    }

    println("result: $result")


    val logs = listOf("a", "b", "c")
    logs.mapKt {

    }
}

fun foo(i: Float, lambda1: (Float) -> Int, lambda2: (Int) -> String, lambda3: (String) -> Boolean): Boolean {
    return lambda3(lambda2(lambda1(i)))
}


inline fun <T, R> Iterable<T>.mapKt(transform: (T) -> R): List<R> {
    return this.map(transform)
}

fun <T, R> Sequence<T>.mapKt(transform: (T) -> R) : Sequence<R> {
    return TransformingSequenceKt(this, transform)
}