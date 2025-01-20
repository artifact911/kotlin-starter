package com.dallas.korben.kotlintgstarter.kot.lesson4

import com.dallas.korben.kotlintgstarter.kot.lesson4.p2.Book
import com.dallas.korben.kotlintgstarter.kot.lesson4.p2.Country

fun main() {
    val country = Country(population = 1_000_000)
    println(country.name)
    println(country.population)

    hwBook()
}

/**
 * Создать класс Книга с конструктором со всеми параметрами: Название, год выпуска, цена
 *
 * При создании объекта только одно поле одинаковое - Название
 * Остальные поля по дефолту null
 *
 * После создания книги невозможно изменить ее название. Остальные поля можно
 */
private fun hwBook() {
    val book = Book("Demo", price = 10)
    println("${book.name}, ${book.year}, ${book.price}")

//    нельзя изменить имя по условию
//    book.name = "newDemo"

    book.year = 1999
    book.price = 21
    println("${book.name}, ${book.year}, ${book.price}")
}