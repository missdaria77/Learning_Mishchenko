package home.work3;

public class Dog extends Animal {
    private static int created = 0;

    public Dog(String name) {
        this(name, 500, 10);
    }

    /**
     * @param name The dog's name.
     * @param run  The limit that dog can run (in meters).
     * @param swim The limit that dog can swim (in meters).
     */
    public Dog(String name, int run, int swim) {
        super(name, run, swim);
        created++;
    }

    public static int created() {
        return created;
    }
}
