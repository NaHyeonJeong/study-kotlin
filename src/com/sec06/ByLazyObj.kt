package com.sec06

/**
 * lateinit은 프로퍼티를 봤으니
 * lazy는 객체를 봐야지
 */
class Person2(val name:String, val age:Int)

fun main() {
    var isPersonInstantiated: Boolean = false //초기화 확인 용도
    val Person2: Person2 by lazy { //lazy를 사용한 객체 지연 초기화
        isPersonInstantiated = true
        Person2("Kim", 23) //lazy 객체로 반환됨
    }
    val PersonDelegate = lazy { Person2("Hong", 50) } //위임 변수를 사용한 초기화

    println("Person2 Init = ${isPersonInstantiated}")
    println("PersonDelegate Init = ${PersonDelegate.isInitialized()}")

    println("Person2.name = ${Person2.name}") //초기화
    println("PersonDelegate.value.name = ${PersonDelegate.value.name}") //초기화

    println("Person2 Init = ${isPersonInstantiated}")
    println("PersonDelegate Init = ${PersonDelegate.isInitialized()}")

}