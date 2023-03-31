package home.work6;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(ProductType.BOOK, 200);
        Product product2 = new Product(ProductType.BOOK, 400);
        Product product3 = new Product(ProductType.BOOK, 600);
        Product product4 = new Product(ProductType.BACKPACK, 200);
        Product product5 = new Product(ProductType.PEN, 200);
        Product product6 = new Product(ProductType.PAPER, 200);

        Product product21 = new Product(ProductType.BOOK, 200, true);
        Product product22 = new Product(ProductType.BOOK, 400, false);
        Product product23 = new Product(ProductType.BOOK, 600, true);
        Product product24 = new Product(ProductType.BACKPACK, 200, false);
        Product product25 = new Product(ProductType.PEN, 200, true);
        Product product26 = new Product(ProductType.PAPER, 200, true);

        Product product41 = new Product(ProductType.BOOK, 50, true, LocalDate.of(2023, Month.APRIL, 24));
        Product product42 = new Product(ProductType.BOOK, 40, false, LocalDate.of(2023, Month.JANUARY, 24));
        Product product43 = new Product(ProductType.BOOK, 600, true, LocalDate.of(2023, Month.MARCH, 21));
        Product product44 = new Product(ProductType.BACKPACK, 200, false, LocalDate.of(2021, Month.APRIL, 24));
        Product product45 = new Product(ProductType.PEN, 200, true, LocalDate.of(2018, Month.APRIL, 24));
        Product product46 = new Product(ProductType.PAPER, 200, true, LocalDate.of(2019, Month.APRIL, 24));

        Product product61 = new Product(ProductType.BOOK, 50, true, LocalDate.of(2023, Month.APRIL, 24), 0);
        Product product62 = new Product(ProductType.BOOK, 40, false, LocalDate.of(2023, Month.JANUARY, 24), 1);
        Product product63 = new Product(ProductType.BOOK, 600, true, LocalDate.of(2023, Month.MARCH, 21), 2);
        Product product64 = new Product(ProductType.BACKPACK, 200, false, LocalDate.of(2021, Month.APRIL, 24), 3);
        Product product65 = new Product(ProductType.PEN, 200, true, LocalDate.of(2018, Month.APRIL, 24), 4);
        Product product66 = new Product(ProductType.PAPER, 200, true, LocalDate.of(2019, Month.APRIL, 24), 5);

        //Реалізувати метод отримання всіх продуктів у вигляді списку, категорія яких еквівалентна “Book” та ціна більш ніж 250.
        List<Product> cart1 = Stream.of(product1, product2, product3, product4, product5, product6)
                .filter(i -> i.getPrice() > 250)
                .filter(i -> i.getType().equals(ProductType.BOOK)).toList();
        System.out.println(cart1);
        System.out.println("--- --- --- ---");


        //Реалізувати метод отримання всіх продуктів як списку, категорія яких еквівалентна “Book” і з можливістю
        //застосування знижки. Фінальний список повинен містити продукти з застосованою знижкою 10%.
        List<Product> cart2 = Stream.of(product21, product22, product23, product24, product25, product26)
                .filter(i -> i.getType().equals(ProductType.BOOK))
                .filter(Product::isDiscountApp)
                .map(Product::newPrice).collect(Collectors.toList());
        System.out.println(cart2);
        System.out.println("--- --- --- ---");


        //Реалізувати метод отримання найдешевшого продукту з категорії “Book”. У випадку, якщо жоден продукт не знайдено
        //(ситуація, коли немає продукту з категорією),викинути виняток з повідомленням “Продукт [категорія: ім'я_категорії] не знайдено”
        Product cheapestProduct = Stream.of(product21, product22, product23, product24, product25, product26)
                .filter(i -> i.getType().equals(ProductType.BOOK))
                .min(Comparator.comparingDouble(Product::getPrice)).orElse(null);
        if (cheapestProduct == null) {
            throw new RuntimeException("product [type: book] was not found");
        }
        System.out.println(cheapestProduct);
        System.out.println("--- --- --- ---");


        // 4.2 Реалізувати метод отримання трьох останніх доданих продуктів
        List<Product> cart4 = Stream.of(product41, product42, product43, product44, product45, product46)
                .sorted(Comparator.comparing(Product::getAddDate).reversed())
                .limit(3)
                .toList();
        System.out.println(cart4);
        System.out.println("--- --- --- ---");


        //5.2 Реалізувати метод калькуляції загальної вартості продуктів, які відповідають наступним критеріям:
        //продукт додано протягом поточного року; продукт має тип “Book”; ціна продукту не перевищує 75
        double amount = Stream.of(product41, product42, product43, product44, product45, product46)
                .filter(i -> i.getType().equals(ProductType.BOOK))
                .filter(i -> i.getPrice() < 75)
                .filter(i -> i.getAddDate().getYear() == 2023)
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);
        System.out.println(amount);
        System.out.println("--- --- --- ---");


        //** 6.2 Реалізувати метод групування об'єктів за типом продукту. Таким чином результатом виконання методу
        //буде тип даних “Словник”, що зберігає пару ключ-значення: {тип: список_продуктів}
        Map<ProductType, List<Product>> cart6 = Stream.of(product61, product62, product63, product64, product65, product66)
                .collect(Collectors.groupingBy(Product::getType));
        System.out.println(cart6);

    }
}
