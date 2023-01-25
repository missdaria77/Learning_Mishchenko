package basic.work8;

public class Person {

    private String name;
    private String surname;
    private String city;
    private String phoneNumber;


    public Person(String name, String surname, String city, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String personInfo() {
        return "You can call " + this.name + " " + this.surname + " from " + this.city + " on the number " + this.phoneNumber;
    }

/*
    public String personInfo(String name, String surname, String city, String phoneNumber) {
        return "You can call " + name + " " + surname + " from " + city + " on the number " + phoneNumber;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
*/
}


