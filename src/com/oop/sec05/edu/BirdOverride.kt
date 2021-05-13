package com.oop.sec05.edu

/**
 * override
 */
open class Bird3(var name: String, var wing: Int, var beak: String, var color: String){
    //상속 가능한 클래스 위해 open 키워드 사용
    //메소드
    fun fly() = println(" Fly wing : $wing")
    open fun sing(vol: Int) = println(" Sing vol : $vol") //오버라이딩 가능한 메소드
}
class Parrot3(name: String, wing: Int = 2, beak: String, color: String, var language: String = "natural") : Bird3(name, wing, beak, color) {
    fun speak() = println("Speak! $language")
    override fun sing(vol: Int) { //오버라이딩된 메소드
        println("I'm a parrot! The volume level is $vol")
        speak() //달라진 내용
    }
}

fun main() {
    val parrot = Parrot3(name = "myparrot", beak = "short", color = "multiple")
    parrot.language = "English"

    println("parrot = ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.sing(10)
}