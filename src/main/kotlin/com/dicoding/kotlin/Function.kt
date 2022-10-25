package com.dicoding.kotlin

fun main () {

    //Di isi dulu data data nya apa
    val user = setUser("Pincen", 19)
    println(user)

    printUser("Pincen")
}

//DIpanggil dalam bentuk fun sesuai nama nya

fun setUser (name: String, age: Int) = "Namamu adalah $name, dan umur mu  $age"

fun printUser(name : String) {
    println("Namamu adalah $name")
}