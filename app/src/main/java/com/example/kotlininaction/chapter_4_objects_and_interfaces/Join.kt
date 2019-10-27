@file:JvmName("StringFunctions")

package com.example.kotlininaction.chapter_4_objects_and_interfaces

//fun joinToString(): String {
//    return "ABC..."
//}

fun <T> Collection<T>.joinToString(
    separator: String = "",
    prefix: String = "",
    postfix: String = ""
): String {

    var result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0)
            result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}