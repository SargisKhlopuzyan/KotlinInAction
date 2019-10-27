package com.example.kotlininaction.chapter_4_objects_and_interfaces

class Rectangle(val height: Int, val width: Int) {
    val isEqual: Boolean
        get() {
            return height == width;
        }
}

fun isRectangle(height: Int, width: Int) = height == width