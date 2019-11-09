package com.example.kotlininaction.chapter_7_operator_overloading

data class Point(var x: Int, var y: Int) {

    /** Just a local function */
//    fun plus(other: Point): Point {
//        return Point(x + other.x, y + other.y)
//    }

    /**
     * Operator overloading version 1
     * */
    /*
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
    */
}

/**
 * Operator overloading version 2
 * */
operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

/**
 * Operator overloading version 2
 * */
operator fun Point.minus(other: Point): Point {
    return Point(x - other.x, y - other.y)
}