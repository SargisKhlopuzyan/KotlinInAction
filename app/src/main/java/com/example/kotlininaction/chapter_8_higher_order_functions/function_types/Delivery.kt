package com.example.kotlininaction.chapter_8_higher_order_functions.function_types

enum class Delivery {
    STANDART, EXPEDITED
}

open class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {

    if (delivery == Delivery.EXPEDITED)
        return { order -> 6 + 2.1 * order.itemCount}

    return {order -> 1.2 * order.itemCount}
}