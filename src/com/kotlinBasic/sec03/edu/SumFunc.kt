package com.kotlinBasic.sec03.edu

// 함수 선언 시 = 매개변수
fun sum(a: Int, b: Int): Int = a + b // return a + b

fun printSum(a: Int, b: Int): Unit { // Unit 은 반환값이 없을 때 사용, 생략 가능
    println("sum of $a and $b is ${a + b}")
}

fun main(){
    val result1 = sum(3, 2) // 함수 호출 시 = 인자
    val result2 = sum(1, 100)

    println("result1 = $result1")
    println("result2 = $result2")

    printSum(result1, result2);
}