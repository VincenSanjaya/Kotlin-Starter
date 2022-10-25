package com.dicoding.kotlin

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    val mapKeys = capital.keys

// mapKeys: [Jakarta, London, New Delhi]

    val mapValues = capital.values

// mapValues: [Indonesia, England, India]


    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    println(capital["Amsterdam"])

// Output: null


    println(capital.getValue("Amsterdam"))

// Output: Exception in thread "main" java.util.NoSuchElementException: Key Amsterdam is missing in the map.


}