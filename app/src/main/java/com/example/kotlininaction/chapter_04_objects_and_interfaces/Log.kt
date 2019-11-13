package com.example.kotlininaction.chapter_04_objects_and_interfaces

fun Log(message: String) {
    android.util.Log.e("LOG_TAG", "message $message")
}