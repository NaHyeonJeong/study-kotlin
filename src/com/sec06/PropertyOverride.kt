package com.sec06

open class First{
    open val x: Int = 0 //오버라이딩 가능
        get(){
            println("First x")
            return field
        }
    val y: Int = 0 //open 키워드가 없으면 final 프로퍼티
}
class Second: First(){
    override val x: Int = 0 //상위 클래스와 구현부가 다르게 오버라이딩
        get() {
            println("Second x")
            return field + 3
        }
    //override val y: Int = 0; 오버라이딩 불가해서 오류남
}