package com.sec08

class GenericNull<T>{
    fun equalityFunc(arg1: T, arg2: T){
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>() //non-null
    obj.equalityFunc("Hello", "World")

    val obj2 = GenericNull<Int?>() //null이 가능한 형식
    obj2.equalityFunc(null, 10)
}