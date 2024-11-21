package com.kjy.kotlingrammer.codingtest

class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        val testList = mutableListOf<String>()
        todo_list.forEachIndexed { idx, value ->
            if(!finished[idx]) testList.add(value)
        }
        return testList.toTypedArray()
    }
}
