package com.hj.edu

import com.hj.edu.Person as User
import kotlin.math.PI
import kotlin.math.abs

typealias Hello = String // String 을 Hello 라는 별칭으로 부른다

fun main() {
    val intro: Hello = "안녕"
    val num: Int = 20
    val user1 = User("hyeon Jeong", 23)

    println(PI)
    println(abs(-12.6))

    println("intro: $intro, num: $num")
    println("user info >> name: ${user1.name}, age: ${user1.age}")
}

