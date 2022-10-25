package com.dicoding.kotlin

//fun main() {
//    val numbers = 1.rangeTo(10)
//    val evenNumbers = numbers.filter(Int::isEvenNumber)
//
//    println(evenNumbers)
//}
//
//fun Int.isEvenNumber() = this % 2 == 0


//Propert References
var message = "Kotlin"//Kalo pake val gabisa diganti nanti error

fun main() {
    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Academy")

    println(::message.get())
}