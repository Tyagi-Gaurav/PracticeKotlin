class Hippo : Animal() {

    override val image: String = "hippo.img"
    override val food: String = "grass"
    override val habitat: String = "water"

    override fun roam() {
        super.roam()
    }
}

fun main(args: Array<String>) {
    val hippo = Hippo()

    hippo.eat()
    hippo.sleep()
    println(hippo.image)
    println(hippo.food)
}