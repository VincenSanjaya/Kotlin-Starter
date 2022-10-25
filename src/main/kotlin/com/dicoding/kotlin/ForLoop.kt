package com.dicoding.kotlin

fun main() {
    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }
    index()
}

fun index() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}