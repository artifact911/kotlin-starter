package com.dallas.korben.kotlintgstarter.kot.lesson4

import com.dallas.korben.kotlintgstarter.kot.lesson4.p3.Cat
import com.dallas.korben.kotlintgstarter.kot.lesson4.p3.Employee
import java.time.LocalDate

fun main() {
    val cat = Cat("Барсик", 10, 3f);
    cat.printInfo()
    println(cat.isOld)
    cat.age = 15
    println(cat.isOld)

    hwEmployee()
}

/**
 * Создать класс Работник, конструктор которого будет содержать обязательные поля
 * Имя, должность и год устройства на работу
 *
 * Добавить свойстро стаж, которое будет высчитываться как текущий год минус год устройства на работу
 *
 * В main создать extension-fun, которая будет выводит полное инфо о работнике
 */
private fun hwEmployee() {
    val employee = Employee("Korben", "Welder", LocalDate.of(1999, 1, 1))
    employee.printInfo()
}

private inline fun Employee.printInfo() =
    println("Имя: $name, " +
            "Должность: $position, " +
            "Год устройства на работу: ${yearOfOffer.year}, " +
            "Стаж: $skill")