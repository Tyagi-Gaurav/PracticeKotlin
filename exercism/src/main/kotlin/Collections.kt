
fun main(args: Array<String>) {
    val immutableList = listOf("a", "b")

    val mutableList = mutableListOf("a", "b")

    mutableList.add("c")

    println ("Immutable list $immutableList")
    println ("Mutable list $mutableList")
}