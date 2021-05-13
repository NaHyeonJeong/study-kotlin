package com.stdLibrary.sec09

/**
 * asSequence() 사용
 * 요소의 개수가 많을 때 속도나 메모리 측면에서 훨씬 좋은 성능 낼 수 있음
 */
fun main() {
    val list1 = listOf(1, 2, 3, 4, 5)
    val listSeq = list1.asSequence()
        .map { println("map($it) "); it * it }
        .filter { println("filter($it) "); it % 2 == 0 }
        .toList()
    println(listSeq)
}