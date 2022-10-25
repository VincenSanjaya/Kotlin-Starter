package com.dicoding.kotlin


fun main() {
    //Fold
    //Fungsi fold adalah fungsi untuk mengkonversi sebuah list menjadi sebuah nilai yang ditentukan.
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->// ada foldRight
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

    //Drop
    //Fungsi Drop adalah fungsi untuk mengambil sebuah list dan mengambil sebanyak n item yang ditentukan.
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)

    println(drop)

    //Take
    //Fungsi Take adalah fungsi untuk mengambil sebuah list dan mengambil sebanyak n item yang ditentukan.
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)

    //Take
    //Fungsi Take adalah fungsi untuk mengambil sebuah list dan mengambil sebanyak n item yang ditentukan.
    val index = listOf(2, 3, 5, 8)
    val totalslice = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = totalslice.slice(index)

    println(slice)

    //Distinct
    //Fungsi Distinct adalah fungsi untuk menghilangkan item yang sama dari sebuah list.
    val totaldis = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = totaldis.distinct()

    println(distinct)

    data class Item(val key: String, val value: Any)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct1 = text.distinctBy {
        it.length
    }
    println(distinct1)

    //Chunked
    //Fungsi Chunked adalah fungsi untuk memecah sebuah list menjadi beberapa bagian yang ditentukan.
    val word = "QWERTY"
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunkedTransform)

}