package com.dallas.korben.kotlintgstarter.kot.lesson4.p10

class Car10(override var name: String = "Машина") : Transport10(name) {
    override fun drive() {
        println("$name едет...")
    }

    fun startEngine(): Boolean {
        println("Запускаю двигатель...")
        return true
    }
}