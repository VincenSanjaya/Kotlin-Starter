package com.dicoding.kotlin

fun main() {
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)
    println(5 in setA)

    val setC = setOf(1, 5, 7)
    //Menambahkan setC ke setA
    val union = setA.union(setC)
    //hanya memilih yang sama
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
}