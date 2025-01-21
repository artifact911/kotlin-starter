package com.dallas.korben.kotlintgstarter.kot.lesson4.p8

class Programmer(var lang: String, name: String, age: Int) : Worker(name, age) {

    override fun work() {
        println("Пишу код на $lang")
    }
}