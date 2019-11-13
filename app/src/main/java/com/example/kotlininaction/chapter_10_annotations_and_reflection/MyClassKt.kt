package com.example.kotlininaction.chapter_10_annotations_and_reflection

import com.example.kotlininaction.chapter_10_annotations_and_reflection.annotations.Rule

/**
 * Created by FastShift, Inc., on 11/12/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
class MyClassKt {


    @get:Rule
    var myProperty : MyClassKt?
    get() {
        return MyClassKt()
    }
    set(value) {
        myProperty = value
    }

}