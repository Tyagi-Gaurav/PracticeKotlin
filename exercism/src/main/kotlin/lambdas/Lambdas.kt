package lambdas
val addFive: (Int) -> Int = { x : Int -> x + 5}

val farenheitTemp = {c : Double -> (9 * c / 5) + 32 }

typealias DoubleConversion = (Double) -> Double

fun main(args: Array<String>) {

    println (addFive(6))



    println("${20} degrees in Farenheit is ${convert(20.0, farenheitTemp)}")
    println("${37.6} degrees in Farenheit is ${convert(37.6){c : Double -> (9 * c / 5) + 32 }}")
    println("${100} degrees in Farenheit is ${convert(100.0, farenheitTemp)}")
}

fun convert(temp : Double, converter : DoubleConversion) : Double {
    return converter(temp)
}

