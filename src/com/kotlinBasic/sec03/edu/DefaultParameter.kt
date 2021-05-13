package com.kotlinBasic.sec03.edu

fun main() {
    val name = "홍길동"
    val email = "hello@kotlin.com"

    add(name) // 홍길동, default
    add(name, email) // 홍길동, hello@kotlin.com
    add("아폴로", "hello@a.com") // 아폴로, hello@a.com

    defaultArgs() // 100, 200
    defaultArgs(200) // 200, 200
    defaultArgs(x = 200, z = 400) // 원하는 인수에 값을 정해줄 수 있음

    normalVarargs(1, 2, 3, 4)
    normalVarargs(1, 2, 3)
}

// 매개변수에 값을 넣어두면 함수 호출 시 값을 입력하지 않은 부분에 기본 값이 됨
fun add(name: String, email: String = "default") {
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200, z: Int = 300) {
    println(x + y + z)
}

// 입력되는 값의 개수 만큼 찍는 함수. 4개의 인수면 4번, 3개의 인수면 3개
// 가변 인자 (Variable Argument)를 사용 - vararg 키워드 사용
fun normalVarargs(vararg counts: Int) {
    for(num in counts)
        print("$num")
    print("\n")
}