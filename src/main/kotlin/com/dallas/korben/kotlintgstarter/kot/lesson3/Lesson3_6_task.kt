package com.dallas.korben.kotlintgstarter.kot.lesson3

/**
 */
fun main() {
    lesson36PrintInfo()
    println()
    lesson36PrintInfoNotMy()
}

/**
 * Создать объект Map, в котором хранятся значения еженедельной выручки за разные месяцы.
 * Ключ - название месяца, значение - массив чисел(выручка за каждую неделю)
 *
 * В некоторых месяцах намеренно допустит ошибку (присвоить отрицательное значение в каком-то месяце)
 *
 * Создать метод printInfo(data: Map<String, List<Int>>), который создает отчет и выводит его в консоль.
 * Отчет должен содержать следующие данные:
 * - Средняя выручка в неделю за все месяцы
 * - средняя выручка в месяц за все месяцы
 * - минимальная выручка за месяц и в каком это было месяце
 * - максимальная выручка за месяц и в каком это было месяце
 * - Названия месяцев, в данных которых содержаться ошибки
 *
 * - не считать цифры месяцев с ошибками
 */
private fun lesson36PrintInfo() {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )

    val validValues = data.filter { entry -> entry.value.all { it > 0 } }
    val invalidValues = data.filter { entry -> !entry.value.all { it > 0 } }

    val avgWeek = validValues.flatMap { it.value }.average()

    // мое
    val sumMonth = validValues.map { it.value.sum() }
    val avgMonth = sumMonth.average()
    val maxMonth = sumMonth.max()
    val maxMonthName = validValues
        .filter { entry -> entry.value.sum() == maxMonth }
        .map { it.key }
        .first()

    // Андрей Иванович
    val maxMonthName1 = validValues
        .maxBy { entry -> entry.value.reduce((Int::plus)) }
        .key

    val minMonth = sumMonth.min()
    val minMonthName = validValues
        .minBy { entry -> entry.value.reduce((Int::plus)) }
        .key


    val invalidMonthJoin = invalidValues.keys.toList().joinToString(separator = ", ")

    println("Средняя выручка в неделю $avgWeek")
    println("Средняя выручка в месяц $avgMonth")
    println("Максимальная выручка в месяц $maxMonth. Была в $maxMonthName")
    println("Минимальная выручка в месяц $minMonth. Была в $minMonthName")
    println("Ошибки произошли в $invalidMonthJoin")
}

private fun lesson36PrintInfoNotMy() {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )

    // это вот он сделал лучше
    val validValues = data.filterNot { it.value.any { it < 0 } }
    val invalidValues = data.filter { it.value.any { it < 0 } }

    val avgWeek = validValues.flatMap { it.value }.average()
    println("Средняя выручка в неделю $avgWeek")

    val sumMonth = validValues.map { it.value.sum() }
    val maxMonth = sumMonth.max()
    val minMonth = sumMonth.min()
    val avgMonth = sumMonth.average()

    val maxMonthName = validValues
        .filter { it.value.sum() == maxMonth }
        .keys
    val minMonthName = validValues
        .filter { it.value.sum() == minMonth }
        .keys

    println("Средняя выручка в месяц $avgMonth")
    println("Максимальная выручка в месяц $maxMonth. Была в $maxMonthName")
    println("Минимальная выручка в месяц $minMonth. Была в $minMonthName")
    println("Ошибки произошли в ${invalidValues.keys}")
}
