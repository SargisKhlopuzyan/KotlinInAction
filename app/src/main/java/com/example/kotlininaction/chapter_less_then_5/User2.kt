package com.example.kotlininaction.chapter_less_then_5

/**
 * Created by Joomag, Inc., on 10/22/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
class User2(val nickname: String) {

    companion object {
        fun newSubscribingUser(email: String) =
            User2(email.substringBefore("@"))
        fun newFacebookName(facebookAccountId: Int) = User2(
            getFacebookName(
                facebookAccountId
            )
        )

        private fun getFacebookName(facebookAccountId: Int): String {
            return "FacebookAccount(${facebookAccountId})"
        }
    }
}