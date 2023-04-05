package home.work8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/*
Нужно создать приложение, которое будет основываться на ServerSocket. При старте приложение слушает порт 8081 и ожидает подключение 1 клиента.
После того как клиент подключается к серверу, они обмениваются приветствиями. Пример (hello => привіт ).
Если в приветствии клиента есть русские буквы, которых нет в украинском языке, сервис должен спросить "що таке паляниця?".
Если клиент ответит правильно, то сервер должен вернуть текущие дату и время и попрощаться. В противном случаи клиент должен быть отключен.....
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try {

            Scanner scanner = new Scanner(System.in);
            scanner.useDelimiter("\n");

            ServerSocket serverSocket = new ServerSocket(8080);
            Socket accept = serverSocket.accept();
            System.out.println("hey");
            InputStream inputStream = accept.getInputStream();
            //OutputStream outputStream = accept.getOutputStrean();
            // accept.getOutputStream();
            //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            //String line = bufferedReader.readLine();
            String line = scanner.next();
            if (line.contains("ы")) {
                System.out.println("Що таке паляниця?");
            } else {
                System.out.println(LocalDateTime.now());
            }

            accept.close();
        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}
