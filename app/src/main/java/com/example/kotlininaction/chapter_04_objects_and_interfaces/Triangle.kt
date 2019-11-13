package com.example.kotlininaction.chapter_04_objects_and_interfaces

class Triangle(val height: Int, val width: Int, val diagonal: Int) {
    val isRectangleTriangle: Boolean
        get() {
            return height*height + width*width == diagonal*diagonal;
        }
}

fun isRectangleTriangle(height: Int, width: Int, diagonal: Int) = height*height + width*width == diagonal*diagonal