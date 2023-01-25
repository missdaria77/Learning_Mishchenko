package home.work4.phonebook;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("aaa", "12345");
        phoneBook.add("bbb", "1234567");
        phoneBook.add("aaa", "123455667777");


        System.out.println(phoneBook.find("aaa").toString());
        System.out.println(phoneBook.findAll("aaa"));




    }

}
