package com.kjy.kotlingrammer.codingtest

fun main() {
    val solve = Solution()
    val result = solve.solution(29183,1)
    println(result)
}


class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer = 0
        var test = "dfAA"
        test.lowercase()

        num.toString().toList().forEachIndexed { idx, value ->
            if(value.toString().toInt() == k) {
                answer = idx
            }
        }

        return answer
    }
}















































