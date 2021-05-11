package com.sec06

class Person3{
    var id: Int = 0
    var name: String = "hyeon jeong"
    companion object {
        var language: String = "kor"
        fun work(){
            println("not working...")
        }
    }
}

fun main() {
    println(Person3.language)
    Person3.language = "eng"
    println(Person3.language)
    Person3.work()
    //Person3.name = "hj" 컴페니언 객체가 아님
}