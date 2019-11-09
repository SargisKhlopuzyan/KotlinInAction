package com.example.kotlininaction.chapter_5_less_then_5.interface_kt

import android.util.Log

/**
 * Created by Joomag, Inc., on 10/22/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
data class PersonInterfaceKt(var name: String, var age: Int = 0) {

    companion object Companion : JSONFactory<PersonInterfaceKt> {

        override fun fromJSON(jsonText: String): PersonInterfaceKt {
            Log.e("LOG_TAG", "Normal function: ${jsonText}")
            return PersonInterfaceKt(jsonText)
        }
    }
}

fun PersonInterfaceKt.Companion.fromJSON(json: String): PersonInterfaceKt {
    Log.e("LOG_TAG", "Extension function: ${json}")
    return PersonInterfaceKt(json)
}