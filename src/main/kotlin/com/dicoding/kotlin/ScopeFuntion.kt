package com.dicoding.kotlin

//Lamda Reciever (Run)
//fun main() {
//    val text = "Hello"
//    val result = text.run {
//        val from = this
//        val to = this.replace("Hello", "Hi")
//        "Replacement: $from -> $to"
//    }
//    println("result : $result")
//}

//Lamda Reciever (with)
//fun main() {
//    val message = "Hello Kotlin!"
//    val result = with(message) {
//        "First character is ${this[0]}" +
//                " and last character is ${this[this.length - 1]}"
//    }
//
//    println(result)
//}

//Lambda Receiver (Apply)
//fun main() {
//    val message = StringBuilder().apply {
//        append("Hello ")
//        append("Kotlin!")
//    }
//
//    println(message.toString())
//}


//Lambda Argument (Let)
//fun main() {
//    val message: String? = null
//    message?.let {
//        val length = it.length * 2
//        val text = "text length $length"
//        println(text)
//    } ?: run {
//        val text = "message is null"
//        println(text)
//    }
//}

//Lamdba Argument (Also)
fun main() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}