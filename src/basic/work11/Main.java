package basic.work11;

public class Main {
    public static void main(String[] args) {

        User anna = new User("Anna", "Petrova",
                new Date(02, 11, 1992),
                new Contacts("mmmm_ddd@ukr.net", "3809456321"),
                new FitInfo(62.0, "120/80", 10000));

        System.out.println(anna);


    }
}
