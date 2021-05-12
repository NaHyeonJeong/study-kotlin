package com.sec07

//실드 클래스 선언 방법 1
sealed class Result{
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String): Result()
}
class Status: Result() //실드 클래스 상속은 같은 파일에서만 가능
class Inside: Result.Success("Status") //내부 클래스 상속

fun main() {
    val result = Result.Success("Good!")
    val msg = eval(result)
    println(msg)
}

fun eval(result: Result): String = when(result){
    //모든 경우가 열거되었으므로 else 문이 필요 없음
    is Status -> "is process"
    is Result.Success -> result.message
    is Result.Error -> result.message
}