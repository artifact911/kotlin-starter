package com.dallas.korben.kotlintgstarter.kot.lesson2

/**
 * Если метод выполняет всего одно действие, то его можно написать в одну строку
 *
 * Массив аргументов переменной длины в Java передавался через точки. В котлин пишем vararg
 */
fun main() {
    println(max(2, 5))

    val substringByIndexes = substringByIndexes("KorbenDallas", 1, 7)
    println(substringByIndexes)

    println(sum(1, 3, 5))
}

private fun max(a: Int, b: Int) = if (a > b) a else b

private fun substringByIndexes(s: String, from: Int, to: Int) = s.substring(from, Math.min(to, s.length))

//private fun sum(vararg numbers: Int) = numbers.sum()
private fun sum(vararg numbers: Int): Int {
    var sum = 0

    for (value in numbers) {
        sum += value
    }
    return sum
}