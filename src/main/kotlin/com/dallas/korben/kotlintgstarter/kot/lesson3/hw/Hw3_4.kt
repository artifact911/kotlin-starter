package com.dallas.korben.kotlintgstarter.kot.lesson3.hw

/**
 */
fun main() {
    generateNameAndLastName()
}

/**
 * Создать список строк "Фамилия Имя"
 * Создать список Pair, где first это фамилия, а second - имя
 */
private fun generateNameAndLastName() {
    val sourceList = mutableListOf<String>()

    for (i in 0..10) {
        sourceList.add("Фамилия_$i Имя_$i")
    }

//    val lastNames = mutableListOf<String>()
//    val names = mutableListOf<String>()

//    for (value in sourceList) {
//        val split = value.split(" ")
//        lastNames.add(split[0])
//        names.add(split[1])
//    }

    // not my decision
    val lastNames = sourceList.map { it.substringBefore(" ") }
    val names = sourceList.map { it.substringAfter(" ") }


    val pairList = lastNames.zip(names)
    for (pair in pairList) {
        println("Фамиля: ${pair.first} Имя: ${pair.second}")
    }

}


