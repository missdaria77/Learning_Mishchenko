package home.work7;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book name:");
        String bookName = scanner.nextLine();
        File book = new File("src/home/work7/" + bookName + ".txt");
/*
- Если книга есть то нужно посчитать 10 самых популярных слов которые имеют больше 2 символов
( hi -> no, hello -> yes) вне зависимости от регистра
- Записать статистику которую сделали выше в файл ( слово -> количество символов) в конце общее
количество слов (название файла типа {bookName}_statistic.txt )
- Также вывести статистику в консоль
 */

        try (FileReader fileReader = new FileReader(book);) {

            StringBuilder text = new StringBuilder();
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line.trim()).append("\n");
            }

            String[] res = text.toString().toLowerCase().replaceAll("[^a-z ]", "")
                    .replaceAll("( )+", " ").split(" ");

            Map<String, Integer> words10 = new HashMap<>();

/*
            for (String i : res) {
                words10.put(i, 0);
            }
            for (String i : res) {
                words10.computeIfPresent(i, (key, val) -> val + 1);
            }
            //System.out.println(words10);
 */

            Arrays.stream(res)
                    .forEach(e -> {
                        boolean b = words10.containsKey(e);
                        if (b) {
                            words10.put(e, words10.get(e) + 1);
                        } else {
                            words10.put(e, 1);
                        }
                        //words10.compute(e, (key, val) -> Objects.isNull(val) ? words10.put(e, 1) : val = val + 1)
                    });

            try (FileOutputStream statistics = new FileOutputStream(bookName + "_statistics.txt")) {

                words10.entrySet().stream()
                        .filter(i -> i.getKey().length() > 2)
                        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                        .limit(10)
                        .forEach(e -> {
                            try {
                                statistics.write((e.getKey() + " = " + e.getValue() + System.lineSeparator()).getBytes());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        });

                Set<String> set = new HashSet<>(Arrays.asList(res));
                int uniqueNum = set.size();
                statistics.write(("Number of unique words = " + uniqueNum).getBytes());

                BufferedReader brOut = new BufferedReader(new FileReader(bookName + "_statistics.txt"));
                String lineOut = brOut.readLine();
                while (lineOut != null) {
                    System.out.println(lineOut);
                    lineOut = brOut.readLine();
                }

            } catch (IOException e) {
                System.out.println("Can't create the file!");
            }

        } catch (IOException e) {
            System.out.println("Book " + bookName + " was not found!");
        }

    }

}
