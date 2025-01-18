package com.dallas.korben.kotlintgstarter.kot.lesson2.hw

/**
 * Создать массив чисел и заполнить его от 300 до 600
 * Вывести на экран все числа в порядке убывания, которые кратны 5
 */
fun main() {
//    trainee()

    val array = arrayOfNulls<Int?>(301)

    for ((index, value) in (300..600).withIndex()) {
        array[index] = value
    }

    println(array.joinToString())

    for (i in array.size - 1 downTo 0 step 5) {
        println(array[i])
    }
}

/**
 * Создать массив и заполнить его числами от 0 до 100
 */
fun trainee() {
    val array = arrayOfNulls<Int>(101)

    for (i in 0 until array.size) {
        array[i] = i
    }
    println(array.joinToString())

    val arrayString = arrayOf("a", "b", "c")

    // i - это велью
    for (i in arrayString) {
        println(i)
    }

    // i это индекс
    for (i in 0 until arrayString.size) {
        println(i)
    }

    // ввели два аргумента
    for ((index, value) in arrayString.withIndex()) {
        val template = "индекс: $index / value: $value"
        println(template)
    }
}