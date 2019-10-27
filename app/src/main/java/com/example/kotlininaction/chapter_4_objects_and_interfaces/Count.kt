package com.example.kotlininaction.chapter_4_objects_and_interfaces

import android.util.Log

const val LOG_TAG = "LOG_TAG"
var opCount = 0

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    Log.e(LOG_TAG, "Operation performed $opCount times")
}