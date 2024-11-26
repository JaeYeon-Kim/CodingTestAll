package com.kjy.kotlingrammer.codingtest

fun main() {
    val testString = "hello world"
    var result = ""
    testString.forEach {
        result += it
    }

    println(result)
}


//class Solution {
//    fun solution(binomial: String): Int {
//        var answer: Int = 0
//        var input = binomial
//        var wildCardArray = arrayOf<String>("+", "-", "*")
//        wildCardArray.forEach { wildCard ->
//            if(binomial.contains(wildCard)) {
//                val numberList = input.replace(" ", "").split(wildCard)
//                when(wildCard) {
//                    "+" -> answer = numberList[0].toInt() + numberList[1].toInt()
//                    "-" -> answer = numberList[0].toInt() - numberList[1].toInt()
//                    "*" -> answer = numberList[0].toInt() * numberList[1].toInt()
//                }
//            }
//        }
//        return answer
//    }
//}















































