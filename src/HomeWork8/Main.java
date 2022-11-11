package HomeWork8;

public class Main {

    public static void main(String[] args) {

        Person Will = new Person("Will", "Smith", "New York", "2936729462846");
        Person Jackie = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person Sherlock = new Person("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(Will.personInfo());
        System.out.println(Jackie.personInfo());
        System.out.println(Sherlock.personInfo());

/*
        Person Will = new Person();
        Person Jackie = new Person();
        Person Sherlock = new Person();

        Will.setCity("JJJ");
        System.out.println(Will.getCity());

        System.out.println(Will.personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(Jackie.personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(Sherlock.personInfo("Sherlock", "Holmes", "London", "37742123513"));
*/
    }
}
