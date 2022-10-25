package com.dicoding.kotlin

fun main () {


//    val openHours = 7
//    val officeClose = 16
//    val now = 12


    //Fungsi && Operator

//    //Menggunakan if
//    val isOpen = if (now >= openHours && now <= officeClose) {
//        true
//    } else {
//        false
//    }
//
//    //Tanpa if
//    val isOpen = now >= openHours && now <= officeClose


//    //Fungsi || Operator
//    val isClose = now > officeClose || now < openHours
//
//    print("Office is open : $isOpen")
//    print("Office is close : $isClose")


    //Fungsi ! Operator
    val officeOpen = 7
    val now = 10
    val isOpen = now >= officeOpen

    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }

}