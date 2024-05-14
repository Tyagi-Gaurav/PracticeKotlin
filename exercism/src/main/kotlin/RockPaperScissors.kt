
fun main(arrays : Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)


}

fun getGameChoice(options: Array<String>) = options[(Math.random() * options.size).toInt()]

fun getUserChoice(options: Array<String>) : String {
    println ("Please enter one of the following: Rock Paper Scissors")
    val userInput = readLine()

    if (options.contains(userInput)) {
        return userInput.toString()
    } else {
        return getGameChoice(options)
    }
}

