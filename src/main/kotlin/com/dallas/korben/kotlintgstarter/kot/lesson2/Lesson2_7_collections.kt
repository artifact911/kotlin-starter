package com.dallas.korben.kotlintgstarter.kot.lesson2

/**
 * Массив в котлин - это обычный класс. Подробнее в createArray()
 * В остальном массивы работают так же, как и в Java. просто следует массив либо сразу инициализировать
 * нужными значениями, либо сразу указывать тип содержимого массива
 *
 * Коллекции
 * List<Int> = ArrayList<Int>() - интерфейсы List, Set и Map в котлин являются неизменяемыми.
 * Для создания изменяемой коллекции нужно использовать MutableList, MutableSet, MutableMap
 */
fun main() {
//    createArray()
    collectionArrayList()
}

fun createArray() {

    // Создали массив
    val array = arrayOf(1, 2, 3)
    array[2] = 10
    println(array[2])

    // В этот массив мы не можем положить null, т.к. коспилятор на этапе создания массива
    // определил его тип, как Int-ненуллабельный
    // Что бы положить в него null, можно сделать следующее:

    // 1.1 - Явно задать тип массива, как <Int?>
    val arrayNullable1: Array<Int?> = arrayOf(1, 2, 3)
    arrayNullable1[2] = null
    // 1.2
    val arrayNullable2 = arrayOfNulls<Int?>(10)
    arrayNullable2[0] = null
}

fun collectionArrayList() {
    val listOfNumbers = ArrayList<Int>()
    listOfNumbers.add(2)
    println(listOfNumbers.get(0))

    // listOfNumbers.get(0) в котлин рекомендуется писать как в массивах:
    println(listOfNumbers[0])

    // создание изменяемого листа:
    // 1
    val listOfMutableNumbers: MutableList<Int> = ArrayList()
    listOfMutableNumbers.add(3)
    println(listOfMutableNumbers[0])

    // 2
    val listOfMutableNumbers2 = mutableListOf(1, 2, 3)
    listOfMutableNumbers2.add(5)
    println(listOfMutableNumbers2)

}