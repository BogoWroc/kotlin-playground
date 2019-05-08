package pl.zebek.playground

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left:Int, val right: Int): Expr()
}


fun eval(e: Expr):Int{
    return when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> e.left + e.right
    }
}

fun main() {
    println(eval(Expr.Sum(1, 3)))
}