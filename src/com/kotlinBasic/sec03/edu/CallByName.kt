package com.kotlinBasic.sec03.edu

/**
 * call-by-name
 * 매개변수 b가 람다식 자료형으로 선언되었다는 것이 큰 차이점
 */
fun main() {
    var result = callByName(otherLambda) // 람다식 이름으로 호출
    println(result)
}

fun callByName(b: () -> Boolean): Boolean { // 람다식 자료형으로 선언된 매개변수
    println("callByName function")
    return b()
}
val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}