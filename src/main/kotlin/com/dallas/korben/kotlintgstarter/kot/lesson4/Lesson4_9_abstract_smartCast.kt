package com.dallas.korben.kotlintgstarter.kot.lesson4

import com.dallas.korben.kotlintgstarter.kot.lesson4.p9.Cleaner
import com.dallas.korben.kotlintgstarter.kot.lesson4.p9.Director9
import com.dallas.korben.kotlintgstarter.kot.lesson4.p9.Programmer9
import com.dallas.korben.kotlintgstarter.kot.lesson4.p9.Seller9

fun main() {

    val employee3 = Programmer9("Java", "Ju", 21)
    val employee4 = Programmer9("JS","Ja", 21)
    val employee1 = Seller9("Ja", 21)
    val employee2 = Seller9("Ja", 21)
    val employee5 = Director9("Dr", 50)

    val listOfEmployees = listOf(employee1,
        employee2, employee3, employee4, employee5)

    for (employee in listOfEmployees) {
        employee.work()
    }

    val cleaners = listOfEmployees
        .filter { it is Cleaner }
        .map { it as Cleaner }

    for (employee in cleaners) {
       employee.clean()
    }
}
