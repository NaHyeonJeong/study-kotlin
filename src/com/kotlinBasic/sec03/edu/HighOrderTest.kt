package com.kotlinBasic.sec03.edu

/**
 * 변수에 할당하는 람다식 함수
 */

fun main(){
    var result: Int
    // x와 y로 곱한걸 반환받는 multi
    val multi = {x: Int, y: Int -> x * y} // 선언 자료형 생략
    result = multi(10, 20) // 람다식이 할당된 변수는 함수처럼 사용
    println(result)

    val result2: Int
    // 전체 표현
    // 람다식이 여러 줄이면 마지막 "표현식"이 반환 됨
    val multi2: (Int, Int) -> Int = {x: Int, y: Int ->
//        println("x * y") // 이거는 무조건 찍힘...
        x + y
        x * y
    }
    result2 = multi2(20, 30)
    println(result2)

    var greet: () -> Unit = { println("Hello Kotlin") }
    println(greet())
}