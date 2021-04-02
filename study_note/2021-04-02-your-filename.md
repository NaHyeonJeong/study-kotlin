# 2021.04.02.Fri
## 코틀린의 function
### 작성 방법
솔직히 다른 언어 공부해봐서 함수 작성법은 비슷하다고 느낌
```kotlin
fun 함수이름(매개변수1: 자료형, 매개변수2: 자료형): 반환값{
    // 원하는 처리
    return // 반환
}
```
조금 좋은 점은 이것 저것 해볼 수 있다는 점이 좋았음   
예를 들어 엄청나게 간추린 함수를 쓸 수 있다는 것
```kotlin
fun sum(a: Int, b: Int): Int = a + b // return a + b
```
그리고 C나 Java로 치면 void 형인데 **Unit** 이라는 자료형을 통해 반환값이 없음을 알림 (생략 가능)
```kotlin
fun printSum(a: Int, b: Int): Unit {
    // 반환 값 없이 찍기만 하는 함수임!
    println("sum of $a and $b is ${a + b}")
}
```
### 코틀린 함수의 다양한 매개변수(인자) 사용
#### default 값
코틀린에서는 (다른 언어도 그런지는 잘 모르겠는데) 매개변수를 만들 때 값을 넣어두면 내가 호출할 때 딱히 값을 입력하지 않는다면 
매개변수 선언 시 작성했던 값이 기본으로 들어감
```kotlin
fun add(name: String, email: String = "default") {
    // add("홍길동") 이러면 email 인수에는 "default" 가 들어감
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}
```
#### 특정한 값만 선택적으로
그리고 코틀린에서는 함수를 호출할 때 특정 값만 인수로 입력해 줄 수 있었음   
밑의 예시를 보면 defaultArgs를 호출할 때 3개의 인수를 다 입력하는게 아니라 2개만 선택적으로 입력함
```kotlin
fun main() {
    defaultArgs(x = 200, z = 400)
}
fun defaultArgs(x: Int = 100, y: Int = 200, z: Int = 300) {
    println(x + y + z)
}
```
#### 가변인자(Variable Argument) 사용
가변인자를 사용하기 위해서 vararg 라는 키워드를 매개변수 앞에 적어주면 사용 가능
```kotlin
fun main() {
    normalVarargs(1, 2, 3, 4)
    normalVarargs(1, 2, 3)
}
// 입력되는 값의 개수 만큼 찍는 함수. 4개의 인수면 4번, 3개의 인수면 3개
fun normalVarargs(vararg counts: Int) {
    for(num in counts)
        print("$num")
    print("\n")
}
```
### 함수와 stack, heap?
함수의 각 정보는 프레임(frame)이라는 정보로 스택(stack) 메모리의 높->낮 주소로 거꾸로 자라듯이 채워짐   
코드를 예시로 보면...
```kotlin
fun main() {
    val num1 = 10
    val num2 = 3
    val result: Int

    result = max(num1, num2)
    println(result)
}

fun max(a: Int, b: Int) = if(a > b) a else b
```
스택에는 main() 함수 프레임이 제일 아래에 생성되고 그 위에 max() 함수 프레임이 **생성**됨   
**소멸**은 max() 먼저, 마지막에 main() 순으로 소멸
### 기억할 소소한(?) 내용들
함수 선언 시 = 매개변수   
함수 호출 시 = 인자(인수)   
스택 오버플로우(stack overflow) : 낮 -> 높 주소인 힙 영역과 높 -> 낮 주소인 스택 영역의 겹침

## 함수형 프로그래밍
순수 함수를 작성하여 프로그램의 부작용을 줄이는 프로그래밍 기법
### 순수 함수
부작용이 없는 함수 : 함수가 같은 인자에 대하여 항상 같은 결과를 반환함   
순수 함수 : 부작용이 없는 함수가 함수 외부의 어떤 상태도 바꾸지 않음. 스레드에 사용해도 안전, 코드 테스트 쉬움
#### 순수 함수 조건
* 같은 인자에 대하여 항상 같은 값 반환
* 함수 외부의 어떤 상태도 바꾸지 않음
```kotlin
// 순수 함수의 예시
fun sum(a: Int, b: Int){
    // 동일 인자 a, b를 입력받아 항상 a + b를 출력 (부작용 없음)
    return a+ b
}
// 순수 함수가 아닌 예시
fun check() {
    val test = User.grade() // 외부의 User 객체 사용
    if(test != null) process(test) // 변수 test는 User.grade()의 실행 결과에 따라 달라짐
}
```
### 람다식(Lamda Expressions)
람다 대수(Lamda Calculus)에서 유래   
수학에서 말하는 람다 대수 : 이름이 없는 함수, 2개 이상의 입력을 1개의 출력으로 단순화   
함수형 프로그래밍의 람다식 : 다른 함수의 인자로 넘기는 함수, 함수의 결과값으로 반환하는 함수, 변수에 저장하는 함수   
### 일급 객체(First Class Citizen)
* 함수의 인자로 전달할 수 있다
* 함수의 반환값에 사용할 수 있다
* 변수에 담을 수 있다   

함수가 일급 객체면 일급 함수라고 부름   
일급 함수에 이름이 없는 경우 '람다식 함수' 또는 '람다식' 이라고 부름   
즉, 람다식은 일급 객체의 특징을 가진 이름 없는 함수
### 고차 함수(High-order Function)
다른 함수(일반 함수)를 인자로 사용하거나 함수를 결괏값으로 반환하는 함수
```kotlin
fun main(){
    println(highFunc{x, y -> x + y}, 10, 20) // 람다식 함수를 인자로 넘김
}
fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int) = sum(a, b) // sum 매개변수는 함수
```
### 결론(함수형 프로그래밍의 정의와 특징)
* 순수 함수를 사용해야 함
* 람다식을 사용할 수 있음
* 고차 함수를 사용할 수 있음