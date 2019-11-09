package com.example.kotlininaction.chapter_less_then_5

/**
 * Created by Joomag, Inc., on 10/22/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
class User {

    private val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore("@")
    }

    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }

    private fun getFacebookName(facebookAccountId: Int): String {
        return "FacebookUser(${facebookAccountId})"
    }

    companion object PersonKtCompanionObject {
        fun getPersonKtName(): String {
            return "nickname"
        }
    }

}