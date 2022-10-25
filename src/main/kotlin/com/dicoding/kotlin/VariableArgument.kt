package com.dicoding.kotlin

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    print(number)

}

fun sumNumbers(vararg number: Int): Int {
    return number.sum() //Bisa menggunakan Size, semacam menghitung jumlah value
}

fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}