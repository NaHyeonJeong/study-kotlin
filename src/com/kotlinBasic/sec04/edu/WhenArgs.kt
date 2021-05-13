package com.kotlinBasic.sec04.edu

fun main(){
    print("Enter the score>> ")
    //val: 변하지 않는 값
    //var: 변하는 값
    val score = readLine()!!.toDouble() //값을 읽음
    var grade: Char = 'F'

    when(score) { //인자가 없는 경우도 있음
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'
    }
    println("Score: $score, Grade: $grade")
}