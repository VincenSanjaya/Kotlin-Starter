package com.dicoding.kotlin

fun main () {
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)

    print(mixArray)                 

    /*
    intArrayOf() : IntArray
    booleanArrayOf() : BooleanArray
    charArrayOf() : CharArray
    longArrayOf() : LongArray
    shortArrayOf() : ShortArray
    byteArrayOf() : ByteArray
     */

    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    intArray[2] = 11                       // [1, 3, 11, 7]

    print(intArray[2])

    val intArray2 = Array(4, { i -> i * i }) // [0, 1, 4, 9]
    print(intArray2[2])
}