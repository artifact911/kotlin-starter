package com.dallas.korben.kotlintgstarter.kot.lesson3

/**
 * filter() - функция коллекции, которая принимает в себя другую функцию-предикат
 * и возвращает новый лист с элементами удовлетвоярющими предикату
 *
 * Если функция принимает функцию и эта функция последняя в аргументах, то
 * круглые скобки можно не писать
 * listOfNum.filter { it % 2 == 0 }
 *
 * val listOfNum = (0..100).toList() - так тож можно создать коллекцию чисел
 *
 * map() - может преобразовать коллекцию в любую другую (преобразовав все содержимое)
 *
 * sorted() - отсортирует и вернет новый массив
 *
 * sortedDescending() - отсортирует в обратном порядке
 */
fun main() {

    filterFun()
    mapFun()
    sorting()

}

private fun sorting() {
    val array1 = mutableListOf(-1, 2, -7, 500, 13, 0)

    val asc = array1.sorted()
    println(asc.joinToString())

    val desc = array1.sortedDescending()
    println(desc.joinToString())
}

private fun mapFun() {
    val listOfNum = (0..100).toList()

    // удвоим каждый элемент списка и положим в новый список
    val doubledNum = listOfNum.map { it * 2 }

    println(doubledNum.joinToString())

    // преобразуем коллекцию в массив стрингов
    val employees = listOfNum.map { "Employee №$it" }
    println(employees.joinToString())
}

private fun filterFun() {
    val listOfNum = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNum.add(i)
    }

    // Нужно из листа получить все четные и сложить в другой лист
    val listOfEvenNums = listOfNum.filter { it % 2 == 0 }
    println(listOfEvenNums.joinToString())
}