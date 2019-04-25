package pl.zebek.playground

object Singleton {
    fun sayYeaa(){
        println("Yeaa!")
    }
}


fun main() {
    Singleton.sayYeaa()

    val p: String by lazy {
        print("Lazy")
        "DSfsds"
    }




}