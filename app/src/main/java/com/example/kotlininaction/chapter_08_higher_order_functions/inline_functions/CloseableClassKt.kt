package com.example.kotlininaction.chapter_08_higher_order_functions.inline_functions

import java.io.Closeable

class CloseableClassKt(var name: String): Closeable {
    override fun close() {

    }
}