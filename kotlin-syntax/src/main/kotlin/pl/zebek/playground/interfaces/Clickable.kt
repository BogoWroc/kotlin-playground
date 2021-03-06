package pl.zebek.playground.interfaces

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}


interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

    override fun click() = println("I was clicked!")
}



fun main() {
    val button = Button()
    button.click()
    button.showOff()
}