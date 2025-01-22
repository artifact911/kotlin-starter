package com.dallas.korben.kotlintgstarter.kot.lesson4.p15

class MyArrayList<T> : MyList<T> {

    private var array = arrayOfNulls<Any>(10)
    private var size = 0

    override fun get(index: Int): T {
        if (index in 0 until size) {
            array[index]?.let {
                return it as T
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(element: T) {
        if (size >= array.size) {
            array = array.copyOf(array.size * 2)
        }

        array[size] = element
        size++
    }

    override fun removeAt(index: Int) {
        if (index in 0 until size) {
            for (i in index until size - 1) {
                array[i] = array[i + 1]
            }
            size--
        } else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun remove(element: T) {
        for ((index, value) in array.withIndex()) {
            if (value == element) {
                removeAt(index)
            }
        }
    }

    override fun size(): Int {
        return size
    }
}