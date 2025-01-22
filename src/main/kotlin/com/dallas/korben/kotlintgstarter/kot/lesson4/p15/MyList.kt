package com.dallas.korben.kotlintgstarter.kot.lesson4.p15

interface MyList<T> {

    fun get(index: Int): T
    fun add(element: T)
    fun remove(element: T)
    fun removeAt(index: Int)
    fun size(): Int
}