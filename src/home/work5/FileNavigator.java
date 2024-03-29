package home.work5;


import java.util.*;

public class FileNavigator {

    private Map<String, List<FileData>> files = new HashMap<>();


    public void add(FileData file) {

        this.files.computeIfAbsent(file.getPath(), s -> {
            ArrayList<FileData> newList = new ArrayList<>();
            newList.add(file);
            return newList;
        });

        this.files.computeIfPresent(file.getPath(), (s, src) -> {
            for (FileData f : src) {
                if (f.equals(file)) {
                    return src;
                }
            }
            src.add(file);
            return src;
        });

    }

    public List<FileData> find(String key) {
        if (files.containsKey(key)) {
            return files.get(key);
        } else
            System.out.println("you don't have any files in the current folder");
        return Collections.emptyList();
    }

    public List<FileData> filterBySize(int limit) {
        ArrayList<FileData> result = new ArrayList<>();
        for (Map.Entry<String, List<FileData>> i : files.entrySet()) {
            for (FileData k : i.getValue()) {
                if (k.getSize() < limit) {
                    result.add(k);
                }
            }
        }
        return result;
    }


    public void remove(String obsoletePath) {
        files.remove(obsoletePath);
    }


    public List<FileData> sortBySize() {
        ArrayList<FileData> result = new ArrayList<>();
        for (Map.Entry<String, List<FileData>> i : files.entrySet()) {
            result.addAll(i.getValue());
        }
        result.sort(Comparator.comparingInt(FileData::getSize));
        return result;
    }


    @Override
    public String toString() {
        return "FileNavigator{" +
                "files=" + files +
                '}';
    }
}
