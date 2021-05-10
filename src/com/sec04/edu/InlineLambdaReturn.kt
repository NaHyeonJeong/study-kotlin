package com.sec04.edu

fun main(){
   retFunc()
}
inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit){
    out(a, b)
}
fun retFunc(){
    println(" Start of retFunc ")
    inlineLambda(13, 3){
        a, b ->
        val result = a + b
        if(result > 10) return //retFunc() 자체를 빠져나가버림 : 비지역(non-local) 반환
        println(" result > $result") //실행 못함
    }
    println(" End of retFunc ") //실행 못함
}

