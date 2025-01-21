package com.dallas.korben.kotlintgstarter.kot.lesson4

import com.dallas.korben.kotlintgstarter.kot.lesson4.p8.Worker
import com.dallas.korben.kotlintgstarter.kot.lesson4.p8.Programmer

fun main() {
    employeeInheritance()
}

/**
 * Создать класс Работник, конструктор которого содержит поля:
 * имя и возраст, а также метод work() с дефолтной реализацией
 *
 * Создать класс Программист, который является наследником Работника. Этот класс
 * содержит доп поле "язык программирования". Метод work() будет выводить надпись
 * "Пишу код на ...(язык программирования)"
 *
 * В методе main() создать коллекцию работников Worker и Programmer.
 * В цикле заставить всех работать
 */
private fun employeeInheritance() {
    val worker1 = Worker("Jo", 19)
    val worker2 = Worker("Ji", 21)
    val employee3 = Programmer("Java", "Ju", 21)
    val employee4 = Programmer("JS","Ja", 21)

    val listOfEmployees = listOf(worker1, worker2, employee3, employee4)

    for (employee in listOfEmployees) {
        employee.work()
    }
}
