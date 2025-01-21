package com.dallas.korben.kotlintgstarter.kot.lesson4

import com.dallas.korben.kotlintgstarter.kot.lesson4.p7.Month.*
import com.dallas.korben.kotlintgstarter.kot.lesson4.p7.Season.*

fun main() {
    val month = JANUARY
    val season = when (month) {
        DECEMBER, JANUARY, FEBRUARY -> DECEMBER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST-> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
    }

    println(season)
}
