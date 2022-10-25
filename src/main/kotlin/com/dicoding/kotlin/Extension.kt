package com.dicoding.kotlin

fun main() {
    val value: Int? = null
    val value1: Int? = null

    println(10.plusThree())
    println(value.gatau)
    println(value1?.slice)
}

fun Int.plusThree(): Int {
    return this + 3
}

val Int?.gatau: Int
    get() = this?.div(2) ?: 0


val Int.slice: Int
    get() = this.div(2)