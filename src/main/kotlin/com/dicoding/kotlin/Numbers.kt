package com.dicoding.kotlin

fun main () {
    //Int
    val intNumber = 100

    //Long
    val longNumber = 100L

    //Short
    val shortNumber: Short = 10

    //Byte
    val byteNumber = 0b11010010

    //Double
    val doubleNumber: Double = 1.3

    //Float
    val floatNumber: Float = 0.123456789f //yang terbaca hanya 0.1234567

    //Max and Min
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)


    //overRange int
    val maxInt1 = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt1")
    println("Over range Int: $overRangeInt")

    /*
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
     */

    val stringNumber = "23"
    val intNumber1 = 3

    print(intNumber1 + stringNumber.toInt())


    //readable
    val readableNumber = 1_000_000
    print(readableNumber)
}