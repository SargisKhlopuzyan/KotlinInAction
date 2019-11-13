package com.example.kotlininaction.chapter_09_generics.covariant_in_out

/**
 * Created by FastShift, Inc., on 11/11/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
interface ComparatorKt<in T> {

    fun compareKt(e1: T, e2: T): Int {
        return e1.hashCode() - e2.hashCode()
    }

}
