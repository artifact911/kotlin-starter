package com.dallas.korben.kotlintgstarter.kot.lesson2

/**
 * for из java с индексами упразнили. Остался foreach, но его модифицировали
 * until - позволяет не включать верхнюю границу числа в for
 * downTo - перебирать с конца массива
 * step - перебирать массив с неким шагом
 *
 * for (i in array) - i - это value значениймассива
 * for (i in 0..100) - i - теперь это индекс
 * см HomeWork
 */
fun main() {
   val array = createAndFillArray()

    printArrayFromStart(array)
    printArrayFromFinish(array)
    printArrayWithStep(array, 7)

    forWithIndexes()
}

fun createAndFillArray(): Array<Int?> {
    val array = arrayOfNulls<Int?>(101)

    // заполнили массив
    for (i in 0..100) {
        array[i] = i
    }

    // заполнили массив, где until не включает верхнюю границу
    for (i in 0 until array.size) {
        array[i] = i
    }

    return array
}

// перебор сначала массива
fun <T> printArrayFromStart(array: Array<T>) {
    for (i in 0 until array.size) {
        println(array[i])
    }
}

// перебор с конца массива
fun <T> printArrayFromFinish(array: Array<T>) {
    for (i in array.size - 1 downTo 0) {
        println(array[i])
    }
}

// перебор с неким шагом
fun <T> printArrayWithStep(array: Array<T>, step: Int) {
    for (i in 0 until array.size step step) {
        println(array[i])
    }
}

/**
 * Представим, что нам нужно обратиться к элементам массива по индексу и умножить элементы на 2
 * Тогда в for можно внедрить индексы
 * Вводим переменную и говорим, что она отвечает за индексы
 */

fun forWithIndexes() {
    val array = arrayOfNulls<Int?>(101)

    // заполнили массив, где until не включает верхнюю границу
    var value = 200
    for (i in 0 until  array.size) {
        array[i] = value
        value++
    }

    println(array.joinToString())

    // теперь i отвечает за value в массиве
    for ((index, values) in array.withIndex()) {

        // i может быть null, поэтому i?
        // знак * тут не сработает, т.к. для null это небезопасно. Юзаем вместо него times()
        array[index] = values?.times(2)
    }

    println(array.joinToString())
}


