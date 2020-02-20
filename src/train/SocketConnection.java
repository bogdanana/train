package train;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class SocketConnection {

    public static void main(String[] args) throws IOException {

        getURLSource("https://www.java.com/ru/");
    }

    public static void getURLSource(String url) throws IOException {

        URL urlObject = new URL(url);
        URLConnection urlConnection = urlObject.openConnection();

        File myFile = new File("C:\\Users\\bogda\\Desktop\\URLConnection.html");
        if (!(myFile.exists())) {
            myFile.createNewFile();
        }

        FileWriter fWrite = new FileWriter(myFile);
        int c;
        long len = urlConnection.getContentLengthLong();
        if (len == -1)
            System.out.println("Длинa содержимого недоступна.");
        else
            System.out.println("Длинa содержимого: " + len);
        if (len != 0) {
            InputStream input = urlConnection.getInputStream();
            while (((c = input.read()) != -1)) {
                fWrite.write((char) c);
            }
            input.close();
        } else {
            System.out.println("Coдepжимoe недоступно.");
        }
    }
/*
    private static String toString(InputStream inputStream) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"))) {
            String inputLine;
            StringBuilder stringBuilder = new StringBuilder();
            while ((inputLine = bufferedReader.readLine()) != null) {
            stringBuilder.append(inputLine);
        }



            return stringBuilder.toString();*/

}
