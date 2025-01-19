package com.dallas.korben.kotlintgstarter.kot.lesson2

/**
 * Отличие от Java только в том, что try-catch это тож выражение
 */
fun main() {
    sum("10", "20")
    sum("10", "qqq")
}

fun sum(a: String, b: String): Int {
    val result = try {
        val numA = a.toInt()
        val numB = b.toInt()
        numA + numB
    } catch (e: NumberFormatException) {
        0
    }
    println(result)
    return result
}