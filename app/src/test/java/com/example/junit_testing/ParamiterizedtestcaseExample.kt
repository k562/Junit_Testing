package com.example.junit_testing

import com.example.junit_testing.utils.Helper
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runners.Parameterized

class ParamiterizedtestcaseExample (

    val input :  String ,
    val expectation: Boolean
        ) {

    @Test
    fun test(){

        val helper = Helper()
        val result  = helper.isPalindrome(input)
        assertEquals(expectation, result)

    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters (name = "{index} : {0} is pallindrome - {1}")
        fun data(): List<Array<Any>>{

            return listOf(
                arrayOf("hello", false),
                arrayOf("level", true),
                arrayOf("a", true),
                arrayOf("", true),

            )
        }
    }

}