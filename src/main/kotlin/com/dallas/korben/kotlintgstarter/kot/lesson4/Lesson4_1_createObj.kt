package com.dallas.korben.kotlintgstarter.kot.lesson4

import com.dallas.korben.kotlintgstarter.kot.lesson4.p1.Dog
import com.dallas.korben.kotlintgstarter.kot.lesson4.p1.User

fun main() {
    val user = User()
//    user.name = "Korben"
    user.age = 1
    println("Имя: ${user.name} Возраст: ${user.age}")

    hwDog()
}

/**
 * Создать класс Dog с филдами кличка, возраст и вес
 *
 * Переопределить гетерры и сеттеры так, чтобы:
 * - возраст и вес нельзя установить меньше нуля
 * - при получении клички сеталась кличка с Большой буквы
 */
private fun hwDog() {
    val dog = Dog()
    dog.name = "zurAB"
    dog.age = -1
    dog.weight = 1.1f

    println("Name is ${dog.name} Age is ${dog.age} Weight is ${dog.weight}")
}