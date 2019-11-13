package com.example.kotlininaction.chapter_10_annotations_and_reflection

import com.example.kotlininaction.chapter_10_annotations_and_reflection.jkid.JsonExclude
import com.example.kotlininaction.chapter_10_annotations_and_reflection.jkid.JsonName

/**
 * Created by FastShift, Inc., on 11/12/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
data class PersonKt2(
    @JsonName("alias") val name: String,
    @JsonExclude var age: Int? = null
)

