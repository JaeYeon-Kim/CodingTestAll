package com.kjy.kotlingrammer.codingtest

fun main() {
    val solve = Solution()
    println(solve.solution(123))
}

class Solution {
    fun solution(n: Int): Int {
       var sum = 0
       n.toString().forEach {
           sum += it.code
       }
       return sum
    }
}


//class Solution {
//    fun solution(v: Array<IntArray>): IntArray {
//
//        val xList = mutableListOf<Int>()
//        val yList = mutableListOf<Int>()
//
//        v.forEach {
//            xList.add(it[0])
//            yList.add(it[1])
//        }
//
//        val resultX = xList.groupBy { it }.filter { array -> array.value.size < 2 }.keys.first()
//        val resultY = yList.groupBy { it }.filter { array -> array.value.size < 2 }.keys.first()
//
//        return intArrayOf(resultX, resultY)
//    }
//}























































