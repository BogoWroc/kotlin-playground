package pl.zebek.playground

import java.lang.StringBuilder

class Outer {

    override fun toString():String{
        return "Outer"
    }

    fun test(){
        val text = with(StringBuilder()){
            append("Ble")
            append(this@Outer.toString())
            toString()
        }

        println(text)
    }

}

fun main() {
    Outer().test()
}