package com.example.kotlininaction.chapter_10_annotations_and_reflection.reflection

/**
 * Created by FastShift, Inc., on 11/13/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    val kFunction = ::foo
    kFunction.call(42)

}

fun foo(x: Int) =  println(x)