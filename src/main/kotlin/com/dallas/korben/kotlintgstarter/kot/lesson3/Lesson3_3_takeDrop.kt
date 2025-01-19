package com.dallas.korben.kotlintgstarter.kot.lesson3

/**
 * Бесконечные последовательности
 *
 * generateSequence (0) { it + 2 }
 * (0) - Первым аргументом мы передали точку входа - т.е. мы хотим работать с интами и начать с 0.
 * { it + 2 } - лямбдой мы говорим, что после нулю, генерируй нам следующее число больше текущего на 2
 *
 * Эта коллекция не проиницализируется, т.к. у нее ленивая инициализация.
 * Ее инициализация происходит только в момент, когда мы обращаемся к элементам этой последовательности
 *
 * Бесконечные последовательности это не только числа, Можем передать любой объект
 *
 * take() - берет указанное количество первых элементов из массива
 * takeLast() - берет указанное количество последних элементов из массива
 *
 * drop() - выкидывает указанное количество первых элементов из массива и возвращает оставшиеся
 * dropLast() - выкидывает указанное количество последних элементов из массива и возвращает оставшиеся
 */
fun main() {

    // Обычный массив с числами
    val array = (0..1000).toList()

    // создаем бесконечную последовательность
    val employees = array.map { "Employee: $it" }

    // взяли первых 30 элементов
    val take30 = employees.take(30)

    // взяли последних 30 элементов
    val takeLast30 = employees.takeLast(30)

    // выкинули первых 30 элементов
    val drop30 = employees.drop(30)

    // выкинули последних 30 элементов
    val dropLast30 = employees.dropLast(30)



    val arrayInfinity = generateSequence (0) { it + 2 }
    val employeesInfinity = arrayInfinity.map { "Employee: $it" }

    val take10 = employeesInfinity.take(10)
    println(take10.joinToString())

    // тут все упадет, т.к. мы мытаемся из бесконечной последовательности дропнуть
    // 980 последних, но последних нет и мы будем получать генерацию всех предыдущих
    // раскомменти for, чтоб убедиться
    val drop980 = employeesInfinity.drop(980)
//    for (i in drop980) {
//        println(i)
//    }

    // бесконечная последовательности из символов
    val arrayChar = generateSequence ('A') { it + 1 }
    val takeChar50 = arrayChar.take(50)
    println(takeChar50.joinToString())

    // sequence с одним аргументом-функцией
    // Например нам надо сгенерить последовательность из рандомных чисел из диапазона
    val randomNumsArray = generateSequence {
        (Math.random() * 100).toInt()
    }
    println(randomNumsArray.take(10).joinToString())

}