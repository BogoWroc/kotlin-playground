package pl.zebek.playground

fun concat(list: List<Char>): String = list.joinToString(separator="", prefix = "(", postfix = ")" )


fun main() {
    println(concat(listOf('a','b','c')))
}