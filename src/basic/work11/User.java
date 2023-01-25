package basic.work11;

public class User {

    private final String name;
    private String surname;
    private Date birthDate;
    private Contacts contactInfo;
    private FitInfo fitInfo;
    private int age;

    public User(String name, String surname, Date birthDate, Contacts contactInfo, FitInfo fitInfo) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.contactInfo = contactInfo;
        this.fitInfo = fitInfo;
        this.age = 2022 - birthDate.getBirthYear();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", contactInfo=" + contactInfo +
                ", fitInfo=" + fitInfo +
                ", age=" + age +
                '}';
    }
}