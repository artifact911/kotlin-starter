package com.dallas.korben.kotlintgstarter.kot.lesson2

/**
 * when - аналог switch
 */
fun main() {
    nameOfSeason()
    indexOfSeason()
    state()
}

fun nameOfSeason() {
    val nameOfMonth = "Сентябрь"

    val season = when (nameOfMonth) {
        "Декабрь", "Январь", "Февраль" -> {
            "Зима"
        }

        "Март", "Апрель", "Май" -> {
            "Весна"
        }

        "Июнь", "Июль", "Август" -> {
            "Лето"
        }

        "Сентябрь", "Октябрь", "Ноябрь" -> {
            "Осень"
        }

        else -> {
            "Не найдено"
        }
    }

    println(season)
}

fun indexOfSeason() {
    val indexOfSeason = 5

    val season = when (indexOfSeason) {
        12, 1, 2 -> {
            "Зима"
        }

        in 3..5 -> {
            "Весна"
        }

        in 6..8 -> {
            "Лето"
        }

        in 9..11 -> {
            "Осень"
        }

        else -> {
            "Не найдено"
        }
    }

    println(season)
}

fun state() {
    val temp = 80

    val ifState = if (temp < 0) {
        "Твердое"
    } else if (temp < 100) {
        "Жидкое"
    } else {
        "Газообразное"
    }

    println(ifState)

    val whenState = when {
        temp < 0 -> "Твердое"
        temp < 100 -> "Жидкое"
        else -> "Газообразное"
    }

    println(whenState)
}