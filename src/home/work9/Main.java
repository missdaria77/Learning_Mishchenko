package home.work9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws IOException {
        try {

            ServerSocket serverSocket = new ServerSocket(8080);
            Socket accept = serverSocket.accept();

            OutputStream outputStream = accept.getOutputStream();

            PrintWriter printWriter = new PrintWriter(outputStream, true);


            InputStream inputStream = accept.getInputStream();
            //Scanner scanner = new Scanner(accept.getInputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            //BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

            printWriter.println("Hey");

            String line = bufferedReader.readLine();
            printWriter.println("line: " + line);

            if (line.contains("x") || line.contains("y") || line.contains("z")) {
                printWriter.println("What is it xyz?");
            } else {
                printWriter.println(LocalDateTime.now());
            }

            accept.close();
            bufferedReader.close();
            //bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}