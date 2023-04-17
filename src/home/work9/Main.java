package home.work9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws IOException {
        try {

            ServerSocket serverSocket = new ServerSocket(8080);
            Socket accept = serverSocket.accept();

            OutputStream outputStream = accept.getOutputStream();

            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(
                    outputStream, StandardCharsets.UTF_8), true);
            //Charset.forName("KOI8-U")
            //PrintWriter printWriter = new PrintWriter(outputStream, true);

            InputStream inputStream = accept.getInputStream();
            //Scanner scanner = new Scanner(accept.getInputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            //BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

            printWriter.println("hey");

            String line = bufferedReader.readLine();
            //printWriter.println("line: " + line);

            if (line.contains("x") || line.contains("y") || line.contains("z")) {

                printWriter.println("Say palyanitsa!");
                line = bufferedReader.readLine();
                while (!line.equals("palyanitsa")) {
                    printWriter.println("Say palyanitsa!");
                    line = bufferedReader.readLine();
                }
                printWriter.println("good man");

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