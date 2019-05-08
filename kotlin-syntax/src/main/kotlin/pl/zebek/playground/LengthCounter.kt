package pl.zebek.playground

class LengthCounter {
    var counter: Int = 0
        private set (value) {
            println(value)
            field = value
        }

    fun addWord(word: String){
        counter += word.length
    }
}

fun main() {
    val len = LengthCounter()
    len.addWord("text")

    println(len.counter)
}

