package com.example.kotlininaction.chapter_06_the_kotlin_type_system

class ElvisOperator {

}

fun main() {
    printShippingLabel(
        Person(
            "Sargis",
            Company("Soft Construct", Address("G. Hovsepyan 20", 60, "Yerevan", "Armenia"))
        )
    )

    printShippingLabel(
        Person(
            "NULL",
            null
        )
    )
}

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No Address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city $country")
    }
}