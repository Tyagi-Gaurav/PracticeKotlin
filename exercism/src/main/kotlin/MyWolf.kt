class Wolf {
    var hunger = 10
    var food = "meat"

    fun eat() {
        println ("The wolf is eating $food")
    }
}

class MyWolf     {
    var w : Wolf? = Wolf()

    fun eat() {}

    fun hunger() {
        println ("Hunger")
    }

    fun myFunction() {
        w?.eat() //Safe check -- Only call eat if w is not-null

        w?.let {
            println (it.hunger) //If w is not null, do something
        }

        //Elvis operator
        println (w?:-1) //Print w if not-null else -1

//        val b = w!!.a //throws null pointer if w is null
    }
}

fun main(args: Array<String>) {
    val w : Wolf? = Wolf()

    w?.eat()

    var x = w?.hunger
    println ("Value of x is $x")

    var y = w?.hunger ?: -1 //Elvis operator
    println ("Value of y is $y")

    val myWolf = MyWolf()
    myWolf.w?.hunger = 8


}