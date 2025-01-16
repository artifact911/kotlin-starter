package com.dallas.korben.kotlintgstarter.kot.lesson2.hw

/**
 * Даны 3 nullable строки
 * Посчитать и вывести на экран сумму длин этих строк
 */
fun main() {
    val str1: String? = null
    val str2: String? = "null"
    val str3: String? = ""

    var allLength = (str1?.length?:0) + (str2?.length?:0) + (str3?.length?:0)

    println(allLength)
}