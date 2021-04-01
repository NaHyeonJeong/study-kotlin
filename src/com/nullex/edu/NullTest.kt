package com.nullex.edu

fun main(){
    // null 사용 위해 자료형 뒤에 ? 기호 명시 필수
    var str1: String? = "Hello Kotlin"

    // kotlin 은 기본적으로 null 을 허용하지 않음 -> error
    // 변수의 null 허용 여부에 따라 String 과 String? 은 서로 다른 자료형임
    str1 = null
    println("str1: $str1, length: ${str1?.length}") // null 허용하면 length 실행 위해서 ?. 이나 !!. 만 허용

    // 세이프 콜 ?. : 변수 검사 후 null 이 아니면 length 접근해 값 읽음
    // 단정 기호 !!. : 변수에 할당된 값이 null 이 아님을 단정 -> NPE 강제 발생
    var len = if(str1 != null) str1.length else -1
    println("str1: $str1, length: ${len}")

    // 엘비스 연산자 ?:
    // 변수 null 여부 검사 후 null 아니면 왼쪽 식, null 이면 오른쪽 식 실행
    println("str1: $str1, length: ${str1?.length?:-1}")
}