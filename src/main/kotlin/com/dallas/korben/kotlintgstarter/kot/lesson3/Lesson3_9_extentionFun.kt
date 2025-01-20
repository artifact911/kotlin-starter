package com.dallas.korben.kotlintgstarter.kot.lesson3

/**
 * extension функция - позволяет добавть функионала классу
 *
 * Синтаксис:
 * Int.newFun() - теперь у int есть функция newFun()
 */
fun main() {
    println(28.isPrime())

    // протестим myWith на стринге
    val str = "Korben"
    myWith(str) {
        println(uppercase())
    }
}

/**
 * Создать extension-функию, которая вычисляет, является ли число простым
 * Простое число делится только на себя и на 1
 */
private fun Int.isPrime(): Boolean {
    if (this <= 3) return true

    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}

/**
 * Реализуем свой собственный with()
 *
 * 1 На вход отдаем тип T, над которым будем производить операцию
 * 2 Операция расширяет класс T и возвращает R
 * 3 На себе же вызываем операцию
 */
private inline fun <T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}


