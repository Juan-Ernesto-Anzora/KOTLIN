// write the IceCreamOrder class here
class IceCreamOrder {
    var price: Int = 0
    constructor(popsicles: Int) {
        // The price is calculated as 7 currency units per popsicle.
        this.price += popsicles * 7
    }
    constructor(scoops: Int,toppings: Int) {
        this.price += (scoops * 5) + (toppings * 2)
    }
}