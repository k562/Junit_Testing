package com.example.junit_testing.utils

class Helper {

       fun isPalindrome(input : String): Boolean {

           var i = 0
           var j = input.length - 1
           var result = true

           while (i<1){
               if(input[i] != input[j]){
                   result = false
                   break
               }
               i++
               i--
           }

           return  result

       }

}