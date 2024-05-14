data class Dog(val name: String, var weight_param: Int, val breed: String) {
    fun bark() {
        println(if (weight < 20) "Yip" else "Woof Woof!")
    }

    init {
        println ("Dog ${name} has been created")
    }

    val weightInKgs : Double get() = weight / 2.2

    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
    /*
    You can only use lateinit with properties defined using var, and you
can’t use it with any of the following types: Byte, Short, Int, Long,
Double, Float, Char or Boolean. This is down to how these types are
treated when the code runs in the JVM. This means that properties of any of
these types must be initialized when the property is defined, or in an
initializer block
     */
}

fun main(arrays: Array<String>) {
    val dog = Dog("Figo", 70, "Mixed")
    dog.bark()
    println (dog.weightInKgs)
    dog.weight = 0
    println (dog.weightInKgs)
    dog.weight = 90
    println (dog.weightInKgs)

    val dog_copy = dog.copy(name = "Fugo")

    val (name, weight) = dog_copy //Destructuring a data object splits it into its component parts.

    println (name)
    println (weight)

}