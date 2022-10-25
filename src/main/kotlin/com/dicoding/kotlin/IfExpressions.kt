package com.dicoding.kotlin

fun main () {
    val openHours = 7
    val now = 7
    val office: String

    office = if (now > 7) {
        "Office is already open"
    } else if (now == openHours) {
        "Office will open in any minute"
    }else {
        "Office is still closed"
    }

    print(office)


}