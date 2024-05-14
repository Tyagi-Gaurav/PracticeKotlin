package generics

fun main(args: Array<String>) {
    val catRetailer = CatRetailer()
    val dogRetailer = DogRetailer()
    val fishRetailer = FishRetailer()

    sell(catRetailer)
    sell(dogRetailer)
    sell(fishRetailer)
}

fun sell(retailer: Retailer<Pet>) {
    println (retailer.sell())
}

