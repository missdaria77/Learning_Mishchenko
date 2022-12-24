package home.work2;

public class Employee {

    private final String name;
    private final String position;
    private final String email;
    private final String phoneNumber;
    private final int age;

    public Employee(String name, String position, String email, String phoneNumber, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
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
