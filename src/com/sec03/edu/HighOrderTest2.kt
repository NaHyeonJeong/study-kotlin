package com.sec03.edu

/**
 * 매개변수에 람다식 함수를 이용한 고차함수
 */
fun main(){
    var result: Int
    // 함수 인자로 람다식 사용
    result = highOrder({x, y -> x + y}, 10, 20)
    println(result)

    /**
     * 인자와 반환값이 없는 람다식 함수
     */
    var out: () -> Unit = {println("Hello Kotlin")}
    // 자료형 추론 가능
    // var out = {println("Hello Kotlin")} 와 같이 생략 가능
    out() // 변수를 함수처럼 사용
    val new = out // 람다식 변수를 다른 변수에 할당
    new()
}

// 람다식의 자료형만 선언해줌
fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b)
}
