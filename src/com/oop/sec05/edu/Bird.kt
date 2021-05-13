package com.oop.sec05.edu

/**
 * 생성자
 */
class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    //프로퍼티는 매개변수 안에 var를 사용해 프로퍼티로서 선언되어 본문에서 생략됨 - 주 생성자 활용
    //프로퍼티 선언시 기본값을 직접 지정할 수 있음
    //메소드
    fun fly() = println(" Fly wing : $wing")
    fun sing(vol: Int) = println(" Sing vol : $vol")
}
fun main(){
    val coco = Bird("my bird", 2, "short", "blue")
    coco.color = "yellow"
    println(" coco.color = ${coco.color}")
    coco.fly()
    coco.sing(3)
}