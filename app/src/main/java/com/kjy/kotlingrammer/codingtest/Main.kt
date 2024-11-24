package com.kjy.kotlingrammer.codingtest

fun main() {
    val solve = Solution()
   
}

class Solution {
    fun solution(numLog: IntArray): String {
        var result = ""
        run breaker@ {
            numLog.forEachIndexed { idx, num ->
                if(numLog.lastIndex == idx) return@breaker
                when(numLog[idx] + numLog[idx + 1]) {
                    1 -> result += "w"
                    -1 -> result += "s"
                    10 -> result += "d"
                    -10 -> result += "a"
                }
            }
        }
        return result
    }
}






















































