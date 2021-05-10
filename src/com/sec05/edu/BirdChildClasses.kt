package com.sec05.edu

/**
 * 상속
 */
open class Bird2(var name: String, var wing: Int, var beak: String, var color: String) {
    //상속이 가능한 클래스 선언 - open 사용
    //메소드
    fun fly() = println(" Fly wing : $wing")
    fun sing(vol: Int) = println(" Sing vol : $vol")
}
class Lark(name: String, wing: Int, beak: String, color: String)
    : Bird2(name, wing, beak, color){
    //부모 클래스의 주 생성자를 사용하는 상속
        fun singHitone() = println(" Happy Song!")
    }
class Parrot : Bird2{
    val language: String
    //부 생성자를 사용하는 상속
    constructor(name: String, wing: Int, beak: String, color: String, language: String)
            : super(name, wing, beak, color) {
                this.language = language
            }
    fun speak() = println(" Speak! $language")
}

fun main() {
    val coco = Bird2("myBird", 2, "short", "blue")
    val lark = Lark("myLark", 2, "long", "brown")
    val parrot = Parrot("myParrot", 2, "short", "multiple", "Korean")

    println("coco = ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("lark = ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("parrot = ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")

    lark.singHitone()
    parrot.speak()
    lark.fly()
}