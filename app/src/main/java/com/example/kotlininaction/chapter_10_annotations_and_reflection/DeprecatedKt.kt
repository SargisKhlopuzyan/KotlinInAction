package com.example.kotlininaction.chapter_10_annotations_and_reflection

/**
 * Created by FastShift, Inc., on 11/12/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
class DeprecatedKt {

    @Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
    fun remove(index: Int) {

    }

    fun removeAt(index: Int) {

    }
}