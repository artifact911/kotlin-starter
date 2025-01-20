package com.dallas.korben.kotlintgstarter.kot.lesson4.p3

import java.time.LocalDate

class Employee(val name: String, var position: String, val yearOfOffer: LocalDate) {

    val skill: Int
        get() = LocalDate.now().year - yearOfOffer.year
}