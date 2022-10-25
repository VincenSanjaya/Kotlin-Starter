package com.dicoding.kotlin

fun main() {
    //Safe Call
    val text: String? = null
    text?.length

    //Elvis Operator
//    val textLength = if (text != null) text.length else 7
//    println(textLength)//7

    val text2: String? = null
    val textLength = text!!.length // ready to go ???
}