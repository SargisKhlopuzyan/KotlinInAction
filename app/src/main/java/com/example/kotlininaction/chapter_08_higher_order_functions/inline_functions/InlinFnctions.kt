package com.example.kotlininaction.chapter_08_higher_order_functions.inline_functions

import com.example.kotlininaction.chapter_05_less_then_5.PersonKt
import java.io.BufferedReader
import java.io.FileReader
import java.util.concurrent.TimeUnit
import java.util.concurrent.locks.Condition
import java.util.concurrent.locks.Lock
import kotlin.concurrent.withLock

class InlinFnctions {

}

fun main() {
    val lock = Any()

//    synchronized(lock) {
//        println("In synchronized method!!!")
//    }

//    readFirstLineFromFile("/file/read")
    val closeableClassKt = CloseableClassKt("Khlopuzyan")
    println("closeableClassKt1: $closeableClassKt")

    val newName = closeableClassKt.use {
        it.name = "Sargis"
    }

    val list: List<PersonKt> = listOf<PersonKt>(PersonKt("A"), PersonKt("B"))
    list.forEach{
        println("forEach: ${it.name}")
        if (it.name == "A") {
//            return
        }
    }

    list.forEachKt {
        println("forEachKt: ${it.name}")
        if (it.name == "A") {
            return@forEachKt
        }
        println("forEachKt after return: ${it.name}")

    }

    println("closeableClassKt2: $closeableClassKt")
}


inline fun <T> synchronized1(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun lockFunction() {
    val lock = object : Lock {
        override fun tryLock(): Boolean {
            return true
        }

        override fun tryLock(time: Long, unit: TimeUnit): Boolean {
            return true
        }

        override fun unlock() {
        }

        override fun lockInterruptibly() {
        }

        override fun newCondition(): Condition {
            return null!!
        }

        override fun lock() {

        }
    }

    lock.withLock {

    }
}

fun <T> Lock.withLockKt(action: () -> T): T {
    this.lock()
    try {
        return action()
    } finally {
        this.unlock()
    }
}

fun readFirstLineFromFile(path: String): String {
    val bufferedReader = BufferedReader(FileReader(path))
    bufferedReader.use {
            br -> return br.readLine()
    }
}

//inline
fun <T> Collection<T>.forEachKt(actionKt: (T) -> Unit) {
    for (element in this) {
        actionKt(element)
    }
}