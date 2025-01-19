package com.dallas.korben.kotlintgstarter.kot.lesson2

/**
 * Можно аргументам в методе навешивать значения по умолчанию, и они будут использоваться,
 * если ничего не передали
 *
 * Можно не следовать порядку объявленных аргументов функции, а обращаться к ним напрямую по их имени
 */
fun main() {
    printInfo()
    printInfo("Иванов", "Иван")
    printInfo(name = "Иван", patronymic = "Иванович")
}

fun printInfo(lastName: String = "", name: String = "", patronymic: String = "") {

    if (lastName.isNotEmpty()) {
        println("Фамилия: $lastName")
    }

    if (name.isNotEmpty()) {
        println("Имя: $name")
    }

    if (patronymic.isNotEmpty()) {
        println("Отчество: $patronymic")
    }
}