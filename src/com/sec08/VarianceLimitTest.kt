package com.sec08

open class Animal(val size: Int){
    fun feed() = println("Feeding ... ")
}
class Cat(val jump: Int) : Animal(50)
class Spider(val position: Boolean): Animal(1)

class Box<out T: Animal> (val element: T){ //주 생성자는 val만 허용!
    //자료형을 제한했기 때문에 Animal과 하위 클래스 이외에는 사용 불가
    fun getAnimal(): T = element //out은 반환 자료형에만 사용 가능
}

fun main() {
    //일반적 객체 선언
    val c1: Cat = Cat(10)
    val s1: Spider = Spider(true)

    var a1: Animal = c1 //클래스의 상위 자료형으로 반환하는 것은 아무 문제 없음
    a1 = s1 //a1은 Spider의 객체가 됨
    println("a1.size = ${a1.size}")

    val c2: Box<Animal> = Box<Cat>(Cat(10)) //공변성 - Cat은 Animal의 하위 자료형
    println("c2.element.size = ${c2.element.size}")

    //val c3: Box<Cat> = Box<Animal>(10) //오류, 반대의 경우는 인스턴스화되지 않음
}