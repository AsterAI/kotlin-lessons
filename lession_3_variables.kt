

fun main(args: Array<String>) {

    var friendCount = 10;
    var beerCost = 30.0f;

    if (friendCount >= 10) {
        beerCost = beerCost * 0.9f;
    }

    var crispsLikerCount = 4;
    var crispCost = 30;

    var crabLikerCount = 1;
    var crabCost = 25;

    var deliveryDiscount = 40;
    // if summ > 200  => 5%
    // if summ > 500  => 10%
    // if summ > 1000  => 15%

    var summ: Float = (friendCount * beerCost) + (crispsLikerCount * crispCost) + (crabLikerCount * crabCost);

    if (summ >= 200) {
        summ = summ * 0.95f;
        println("Your discount 5%!");
    } else if (summ >= 500) {
        summ = summ * 0.90f;
        println("Your discount 10%!");
    } else if (summ >= 1000) {
        summ = summ * 0.85f;
        println("Your discount 15%!");
    } else {
        println("Discount is not allowed for your bill!");
    }

    var partyCost = summ - deliveryDiscount;

    var currency = "usd";

    when (currency) {
        "hryvnia" -> println("Go to the nearest shop")
        "euro" -> println("Go to the foreign currency shop")
        else -> {
            println("I don't know what to do")
        }
    }

    print("Party cost: ")
    print(partyCost)
    print(" ")
    print(currency)

    println()

    print("Per person: ")
    print(partyCost / friendCount)
    print(" ")
    print(currency)
}