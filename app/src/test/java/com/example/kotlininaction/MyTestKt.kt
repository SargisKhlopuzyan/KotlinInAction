package com.example.kotlininaction

import org.junit.Assert
import org.junit.Test

/**
 * Created by FastShift, Inc., on 11/12/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

const val TEST_TIMEOUT = 100L

class MyTestKt {

    @Test
    fun testTrue() {
        Assert.assertTrue(true)
    }


    @Test(timeout = TEST_TIMEOUT)
    fun testMethod() {

    }

}