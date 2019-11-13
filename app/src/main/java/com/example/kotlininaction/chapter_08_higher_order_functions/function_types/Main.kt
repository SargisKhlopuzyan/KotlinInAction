package com.example.kotlininaction.chapter_08_higher_order_functions.function_types

fun main() {
//    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
//    println("Shipping costs ${calculator(Order(3))}")


    val contacts = listOf(
        Person(
            "Dmitry",
            "Jemerov",
            "123-4567"
        ),
        Person(
            "Svetlana",
            "Isakova",
            null
        )
    )

    val contactListFilters =
        ContactListFilters()
    with(contactListFilters) {
        prefix = "Dm"
        onlyWithPhoneNumbers = true
    }


    println(contacts.filter(contactListFilters.getPredicate()))
}