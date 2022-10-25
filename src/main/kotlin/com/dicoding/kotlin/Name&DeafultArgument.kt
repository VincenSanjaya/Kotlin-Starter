package com.dicoding.kotlin

fun main() {
    val fullName = getFullName(first = "Vincencio")
    println("Hai Darling")
    print(fullName)
}

fun getFullName(first: String = "Kotlin",
                middle: String = " is ",
                last: String = "Awesome"): String {
    return "$first $middle $last"
}