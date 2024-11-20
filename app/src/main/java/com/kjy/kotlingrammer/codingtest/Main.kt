package com.kjy.kotlingrammer.codingtest

fun main() {
    val solve = Solution()
    println(solve.solution("110010101001").joinToString())
}


///*
//* 문자열 code가 주어집니다.
//code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
//mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.
//* */
//
//class Solution {
//    fun solution(code: String): String {
//        var ret: String = ""
//        var mode: Int = 0
//
//        code.forEachIndexed { idx, value ->
//            when (mode) {
//                0 -> if ((code[idx] != '1') && (idx % 2 == 0)) {
//                    ret += code[idx]
//                } else if (code[idx] == '1') {
//                    mode = 1
//                }
//
//                1 -> if (code[idx] != '1' && (idx % 2 == 1)) {
//                    ret += code[idx]
//                } else if (code[idx] == '1') {
//                    mode = 0
//                }
//            }
//        }
//        return ret.ifBlank { "EMPTY" }
//    }
//}

























































