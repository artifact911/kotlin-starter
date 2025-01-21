package com.dallas.korben.kotlintgstarter.kot.lesson4

import com.dallas.korben.kotlintgstarter.kot.lesson4.p10.Sportsman
import com.dallas.korben.kotlintgstarter.kot.lesson4.p10.Transport10
import com.dallas.korben.kotlintgstarter.kot.lesson4.p10.WaterProvider

fun main() {
    travel(object : Transport10("Bus") {
        override fun drive() {
            println("$name driving")
        }

    })

    p10Task()
}

fun travel(transport: Transport10) {
    transport.drive()
}

/**
 * Создайте интерфейс Водонос с одним методом "принести воду"
 *
 * Создайте класс Спортсмен, в отором будет метод "вызвать водоноса". Данный метод принимает
 * объект типа Водонос и вызывает у него метод "принести воду"
 *
 * В main() создать спортсмена и вызвать у него его метод. Водона передать анонимным классом
 */
fun p10Task() {
    val sportsmen = Sportsman()

    sportsmen.callWaterProvider(object : WaterProvider {
        override fun provideWater() {
            println("Меня вызвали")
        }
    })

    sportsmen.callWaterProvider { println("Меня вызвали из переданной функции") }
}
