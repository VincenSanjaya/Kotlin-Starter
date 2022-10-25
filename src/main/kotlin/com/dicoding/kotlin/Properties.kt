package com.dicoding.kotlin

private class Animal1{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

fun main(){
    val dicodingCat = Animal1()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}