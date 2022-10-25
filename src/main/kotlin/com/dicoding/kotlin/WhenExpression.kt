package com.dicoding.kotlin

import java.util.*
import kotlin.random.Random.Default.nextInt

fun main () {

val value =  27
val ranges = 10..50

when(value) {
    in ranges -> println("value is in the range")
    !in ranges -> println("value is outside the range")
    else -> println("value undefined")
    }

}