package HomeWork12;

public class CoffeeMachine {
    private final String drinkName;

    public CoffeeMachine(Drinks name) {
        this.drinkName = String.valueOf(name);
    }

    public String prepareDrink() {
        return "Your " + drinkName.toLowerCase() + " is ready!";
    }
}
