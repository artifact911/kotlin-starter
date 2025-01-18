package com.dallas.korben.kotlintgstarter.kot.lesson2.hw

/**
 * Дано текущее время (n часов) и состояние погоды (хорошая или плохая)
 * В зависимсоти от времени и погоды вывести строку:
 * Если сейчас день и хорошая: хоршая-гулять
 * Если сейчас день и плохая: плохая-читать книгу
 * Если ночь - спать, независимо от погоды
 */
fun main() {
    val currentTime = 22
    val currentWeather = "Плохая"

    when {
        currentTime in 10..21 && currentWeather.equals("Хорошая")
            -> println("хоршая-гулять")
        currentTime in 10..21 && currentWeather.equals("Плохая")
            -> println("плохая-читать книгу")
        currentTime > 21 || currentTime < 10
            -> println("спать")
    }
}