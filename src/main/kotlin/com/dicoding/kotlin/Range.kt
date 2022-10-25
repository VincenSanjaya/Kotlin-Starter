package com.dicoding.kotlin

fun main() {
    val rangeInt = 1..10 step 3
    rangeInt.forEach {
        println("$it")
    }

    val rangeChar = 'A'.rangeTo('F')

    println(rangeChar)

    println(rangeInt.step)

    rangeInt2()
}

fun rangeInt2() {
    val tenToOne = 10.downTo(1)
    if (11 !in tenToOne) {
        println("No value 11 in Range ")
    }
}

