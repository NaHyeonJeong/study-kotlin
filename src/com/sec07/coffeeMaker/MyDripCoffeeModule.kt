package com.sec07.coffeeMaker

/**
 * 커피 모듈의 기본 인터페이스 + 여러 기능 조합
 */
class MyDripCoffeeModule : CoffeeModule {

    companion object {
        val electricHeater : ElectricHeater by lazy { //지연초기화
            ElectricHeater()
        }
    }

    private val _thermosiphon : Thermosiphon by lazy { //지연초기화
        Thermosiphon(electricHeater)
    }

    //오직 이 메소드에서만 Thermosiphon를 초기화!! (싱글톤)
    override fun getThermosiphon(): Thermosiphon = _thermosiphon

}