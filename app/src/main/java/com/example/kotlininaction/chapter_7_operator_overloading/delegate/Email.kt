package com.example.kotlininaction.chapter_7_operator_overloading.delegate

class Email(val email: String) {
    override fun toString(): String {
        return email
    }
}

val emails =
    listOf(
        Email("a@gmail.com"),
        Email("b@gmail.com"),
        Email("c@gmail.com"),
        Email("d@gmail.com"),
        Email("abcd@gmail.com")
    )

fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return emails.filter {
        it.email.startsWith(person.name)
    }
}