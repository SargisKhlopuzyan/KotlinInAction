package com.example.kotlininaction.chapter_06_the_kotlin_type_system

fun main() {

    val emailAddress: String? = null
//    emailAddress?.let { emailNumber -> sendEmail(emailNumber) }
    emailAddress.let { sendEmail(it ?: "TEST") }

    val emailNumber2: String? = "sargis@gmail.com"
    emailNumber2?.let { emailNumber2 -> sendEmail(emailNumber2) }
    emailNumber2?.let { sendEmail(it) }

    val person: Person? = Person("Sargis_1", null)
//    val person: Person? =
//        Person("Sargis_1", Company("SoftConstruct", Address("A.A", 60, "Yerevan", "Armenia")))
    val unitType = person?.company?.address?.let { sendEmail(it.streetAddress) }
    println("UnitType is: ${unitType.toString()}")
}


fun sendEmail(emailNumber: String) {
    println("Sending email to $emailNumber")
}