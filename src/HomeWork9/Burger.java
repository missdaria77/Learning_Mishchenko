package HomeWork9;

import java.util.Objects;
public class Burger {

    private String bread;
    private String meat;
    private boolean meatCount;
    private String cheese;
    private String salad;
    private String sauce;

    private Burger(String bread, String meat, boolean meatCount, String cheese, String salad, String sauce) {
        this.bread = bread;
        this.meat = meat;
        this.meatCount = meatCount;
        this.cheese = cheese;
        this.salad = salad;
        this.sauce = sauce;

    }

    public Burger(String bread, String meat, String cheese, String salad, String sauce) {
        this(bread, meat, false, cheese, salad, sauce);
    }

    public Burger(String bread, String meat, String cheese, String salad) {
        this(bread, meat, false, cheese, salad, null);

    }

    public Burger() {
        this("grey bread", "chicken", true, "cheddar", "iceberg", "mayo");
    }


    @Override
    public String toString() {

        int numberOfMeat = meatCount ? 2 : 1;

        String sauceStr = Objects.isNull(sauce) ? "" : ", " + sauce;

        return "Burger consists of " + bread + ", " + numberOfMeat + " " + meat +
                ", " + cheese + ", " + salad + sauceStr;

    }
}
