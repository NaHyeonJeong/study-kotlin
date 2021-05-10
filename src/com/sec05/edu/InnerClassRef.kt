package com.sec05.edu

open class Base{
    open val x: Int = 1
    open fun f() = println("Base Class f()")
}

class Child: Base(){
    override val x:Int = super.x + 1
    override fun f() {
        println("Child Class f()")
    }

    inner class Inside{
        fun f() = println("Inside Class f()")
        fun test(){
            f()//inner class의 f() 사용
            Child().f()//바로 바깥 클래스의 f() 사용
            super@Child.f()//Child의 상위 클래스인 Base 클래스의 f() 사용
            println("[Inside] super@Child.x: ${super@Child.x}")//Base의 x 사용
       }
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test()
}