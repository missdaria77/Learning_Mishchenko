package HomeWork12;

public enum Drinks {

    COFFEE(3.0),
    TEA(3.5),
    LEMONADE(3.0),
    MOJITO(5.0),
    WATER(2.5),
    COLA(3.0),

    UNDEFINED(0.0);


    public final double price;

    Drinks(double price) {
        this.price = price;
    }

}
