package com.dallas.korben.kotlintgstarter.kot.lesson4.p6

class NotDataStudent(val name: String, val lastName: String, val id: Int) {
    fun copy(name: String = this.name,
             lastName: String = this.lastName,
             id: Int = this.id): NotDataStudent = NotDataStudent(name, lastName, id)
}