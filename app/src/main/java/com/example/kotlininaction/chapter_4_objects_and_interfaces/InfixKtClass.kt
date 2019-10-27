package com.example.kotlininaction.chapter_4_objects_and_interfaces

infix fun Any.toKt(other: Any) = Pair(this, other)