package com.oop.sec07.coffeeMaker

class Thermosiphon(heater: Heater) : Pump, Heater by heater {

    override fun pump() {
        if(isHot()){
            println("[Thermosiphon] pumping ... ")
        }
    }

}