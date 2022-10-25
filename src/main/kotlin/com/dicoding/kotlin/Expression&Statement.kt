package com.dicoding.kotlin

fun main() {

    //Kode if sebagai statement
    val openOffice = 7
    val now = 8
    if (now > openOffice)
        println("Office already open")
    else
        println("Office close")

    //Kode if sebagai expression
    val openOffice1 = 7
    val now1 = 8
    val office = if (now1 > openOffice1) "Office already open at $openOffice1" else "Office close and will open at $openOffice1"
    print(office)

    //Expression
    sum(1, 1 *4)

    //Statement
    val value1 = 10;
    val value2 = 20;

    sum(value1, value2)



}
//Expression & Statement
fun sum(value1: Int, value2: Int) = value1 + value2


