package com.example.kotlininaction.chapter_05_less_then_5

/**
 * Created by Joomag, Inc., on 10/22/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */

object SingletonObject {
    val allEmployees = arrayListOf<PersonKt>()

    fun calculateSalary(): Int {
        var salary = 0
        for (person in allEmployees) {
            salary += person.salary
        }
        return salary
    }
}