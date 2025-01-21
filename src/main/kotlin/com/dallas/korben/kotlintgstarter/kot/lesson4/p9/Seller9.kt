package com.dallas.korben.kotlintgstarter.kot.lesson4.p9

class Seller9(name: String, age: Int) : Worker9(name, age), Cleaner {

    override fun work() {
        println("Продаю товар")
    }

    override fun clean() {
        println("Убираюсь...")
    }
}