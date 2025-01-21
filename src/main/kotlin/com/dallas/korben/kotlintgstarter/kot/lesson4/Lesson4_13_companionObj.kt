package com.dallas.korben.kotlintgstarter.kot.lesson4

import com.dallas.korben.kotlintgstarter.kot.lesson4.p13.Calc
import com.dallas.korben.kotlintgstarter.kot.lesson4.p13.Calc.Companion.lengthOfCircle
import com.dallas.korben.kotlintgstarter.kot.lesson4.p13.Calc.Companion.square
import com.dallas.korben.kotlintgstarter.kot.lesson4.p13.MyRandom

fun main() {
    val pi = Calc.PI

    println(square(4))
    println(lengthOfCircle(12.4f))

    check413Hw()
}

/**
 * Создать класс MuRandom, в котором будут следующие статик-методы:
 *
 * 1 Возвращает случайное число в переданном диапазоне
 * 2 Возвращает случайное значение типа Boolean
 * 3 Возвращает случайный день недели (название)
 */
fun check413Hw() {
    println(MyRandom.randomBoolean())
    println(MyRandom.randomInt(5, 99))
    println(MyRandom.randomDayOfWeek())
}
