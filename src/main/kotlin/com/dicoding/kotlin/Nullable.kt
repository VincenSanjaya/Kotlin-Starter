package com.dicoding.kotlin

fun main() {

    //val text: String = null//Error
    val text2: String? = null//Nullable
    //Kalau mau null kasih ? dibelakang parameter

    //val textLength = text2.length // compile time error

    if (text2 != null) {
        val textLength = text2.length // ready to go
    }

    //Process finished with exit code 0
}