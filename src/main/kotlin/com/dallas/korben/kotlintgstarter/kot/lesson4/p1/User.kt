package com.dallas.korben.kotlintgstarter.kot.lesson4.p1

class User {

    var age: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    var name: String? = null
        get() = field ?: "N/A"
}