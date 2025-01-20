package com.dallas.korben.kotlintgstarter.kot.lesson3

/**
 * inline - делает так, что компилятор просто возьмет функцию изнетри и передаст в нее значение
 * иначе создал бы объект анонимного класса с такой функией, а это дорого
 */
fun main() {
   val result = modifyString("Hello World!") {it.uppercase()}
    println(result)

    val list = (0..100).toList()
    sumAllNums(list) {it.sum()}
}


inline fun modifyString(str: String, modify: (String) -> String): String = modify(str)

inline fun sumAllNums(list: List<Int>, operator: (List<Int>) -> Int): Unit = println(operator(list))