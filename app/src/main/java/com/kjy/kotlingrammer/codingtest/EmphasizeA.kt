package com.kjy.kotlingrammer.codingtest


///*
//* 소문자 a가 포함되어있으면 전부 대문자 A로 변경, 대문자 A가 아닌 다른 영대문자들을 전부 소문자로 변경
//* */
//class Solution {
//    fun solution(myString: String): String {
//        return myString.replace("a", "A").map { if(it.isUpperCase() && it != 'A') it.lowercase() else it }.joinToString("")
//    }
//}