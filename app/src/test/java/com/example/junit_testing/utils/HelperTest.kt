package com.example.junit_testing.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {

    lateinit var  helper : Helper



        @Before
        fun setUp(){
            println("Before Every Test case")
            helper = Helper()
        }

    @After
    fun tearDown(){
        println("After Every Test Case")
    }


    @Test
    fun isPalindrome() {

        // Arrange


        // Act

       // val result = helper.isPalindrome("hello")
        val result = helper.isPalindrome("")

        // Assert

        assertEquals(false,result)
    }

    @Test
    fun isPalindrome_isinputstring () {

        // Arrange
        val helper = Helper()

        // Act

       // val result = helper.isPalindrome("level")
        val result = helper.isPalindrome("a")
        // Assert

        assertEquals(true,result)



    }
}