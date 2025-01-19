package com.dallas.korben.kotlintgstarter.kot.lesson2.hw

/**
 * Создать метод, который возвращает объем параллелепипеда.
 * В качестве параметра можно передать от 1 до 3 сторон
 *
 * Если передана 1 сторона, значит все стороны равны
 * Если 2 - считается: что первая и третья равны
 *
 * Метод должен быть 1 (без перегрузок)
 * Метод должен быть написан в одну строку без return
 */
fun main() {
    println(scoreVolume(2))
    println(scoreVolume(2, 2, 1))
    println(scoreVolume(2, 1))

}

private fun scoreVolume(
    a: Int,
    b: Int = 0,
    c: Int = 0
) = if (b > 0 && c > 0) a * b * c
else if (b > 0) a * a * b
else a * a * a

// notMy decision
private fun volume(a: Int, b: Int = a, c: Int = a) = a * b * c
