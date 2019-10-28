package com.example.kotlininaction.chapter_less_then_5

/**
 * Created by Joomag, Inc., on 10/22/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
data class PersonKt(val name: String, val age: Int? = 0, val salary: Int = 100) {

    private var surname = "Khlopuzyan"

    object PersonKtNameComparator : Comparator<PersonKt> {
        override fun compare(o1: PersonKt, o2: PersonKt): Int {
            return o1.name.compareTo(o2.name)
        }
    }

    companion object PersonKtCompanionObject {
        fun getPersonKtName(): String {
            return "surname"
        }
    }

}

