package com.sec07.coffeeMaker

/**
 * 인터페이스
 * 클래스
 * 위임
 */
class CoffeeMaker(val coffeeModule: CoffeeModule) {

    fun brew(){
        val theSiphon : Thermosiphon = coffeeModule.getThermosiphon()
        theSiphon.on()
        theSiphon.pump()
        println("Coffee, here! Enjoy~!")
        theSiphon.off()
    }
}

fun main() {
    val coffeeMaker = CoffeeMaker(MyDripCoffeeModule())
    coffeeMaker.brew()
}