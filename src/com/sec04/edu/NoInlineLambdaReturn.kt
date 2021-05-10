package com.sec04.edu

fun main() {
    retFunc2()
}
fun inlineLambda2(a: Int, b: Int, out: (Int, Int) -> Unit){ //이제는 인라인 함수 아님
    out(a, b)
}
fun retFunc2(){
    println(" Start of retFunc ")
    inlineLambda2(13, 3) lit@{ //람다식 블록의 시작 부분에 라벨 지정
            a, b ->
        val result = a + b
        if(result > 10) return@lit //라벨을 사용한 블록의 끝부분으로 반환
        println(" result > $result")
    } //이 부분으로 빠져나감
    println(" End of retFunc ") //실행됨
}