package com.sec03.edu

fun main() {
    twoLambda({a, b -> "First $a, $b"}, {"Second $it"})
    // 위와 동일
    // 람다식 함수의 매개변수들이 람다식이라면 매개변수들 중 마지막 람다식은 소괄호에서 빼고 표기 가능
    twoLambda({a, b -> "First $a, $b"}) {"Second $it"}
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    // 람다식의 매개변수가 1개인 경우 함수 호출 시 인수로 화살표가 아닌 $it 을 사용 가능함
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}