package generics

interface Retailer<out T> {
    fun sell() : T
}