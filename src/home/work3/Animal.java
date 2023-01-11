package home.work3;

/*
Створити класи Собака та Кіт з успадкуванням від класу Тварини.
Всі тварини можуть бігти та плисти. Як параметр кожному методу передається довжина перешкоди.
Результатом виконання дії буде друк у консоль. (Наприклад, dogBobik.run(150); -> 'Бобік пробіг 150 м');
Кожна тварина має обмеження на дії (біг: кіт 200 м., собака 500 м.; плавання: кіт не вміє плавати, собака 10 м.).
Додати підрахунок створених котів, собак та тварин.
 */

public abstract class Animal {

    public String name;
    public int run;
    public int swim;
    private static int created = 0;

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        created++;
    }

    public void run(int distance) {
        if (distance <= run) {
            System.out.println(this.name + " ran " + distance + "m");
        } else {
            System.out.println(this.name + " can't run " + distance + "m");
        }
    }

    public void swim(int distance) {
        if (distance <= swim) {
            System.out.println(this.name + " swam " + distance + "m");
        } else {
            System.out.println(this.name + " can't swim " + distance + "m");
        }
    }

    public static int created() {
        return created;
    }
}
