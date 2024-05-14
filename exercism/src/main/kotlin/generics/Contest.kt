package generics

class Contest<T : Pet> {
    val scores : MutableMap<T, Int> = mutableMapOf()

    fun addScores(key : T, score : Int = 0) {
        if (score > 0) scores.put(key, score)
    }

    fun getWinners() : MutableSet<T> {
        val maxScore = scores.values.max()
        val winners : MutableSet<T> = mutableSetOf()

        for ((t, score) in scores) {
            if (score == maxScore) winners.add(t)
        }

        return winners
    }
}

fun main(args: Array<String>) {
    val catContest = Contest<Cat>()
    val dogContest = Contest<Dog>()
}