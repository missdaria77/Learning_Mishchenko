package home.work4.phonebook;

import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<Record> records = new ArrayList<>();

    public void add(String name, String phone) {
        Record record = new Record(name, phone);
        records.add(record);
    }

    public Record find(String name) {
        int k = 0;
        for (Record i : records) {
            if (i.getName().equals(name)) {
                return i;
            } else return null;
        }
        return null;
    }


    public ArrayList<Record> findAll(String name) {
        ArrayList<Record> resRecords = new ArrayList<>();

        for (Record i : records) {
            if (i.getName().equals(name)) {
                resRecords.add(i);
            }
        }
        if (resRecords.isEmpty()) {
            return null;
        } else return resRecords;
    }

    public ArrayList<Record> getRecords() {
        return records;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "records=" + records +
                '}';
    }
}
