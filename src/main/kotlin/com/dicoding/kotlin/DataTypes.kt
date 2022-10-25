package com.dicoding.kotlin

fun main () {
    //tipe variable (var)
    //Var bisa diubah ubah (mirip let)
    var company: String = "Dicoding"
    company = "Dicoding Academy"

    //tipe variable (val)
    //Mirip mirip (const)
    val company1: String = "Dicoding"
    //company1 = "Dicoding Academy" //Val cannot be reassigned

    //Penggabungan
    val firstWord = "Dicoding"
    val lastWord = "Academy"
    print(firstWord + lastWord)

    val valueA: Int = 10
    val valueB = 20
    print(valueA + valueB)
}