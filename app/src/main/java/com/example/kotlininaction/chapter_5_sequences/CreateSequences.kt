package com.example.kotlininaction.chapter_5_sequences

import java.io.File

/**
 * Created by Joomag, Inc., on 10/25/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */

fun main() {
//    val naturalNumbers = generateSequence(0) { it + 1 }
//    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
//    println(numbersTo100.sum())
//
//
//    val file = File("/users/svtk/.HiddenDir/a.text")
//    println(file.isInsideHiddenDirectory())
//
//    createAllDoneRunnable().run()
//
//    val listener = View.OnClickListener { view ->
//        val text = when (view.id) {
//            R.id.bottom -> "F"
//            R.id.end -> "S"
//            else -> "Unknown button"
//        }
//    }

    println(alphabet())
}

fun File.isInsideHiddenDirectory() = generateSequence { this }.any { it.isHidden }

fun createAllDoneRunnable(): Runnable {
    return Runnable {
        println("All done!")
    }
}

fun alphabet() = buildString {
    for (letter in 'A'..'Z')
        append(letter)
    append("\nNow I know the alphabet!")
}