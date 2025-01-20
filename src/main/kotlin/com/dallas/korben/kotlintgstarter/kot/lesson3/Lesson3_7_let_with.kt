package com.dallas.korben.kotlintgstarter.kot.lesson3

/**
 * Функции высшего порядка
 * Это функции, которые управляют другими функциями. Функция, которая принимает в себя функцию
 * или возвращает функцию является функцией высшего порядка
 *
 * let() - позволяет что-то делать с глобальной переменной, если она не null,
 * обращаясь к ней через it. Внутри этого блока it мы можем быть уверены, что она не null
 *
 * with() - принимает аргумент и теперь внутри тела with мы можем не упоминать имя
 * этого аргумента. Все дальнейшие вызовы могут вызываться напримую. Это как мы использовали бы
 * this.add(), только и this использовать не надо
 */

var name: String? = null

fun main() {
    letEx()
    withEx()
}

private fun letEx() {
    name?.let {
        if (it.length > 5) {
            println("$it.length > 5")
        }
    }
}

private fun withEx() {
    val list = mutableListOf<Int>()

    with(list) {
        for (i in 0 until 1000) {
            this.add((Math.random() * 100).toInt())
        }

        println("Первое значение ${first()}")
        println("Первое значение ${last()}")
        println("Среднее всех чисел ${average()}")
        println("Sum numbers ${sum()}")
        println("Max number ${max()}")
        println("Min number ${min()}")
    }

}
