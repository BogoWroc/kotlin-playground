package pl.zebek.playground

open class View {
    val name: String

    constructor(name:String){
        this.name = name
    }
}

class MyButton : View {
    constructor(name: String): super(name)
}

fun main() {
    MyButton("Some button")
}