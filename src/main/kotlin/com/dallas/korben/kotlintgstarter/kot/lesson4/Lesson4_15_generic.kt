package com.dallas.korben.kotlintgstarter.kot.lesson4

import com.dallas.korben.kotlintgstarter.kot.lesson4.p15.MyArrayList

fun main() {
    val myList = MyArrayList<String>()

    for(i in 1..10) {
        myList.add("$i")
    }

    for(i in 0 until myList.size()) {
        println(myList.get(i))
    }

    val myList2 = MyArrayList.myListOf("123", "22", 1, 2)
}

