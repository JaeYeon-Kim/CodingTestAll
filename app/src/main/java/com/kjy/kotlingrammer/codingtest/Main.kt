package com.kjy.kotlingrammer.codingtest

fun main() {
    val rect1 = Rectangle(10, 5)
    val rect2 = Rectangle(3, 8)
    println(rect1 + rect2)
}

interface Plusable<T> {
    operator fun plus(other: T): T
}

class Rectangle(val width: Int, val height: Int) : Plusable<Rectangle> {
    override fun plus(other: Rectangle): Rectangle {
        return Rectangle(width + other.width, height + other.height)
    }

    override fun toString(): String {
        return "width: $width, height: $height"
    }

}


//class Solution {
//    fun solution(numLog: IntArray): String {
//        var result = ""
//        run breaker@{
//            numLog.forEachIndexed { idx, num ->
//                if (numLog.lastIndex == idx) return@breaker
//                when (numLog[idx] + numLog[idx + 1]) {
//                    1 -> result += "w"
//                    -1 -> result += "s"
//                    10 -> result += "d"
//                    -10 -> result += "a"
//                }
//            }
//        }
//        return result
//    }
//}
//
//




















































