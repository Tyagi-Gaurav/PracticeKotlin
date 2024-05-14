data class Recipe(val title : String, val isVegetarian : Boolean)

fun main(args: Array<String>) {
    val r1 = Recipe("Thai curry", false)
    val r2 = Recipe("Thai curry", false)
    val r3 = r2.copy(title = "Chicken Bhuna")

    println ("r1 hash code ${r1.hashCode()}")
    println ("r2 hash code ${r2.hashCode()}")
    println ("r3 hash code ${r3.hashCode()}")

    println("r1 toString: $r1")
    println("r1 == r2: ${r1 == r2}") //True as it uses equals.
    println("r1 === r2: ${r1 === r2}") //False as they're different objects. Does not use equals.
    println("r1 == r3: ${r1 == r3}")

    val (title, vegetarian) = r1
    println("title is $title and vegetarian is $vegetarian")
}