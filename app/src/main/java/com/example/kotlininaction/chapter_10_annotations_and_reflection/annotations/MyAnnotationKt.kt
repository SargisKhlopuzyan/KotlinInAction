package com.example.kotlininaction.chapter_10_annotations_and_reflection.annotations

import com.example.kotlininaction.chapter_10_annotations_and_reflection.MyClassKt
import kotlin.reflect.KClass

/**
 * Created by FastShift, Inc., on 11/12/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
annotation class MyAnnotationKt(val kClass: KClass<MyClassKt>) {

}