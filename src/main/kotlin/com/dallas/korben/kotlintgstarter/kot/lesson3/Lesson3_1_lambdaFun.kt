package com.dallas.korben.kotlintgstarter.kot.lesson3

/**
 * Функции можно класть в переменные.
 * Функции можно передавать аргументами и возвращать из функций
 *
 * Если такая функия принимает только одно значение, что внутри лямбды можно не выдумывать имя
 * этой переменной, компилятор сам создаст ее за нас и у нее будет зарезервированное имя it,
 * которое мы можем теперь использовать
 *
 * Если такая функция ничего не возвращает, то мы указываем в качестве возвращаемого типа Unit
 */
fun main() {
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    println(sum(1, 2))

    val square: (Int) -> Int = { it * it }
    println(square(4))
}