package com.dallas.korben.kotlintgstarter.kot.lesson4.p9

class Programmer9(var lang: String, name: String, age: Int) :
    Worker9(name, age),
    Cleaner {

    override fun work() {
        println("Пишу код на $lang")
    }

    override fun clean() {
        println("Убираюсь...")
    }
}