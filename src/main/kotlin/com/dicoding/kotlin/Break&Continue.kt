package com.dicoding.kotlin

fun main() {

    println("Continue")
    con()

    print("\n")

    println("Break")
    br()

    print("\n")

    println("Break & Continue Labels")
    conbr()


}

fun con() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }
}

fun br() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }
}

fun conbr() {
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}