package com.example.kotlininaction.chapter_5_less_then_5.interface_kt

/**
 * Created by Joomag, Inc., on 10/22/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}