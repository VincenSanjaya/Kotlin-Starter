package com.dicoding.kotlin

//fun main() {
//
//    printMessage("Hello From Lambda")
//
//    val length = messageLength("Hai namaku Vincencio Gabriel Frederic Sanjaya")
//    println("Message length $length")
//}
//
//val printMessage = { message: String -> println(message) }
//
//val messageLength = { message: String -> message.length }


//Lambda with receiver

fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }
    println(message)

    val text = "Hello"
    text.let {
        val message2 = "$it Kotlin"
        println(message2)
    }

    val text2 = "Haii"
    text2.let { value ->
        val message3 = "$value Kotlin"
        println(message3)
    }


    fun buildString(action: StringBuilder.() -> Unit): String {
        val stringBuilder = StringBuilder()
        stringBuilder.action()
        return stringBuilder.toString()
    }
}





