package com.dicoding.kotlin

fun main() {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }     // evenList: [2, 4, 6, 8, 10]
    val notEvenList = numberList.filterNot { it % 2 == 0 }    // notEvenList: [1, 3, 5, 7, 9]
    val multipliedBy5 = numberList.map { it * 5 }// multipliedBy5: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
    val firstOddNumber = numberList.find { it % 2 == 1 }    // firstOddNumber: 1
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }    // firstOrNullNumber: null
    val moreThan10 = numberList.first { it > 10 }
    val total = numberList.sum() // total = 55
    val ascendingSort = kotlinChar.sorted()     // ascendingSort: [i, k, l, n, o, t]
    val descendingSort = kotlinChar.sortedDescending()       // descendingSort: [t, o, n, l, k, i]









    print(numberList.count())
    print(numberList.count { it % 3 == 0 })
    print(moreThan10)
    println(ascendingSort)
    println(descendingSort)
    // Output: Exception in thread "main" java.util.NoSuchElementException: Collection contains no element matching the predicate.







}