package com.sec03.edu

fun main() {
    // 1. 인자와 반환값이 있는 함수
    val res1 = funcParam(3, 2, ::sum0)
    println(res1)

    // 2. 인자가 없는 함수
    hello(::text)
    // 같은 의미
    hello({a, b -> text(a, b)}) // 람다식 표현
    hello{a, b -> text(a, b)} // 소괄호 생략

    // 3. 일반 변수에 값처럼 할당
    val likeLambda = ::sum0
    println(likeLambda(6, 6))
}

fun sum0(a: Int, b: Int) = a + b

fun text(a: String, b:String) = "Hi! $a $b" // 일반 함수

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int{
    return c(a, b)
}

// 람다식의 매개변수가 2개
fun hello(body: (String, String) -> String): Unit{
    // 여기서 결국 body 는 text 의 값을 가져다 씀
    println(body("Hello", "Kotlin"))
}