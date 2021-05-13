package com.stdLibrary

fun <T> find(a: Array<T>, Target: T): Int{
    for(i in a.indices){
        if(a[i] == Target)
            return i
    }
    return -1
}
fun main() {
    //arrayOf(): 배열을 위한 클래스, 여러 개의 요소를 정의
    val arr1: Array<String> = arrayOf("Apple", "Banana", "Cherry")
    val arr2: Array<Int> = arrayOf(1, 2, 3)

    //indices: 배열의 유효 범위를 반환
    println("arr1.indices = ${arr1.indices}")
    println(find<String>(arr1, "Cherry"))
    println(find(arr2, 2))
}