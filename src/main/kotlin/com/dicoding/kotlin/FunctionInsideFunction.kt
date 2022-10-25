package com.dicoding.kotlin

fun main() {

fun setWord(message: String) {
    setWord("Hello World")

    fun printMessage(text: String) {
        println(text)
    }

    printMessage(message)
    }
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun Int.validateNumber(){
        if (this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}