package com.dallas.korben.kotlintgstarter.kot.lesson4.p1

class Dog {

    var name = ""
        set(value) {
            if (value.isNotBlank()) {

                field = value.lowercase().replaceFirstChar { firstChar ->
                    firstChar.uppercase()
                }

            }
        }
    var age = 0
        set(value) {
            if (value > 0) field = value
        }
    var weight = 0f
        set(value) {
            if (value > 0) field = value
        }
}