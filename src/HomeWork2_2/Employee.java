package HomeWork2_2;
/*
Створити клас "Співробітник" з полями: ПІБ, посада, email, телефон, вік.
Конструктор класу повинен заповнювати ці поля під час створення об'єкта.
Забезпечити інкапсуляцію внутрішніх властивостей класу.
Створити два класи з однаковим ім'ям SameName. (Використовувати пакети)
Створити клас Car з публічним методом start. Метод start викликає у собі методи:
        - startElectricity()
        - startCommand()
        - startFuelSystem()
Перелічені методи, є внутрішньою (прихованою) частиною комплексного методу start.
Вони по суті відображають внутрішню поведінку класу Car і не повинні використовуватися за межами даного класу.
 */

public class Employee {

    public final String personalInfo;
    public final String position;
    public final String email;
    public final String phoneNumber;
    public final int age;

    public Employee(String personalInfo, String position, String email, String phoneNumber, int age) {
        this.personalInfo = personalInfo;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getPersonalInfo() {
        return personalInfo;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }
}
