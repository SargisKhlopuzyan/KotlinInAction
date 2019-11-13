package com.example.kotlininaction.chapter_10_annotations_and_reflection

import com.example.kotlininaction.chapter_10_annotations_and_reflection.annotations.MyAnnotationKt
import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

/**
 * Created by FastShift, Inc., on 11/12/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
fun main() {

    val deprecatedKt = DeprecatedKt()
    deprecatedKt.remove(12)


    @MyAnnotationKt(MyClassKt::class)
    fun myTestFun() {

    }

}