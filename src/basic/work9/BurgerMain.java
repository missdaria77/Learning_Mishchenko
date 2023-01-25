package basic.work9;

public class BurgerMain {

    public static void main(String[] args) {

        Burger classic = new Burger("white bread", "pork cutlet", "cheddar", "iceberg", "mayonnaise");
        Burger diet = new Burger("white bread", "pork cutlet", "cheddar", "iceberg");
        Burger doubleMeat = new Burger();

        System.out.println(classic.toString());
        System.out.println(diet.toString());
        System.out.println(doubleMeat.toString());

    }

}
