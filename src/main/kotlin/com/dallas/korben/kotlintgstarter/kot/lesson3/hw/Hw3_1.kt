package com.dallas.korben.kotlintgstarter.kot.lesson3.hw

/**
 * Создать лямбда выражения и сохранить их в переменные, а затем вызвать их
 *
 * 1 Принимает две стороны прямоугольника и возвращает периметр
 *
 * 2 Принимает имя и выводит на экран "Привет <имя>!". Ничего не возвращает
 *
 * 3 Принимает массив чисел и возвращает отсортированный по убыванию
 */
fun main() {

    // task 1
    val perimeter: (Int, Int) -> Int = { a, b -> (a + b) * 2 }
    println(perimeter(3, 2))

    // task 2
    val hello: (String) -> Unit = { println("Привет $it!") }
    hello("Korben")

    // task 3
    val sort: (Array<Int>) -> Array<Int> = { sortArray(it) }
    println(sort(arrayOf(1, 2, 3)).joinToString())
}

private fun sortArray(array: Array<Int>): Array<Int> {
    array.sort()
    array.reverse()
    return array
}