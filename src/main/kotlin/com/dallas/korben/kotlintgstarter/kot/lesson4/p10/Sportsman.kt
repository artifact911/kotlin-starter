package com.dallas.korben.kotlintgstarter.kot.lesson4.p10

class Sportsman {
    fun callWaterProvider(waterProvider: WaterProvider) {
        println("Зову водоноса...")
        waterProvider.provideWater()
    }

    // тут хорошо подходит inline, т.к. без него создался бы объект анонимного класса
    // WaterProvider и у него вызвался бы метод.
   inline fun callWaterProvider(callFun: () -> Unit) {
       callFun()
    }
}