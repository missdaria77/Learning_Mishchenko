package HomeWork11;

public class NewUser {

    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final String phoneNumber;

    private String surname;
    private double weight;
    private String pressure;
    private int dailySteps;

    private int age;

    public NewUser(String name, int birthDay, int birthMonth, int birthYear, String email, String phoneNumber,
                   String surname, double weight, String pressure, int dailySteps) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.dailySteps = dailySteps;
    }

    public void printAccountInfo() {

        System.out.println("New User: " + name + " " + surname +
                ", birthDate = " + birthDay + "." + birthMonth + "." + birthYear +
                ", email: " + email + ", phoneNumber: " + phoneNumber +
                ", weight = " + weight + " kg" +
                ", pressure = " + pressure +
                ", dailySteps = " + dailySteps +
                ", age = " + getAge() +
                ';');
    }

    public int getAge() {
        age = 2022 - birthYear;
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setDailySteps(int dailySteps) {
        this.dailySteps = dailySteps;
    }

/*
    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getDailySteps() {
        return dailySteps;
    }

*/
}