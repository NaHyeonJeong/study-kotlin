package com.sec08

fun<T> add(a: T, b: T, op: (T, T) -> T): T{
    return op(a, b)
}

fun main() {
    val result = add(2, 3, {a, b -> a + b})
    //연산식을 함수 선언부에 직접 구현하지 않고 전달하는 방법
    //함수의 형식 매개변수의 자료형을 특정하지 않아도 실행 가능
    println("result = ${result}")
}