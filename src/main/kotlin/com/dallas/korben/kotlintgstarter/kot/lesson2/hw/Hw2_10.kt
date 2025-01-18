package com.dallas.korben.kotlintgstarter.kot.lesson2.hw

/**
 * Написаь перегруженный метод sort, который возвращает отсортированный список чисел по возрастанию
 * Тип возвращаемой коллекции - List - неизменяемый
 * Разные методы должны принимать Коллекцию, Массив, Массив переменной длинны
 *
 * Если передаваемая коллекция содержит одинаковые элементы, они должны сохраниться
 */
fun main() {

    val sortedArray = sort(arrayOf(15, 0, 2, 2, 5, 3, 7, 6, 2, 5, 99))

    val sortedVararg = sort(5, 7, 0, 1, -2, 16)

    val sortedList = sort(listOf(-6, 15, 11, 150, 4, 4, 15, 0))

    println()
}

private fun sort(array: Array<Int>): List<Int> {
    return doSort(array.toList())
}

private fun sort(vararg array: Int): List<Int> {
    return doSort(array.toList())
}

private fun sort(list: List<Int>): List<Int> {
    return doSort(list)
}

private fun doSort(list: List<Int>): List<Int> {
    val arrayLength = list.size
    val sortedList: MutableList<Int> = ArrayList()
    sortedList.addAll(list)

    for (i in 1 until sortedList.size) {
        for (j in 0 until arrayLength - i) {
            if (sortedList[j] > sortedList[j + 1]) {
                val tmp = sortedList[j]
                sortedList[j] = sortedList[j + 1]
                sortedList[j + 1] = tmp
            }
        }
    }
    return sortedList.toList()
}

