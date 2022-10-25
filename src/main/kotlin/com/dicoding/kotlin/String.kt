package com.dicoding.kotlin


fun main() {
    val text  = "Kotlin"
    val firstChar = text[0]

    println("First character of $text is $firstChar")


    //Indexing merupakan sebuah cara yang memudahkan kita untuk mengakses elemen yang berada di dalam sebuah Collection dengan memanfaatkan index atau posisi dari elemen tersebut.


    //for loop (char buat per huruf)
    val text2 = "Pincen"
    for (char in text2){
        print("$char ")
    }


    //escaped String
    val text3 = "Kotlin \"Programming\""

    //Note
    /*
    \t: menambah tab ke dalam teks.

    \n: membuat baris baru di dalam teks.

    \’: menambah karakter single quote kedalam teks.

    \”: menambah karakter double quote kedalam teks.

    \\: menambah karakter backslash kedalam teks.
    */


    //Menambahkan unicode
    val name = "Unicode test: \u00A9"
    print(name)


    //Raw String (membuat multiline string tanpa \n)
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)









}