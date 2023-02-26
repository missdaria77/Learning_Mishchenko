package home.work5;

public class Main {
    public static void main(String[] args) {

        FileData file = new FileData("Tom", 23, "rft/888");
        FileData file1 = new FileData("Bob", 20, "rft/888");
        FileData file2 = new FileData("John", 235, "rfty/8/0");
        FileNavigator test0 = new FileNavigator();
        test0.add(file);
        test0.add(file1);
        test0.add(file2);
//        System.out.println(test0);

        System.out.println(test0.find("rft/888"));
        System.out.println(test0.find("12345"));
        System.out.println(test0.filterBySize(300));
//        test0.remove("rfty/8/0");
        System.out.println(test0);
        System.out.println("--- --- ---");
        System.out.println(test0.sortBySize());
    }
}
