package com.example.kotlininaction.chapter_05_less_then_5

import android.util.Log
import com.example.kotlininaction.chapter_05_less_then_5.interface_kt.PersonInterfaceKt

/**
 * Created by Joomag, Inc., on 10/28/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */

fun main() {
    val delegationSet = DelegationCollection<String>()
    delegationSet.add("A")
    delegationSet.add("B")
    delegationSet.add("C")
    delegationSet.addAll(listOf("D", "E", "F"))

    Log.e(
        "LOG_TAG",
        "${delegationSet.objectsAdded} objects added, ${delegationSet.objectsAdded} remain"
    )


//        val singleton = SingletonObject
//        singleton.allEmployees.addAll(
    SingletonObject.allEmployees.addAll(
        arrayListOf(
            PersonKt("A"),
            PersonKt("B", 12),
            PersonKt(name = "C", salary = 900000)
        )
    )


    val listOfPersonKt = listOf<PersonKt>(
        PersonKt(
            "A"
        ),
        PersonKt("B"),
        PersonKt("A")
    )
    listOfPersonKt.sortedWith(PersonKt.PersonKtNameComparator)

    PersonKt.PersonKtCompanionObject.getPersonKtName()

    val subscribingUser = User2.newSubscribingUser("Sargis@gmail.com")
    val facebookUser = User2.newFacebookName(123456789)

    Log.e("LOG_TAG", "subscribingUser: ${subscribingUser.nickname}")
    Log.e("LOG_TAG", "facebookUser: ${facebookUser.nickname}")

    PersonInterfaceKt.Companion.fromJSON(".....")
    PersonInterfaceKt.fromJSON("xxxxxx")

    val list = listOf<PersonInterfaceKt>(PersonInterfaceKt("A"), PersonInterfaceKt("B"))
    list.maxBy { it.age }
    list.maxBy { p: PersonInterfaceKt -> p.age }

    var count = 0
    list.forEach({
        it.age = 10
        count++
    })
}