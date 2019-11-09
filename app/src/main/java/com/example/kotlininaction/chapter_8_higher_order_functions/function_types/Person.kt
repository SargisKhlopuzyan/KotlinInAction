package com.example.kotlininaction.chapter_8_higher_order_functions.function_types

class Person(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String?
)


class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumbers: Boolean = false

    fun getPredicate(): (Person) -> Boolean {
        val startWithPrefix = { p: Person ->
            p.firstName.startsWith(prefix)
        }

        if (!onlyWithPhoneNumbers) {
            return startWithPrefix
        }

        return { startWithPrefix(it) && it.phoneNumber != null }
    }
}