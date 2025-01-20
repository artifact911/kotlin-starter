package com.dallas.korben.kotlintgstarter.kot.lesson4.p3

class Cat(val name: String, var age: Int, val weight: Float) {

    val isOld: Boolean
        get() = age >= 12

    fun printInfo() = println("Кличка: $name, Возраст: $age, Вес: $weight")
}