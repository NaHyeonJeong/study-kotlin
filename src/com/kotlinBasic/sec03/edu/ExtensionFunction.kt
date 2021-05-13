package com.kotlinBasic.sec03.edu

fun main(){
    val source = "Hello World"
    val target = "Kotlin"
    println(source.getLongString(target))
}
fun String.getLongString(target: String): String =
    if(this.length > target.length) this else target