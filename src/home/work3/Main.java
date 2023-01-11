package home.work3;

/*
Створити класи Собака та Кіт з успадкуванням від класу Тварини.
Всі тварини можуть бігти та плисти. Як параметр кожному методу передається довжина перешкоди.
Результатом виконання дії буде друк у консоль. (Наприклад, dogBobik.run(150); -> 'Бобік пробіг 150 м');
Кожна тварина має обмеження на дії (біг: кіт 200 м., собака 500 м.; плавання: кіт не вміє плавати, собака 10 м.).
Додати підрахунок створених котів, собак та тварин.
 */

public class Main {

    public static void main(String[] args) {
        Cat bulka = new Cat("Bulka", 200, 0);
        Dog duke = new Dog("Duck", 500, 100);
        Dog bobik = new Dog("Bobik");
        Cat dodik = new Cat("Dodik");
        System.out.printf("There are %s dog(s) are created%n", Dog.created());
        System.out.printf("There are %s cat(s) are created%n", Cat.created());
        System.out.printf("There are %s animal(s) are created%n", Animal.created());

        Dog duck2 = new Dog("Duck2", 500, 100);

        bulka.swim(3);
        bulka.run(300);
        bulka.run(100);

        duke.swim(15);
        duke.swim(4);
        duke.run(600);
        duke.run(450);
        bobik.run(6);
        dodik.swim(4);

        System.out.printf("There are %d dog(s) are created%n", Dog.created());
        System.out.printf("There are %d cat(s) are created%n", Cat.created());
        System.out.printf("There are %d animals are created%n", Animal.created());

    }

}
