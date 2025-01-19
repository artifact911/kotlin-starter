package com.dallas.korben.kotlintgstarter.kot.lesson3.hw

fun main() {
    task1Less32()
    task2Less32()

}

/**
 * Создать коллекцию имен
 * В новую коллекцию сложить только те имена, которые начинаются на A
 */
private fun task1Less32() {
    val names = mutableListOf("Alex", "Arnie", "John", "Art", "Bob")

    val filtered = names.filter { it.startsWith("A") }
    println(filtered.joinToString())
}

/**
 * Создать коллекцию на 1000 случайных чисел из диапазона 0..1000
 *
 * Оставить только те числа, которые кратны 5 или 3
 * Эти числа возвести в квадрат
 * Отсортировать коллекцию по убыванию
 * Преобразовать коллекцию в коллекцию<String>
 */
private fun task2Less32() {

    // создали коллекцию
    val sourceList = mutableListOf<Int>()
    for (i in 0..999) {
        sourceList.add((0..1000).random())
    }

    // Оставить только те числа, которые кратны 5 или 3
    val filtered = sourceList.filter { it % 3 == 0 || it % 5 == 0 }

    // Эти числа возвести в квадрат
    val doubled = filtered.map { it * it }

    // Отсортировать коллекцию по убыванию
    val sortedDescending = doubled.sortedDescending()

    // Преобразовать коллекцию в коллекцию<String>
    val strings = sortedDescending.map { it.toString() }



    val toOneMove = sourceList
        .filter { it % 3 == 0 || it % 5 == 0 }
        .map { it * it }
        .sortedDescending()
        .map { "$it" }

    println(toOneMove)
}
