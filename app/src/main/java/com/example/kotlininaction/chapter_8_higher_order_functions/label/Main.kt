package com.example.kotlininaction.chapter_8_higher_order_functions.label

import java.lang.StringBuilder

fun main() {

    println(StringBuilder().apply sb@{
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })
}