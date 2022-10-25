package com.dicoding.kotlin

fun main() {

    when(Color.GREEN){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}


fun main1() {
    val color1: Color1 = Color1.GREEN

    print("Position GREEN is ${color1.ordinal}")
}

enum class Color1(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun main2() {
    val colors: Array<Color2> = enumValues()
    colors.forEach {color ->
        println(color)
    }

    val color: Color2 = enumValueOf("RED")
    println("Color is $color")
}

enum class Color2(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}