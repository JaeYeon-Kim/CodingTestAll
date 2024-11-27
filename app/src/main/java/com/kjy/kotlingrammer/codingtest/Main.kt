package com.kjy.kotlingrammer.codingtest

fun main() {
    getTextFromNumber()
}

//1부터 100까지의 정수 중 3의 배수일 때는 "Fizz", 5의 배수일 때는 "Buzz", 3과 5의 공배수일 때는 "FizzBuzz"를 출력하는 프로그램을 작성하세요.
fun getTextFromNumber() {
    (1..100).forEach { number ->
        when {
            number % 3 == 0 && number % 5 == 0 -> {
                println("FizzBuzz")
            }
            number % 3 == 0 -> {
                println("Fizz")
            }
            number % 5 == 0 -> {
                println("Buzz")
            }
            else -> {
                println(number)
            }
        }
    }
}



fun getTwoNumber(list: List<Int>) : Int {
    val sortedList = list.sortedDescending()
    return sortedList[0] + sortedList[1]
}

// 팩토리얼 구하기
fun getFactorial(num: Int): Int {
    return if(num == 0) 1 else num * getFactorial(num - 1)
}

// 회문
fun isPalindrome(str: String): String {
    return if(str == str.reversed()) {
        "${str}는 회문입니다."
    } else {
        "${str}는 회문이 아닙니다."
    }
}





// 영화 티켓 가격
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age <= 12 -> 15
        age in 13..60 -> if(isMonday) 25 else 30
        age >= 60 -> 20
        else -> -1
    }
}


// 모바일 알림
fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages > 100) {
        println("Your phone is blowing up! You have 99+ notifications")
    } else {
        println("You have $numberOfMessages notifications")
    }
}


//// 주어진 수의 약수 구하기
//fun getDividerNumber(number: Int): List<Int> {
//    return (1..number).filter { number % it == 0}
//}

//
//fun toCaseChange(input: String): String {
//    return input.map { if(it.isLowerCase()) it.uppercase() else it.lowercase()}.joinToString("")
//}


//// 주어진 리스트에서 짝수와 홀수의 개수 카운팅
//fun getCount(testList: List<Int>): Pair<Int, Int> {
//    val evenCount = testList.count { it % 2 == 0 }
//    val oddCount = testList.count { it % 2 == 1 }
//    return Pair(evenCount, oddCount)
//}


//// 주어진 리스트에서 가장 큰 숫자를 찾는 함수
//fun findBigNumber(list: List<Int>): Int {
//    return list.max()
//}

//
//// 소수구하기
//fun decimalNumber(number: Int): Boolean {
//    var dividerCount = 0        // 약수의 개수를 나타내는 번호
//    for (i in 1..number) {
//        if (number % i == 0) dividerCount += 1
//    }
//
//    return dividerCount == 2            // 만약 약수의 개수가 2이면 true를 리턴하고 2가 아니면 false를 리턴해줌
//}




//// 입력과 출력 처리
//fun inputSum() {
//    val a = readln().toInt()
//    val b = readln().toInt()
//    println(a + b)
//}
//
//

//fun reverseString(str: String): String {
//    return str.reversed()
//}


//fun filterList(originList: List<Int>): List<Int> {
//    return originList.filter { it % 2 == 0 }
//}


//fun sumToN(num: Int): Int {
//    var sum = 0
//    for (i in 0..num) {
//        sum += i
//    }
//    return sum
//}


//// 레벨테스트 대비 시험
//fun sum(a: Int, b: Int): Int {
//    return a + b
//}
//
//
//fun isEven(number: Int): Boolean {
//    return number % 2 == 0
//}
//
//fun max(a: Int, b: Int): Int {
//    return if(a > b) a else b
//}
//
//
//fun min(a: Int, b: Int): Int {
//    return if (a < b) a else b
//}



























