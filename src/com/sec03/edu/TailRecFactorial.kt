package com.sec03.edu

fun main(){
    val number = 5
    println("Factorial : $number -> ${factorial(number)}")
}
tailrec fun factorial(n: Int, run: Int = 1): Long{
    //인자 안에서 팩토리얼의 도중 값을 계산하고 호출
    //그때그때 값을 계산 > 스택 메모리 낭비 없음
    return if(n==1) run.toLong() else factorial(n-1, run*n)
}