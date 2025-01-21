package com.dallas.korben.kotlintgstarter.kot.lesson4

import com.dallas.korben.kotlintgstarter.kot.lesson4.p6.NotDataStudent
import com.dallas.korben.kotlintgstarter.kot.lesson4.p6.Student

fun main() {
    val student1 = Student("John", "Doe", 42)
    val student2 = Student("John", "Doe", 42)
    val (name, lastName, id) = student1

    val student3 = student2.copy(id = 10)

    println(name)
    println(lastName)

    println(student1)
    println(student2)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1 == student2)
    println(student1 === student2)

    println("********")
    copyMy()
}

/**
 * Создать notData класс и переопределить самомтоятельно метод copy()
 */
private fun copyMy() {
    val student1 = NotDataStudent("John", "Doe", 42)
    val student2 = student1.copy(id = 10)
}
