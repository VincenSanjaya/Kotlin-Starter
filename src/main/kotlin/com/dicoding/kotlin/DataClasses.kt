package com.dicoding.kotlin

class User(val name : String, val age : Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }

    data class DataUser(val name: String, val age: Int) {
        fun intro() {
            println("My name is $name, I am $age years old")
        }
    }
}

    class UserEqual(val name: String, val age: Int) {

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as User

            if (name != other.name) return false
            if (age != other.age) return false

            return true
        }

        override fun hashCode(): Int {
            var result = name.hashCode()
            result = 31 * result + age
            return result
        }
    }

    fun main() {

        val user = User("nrohmen", 17)
        val dataUser = User.DataUser("nrohmen", 17)

        println(user)
        println(dataUser)
        datauser()
        UserEqual("Vincen", 16)
        destruc()

        val dataUser1 = User.DataUser("nrohmen", 23)
        dataUser.intro()
    }

    fun datauser() {
        val dataUser = User.DataUser("nrohmen", 17)
        val dataUser2 = User.DataUser("nrohmen", 17)
        val dataUser3 = User.DataUser("dimas", 24)

        println(dataUser.equals(dataUser2))
        println(dataUser.equals(dataUser3))
    }

    fun destruc() {
        val dataUser = User.DataUser("nrohmen", 17)

        val (name, age) = dataUser

        println("My name is $name, I am $age years old")
    }
