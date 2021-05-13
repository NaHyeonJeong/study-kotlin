package com.kotlinBasic.sec03.edu

/**
 * call-by-value
 * kotlin 에서는 일반적
 */
fun main() {
    var result = callByValue(lambda()) // 람다식 함수를 호출
    println(result)
}

fun callByValue(b: Boolean): Boolean { // 일반 변수 자료형으로 선언된 매개변수
    println("callByValue function")
    return b
}
val lambda: () -> Boolean = {
    println("lamda function")
    true
}