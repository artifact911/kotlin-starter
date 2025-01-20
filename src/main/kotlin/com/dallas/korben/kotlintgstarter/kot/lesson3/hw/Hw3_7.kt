package com.dallas.korben.kotlintgstarter.kot.lesson3.hw

/**
 * За пределами main создать нуллабельную коллекцию чисел
 *
 * Внутри метода main, используя функию with, заполнить ее 1000 случайными значениями
 *
 * Вывести на экран первые 100 четных чисел коллекции (внутри with)
 */

var listOfNums: MutableList<Int>? = mutableListOf()
//var listOfNums: MutableList<Int>? = null

fun main() {

    listOfNums?.let {
        with(it) {
            for (i in 0 until 1000) {
                add((Math.random() * 1000).toInt())
            }

            val result = filter { it % 2 == 0 }.take(100)

            println(result)
        }
    }
}
