package com.dallas.korben.kotlintgstarter.kot.lesson3

/**
 */
fun main() {
    listFlatMap()
    mapWorking()
}

private fun listFlatMap() {
    val revenueByWeek = listOf(
        listOf(12, 5, 5, 9, 12),
        listOf(8, 5, 5, 9, 8),
        listOf(11, 5, 5, 9, 11),
        listOf(7, 5, 5, 9, 7)
    )

    val avg = revenueByWeek.flatMap { it }

    // в данном случае flatMap и flatten равнозначны
    // так можно сделать, т.к. с it мы ничего не делаем
    val avg2 = revenueByWeek.flatten()
    avg.average()
    println(avg.average())
}

private fun mapWorking() {

    // Изменяемая - создание 1 - по Java
    val data = mutableMapOf<String, List<Int>>()
    data.put("file_1", listOf(13, 12, 41, 23, 13))
    data.put("file_2", listOf(15, 12, 41, 23, 15))
    data.put("file_2", listOf(60, 12, 41, 23, 60))

    // Изменяемая - Создание по Колтину_1
    val data1 = mutableMapOf<String, List<Int>>()
    data1["file_1"] = listOf(13, 12, 41, 23, 13)
    data1["file_2"] = listOf(15, 12, 41, 23, 15)
    data1["file_3"] = listOf(60, 12, 41, 23, 60)

    // НЕизменяемая - Создание по Колтину_2
    val data2 = mapOf(
        "file_1" to listOf(13, 12, 41, 23, 13),
        "file_2" to listOf(15, 12, 41, 23, 15),
        "file_3" to listOf(60, 12, 41, 23, 60)
    )

    // НЕизменяемая - Создание по Колтину_3
    val data3 = mapOf(
        Pair("file_1", listOf(13, 12, 41, 23, 13)),
        Pair("file_2" , listOf(15000, -12, 41, 23, 15)),
        Pair("file_3", listOf(60, 12, 41, 23, 60))
    )

    // Посчитаем среднее всех интов в списках
    val avg2 = data2.flatMap { it.value }.average()
    println(avg2)

    // представим, что в одном из листов есть отрицательное битое значение.
    // мы хотим такие списки не учитывать
    // поставим фильтер того, что будет добавляться в спиок всех интов

    // получили мапу без битых значений
    // entry.value.all { it > 0 } - у списка метод all применяет фильтр ко всем элементам коллекции
    // и если хоть один не подошел под фильтр, скипнет весь список
    // any() - сработает в данном случае криво, т.к. он пропустит весь лист, если хотя бы один
    // элемент из списка подойдет к фильтру
    val filtered = data3.filter { entry -> entry.value.all { it > 0 } }
    // Достали все инты из листов в общий список
    val intList = filtered.flatMap { it.value }
    // посчитали avg всех интов в списке
    println(intList.average())
}