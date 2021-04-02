package com.sec03.edu

// 함수의 각 정보는 프레임(frame)이라는 정보로 스택(stack) 메모리의 높은 주소부터 거꾸로 자라듯이 채워짐
// 스택에는 main() 함수 프레임이 제일 아래에 생성되고 그 위에 max() 함수 프레임 생성
// 소멸은 max() 먼저 마지막에 main() 순으로 소멸
// 스택 오버플로우(stack overflow) : 낮 -> 높 주소인 힙 영역과 높 -> 낮 주소인 스택 영역의 겹침
fun main() {
    val num1 = 10
    val num2 = 3
    val result: Int

    result = max(num1, num2)
    println(result)
}

fun max(a: Int, b: Int) = if(a > b) a else b
