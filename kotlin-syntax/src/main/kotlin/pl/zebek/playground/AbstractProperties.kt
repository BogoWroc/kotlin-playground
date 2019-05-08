package pl.zebek.playground

interface User {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}


class PrivateUser(override val email: String): User


fun main() {
    val user = PrivateUser("jan@gmail.com")
    println(user.nickname)
}