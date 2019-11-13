package com.example.kotlininaction.chapter_09_generics

import com.example.kotlininaction.chapter_09_generics.covariant_in_out.ComparatorKt

/**
 * Created by FastShift, Inc., on 11/11/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {

    val anyComperatorKt = object : ComparatorKt<Any> {
        override fun compareKt(e1: Any, e2: Any): Int {
            return e1.hashCode() - e2.hashCode()
        }
    }

}