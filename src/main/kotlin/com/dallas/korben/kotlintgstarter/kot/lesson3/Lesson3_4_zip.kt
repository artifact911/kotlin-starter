package com.dallas.korben.kotlintgstarter.kot.lesson3

/**
 * zip() Позволяет соеденить два списка вместе. Метод вернет список пар
 * В парах мы можем отбраться к первому и второму элементу пары
 * element.first и element.second соответственно
 */
fun main() {
    val phones = mutableListOf<Long>()
    val names = mutableListOf<String>()

    for (i in 0..1000) {
        names.add("Name_$i")
        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }

    val users = names.zip(phones)
    for (pair in users) {
        println("Имя: ${pair.first} Телефон: +${pair.second}")
    }

}