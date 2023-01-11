package home.work3;

public class Cat extends Animal {

    private static int created = 0;

    public Cat(String name) {
        this(name, 200, 0);
    }

    public Cat(String name, int run, int swim) {
        super(name, run, swim);
        created++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat can't swim");
    }

    public static int created() {
        return created;
    }

}
