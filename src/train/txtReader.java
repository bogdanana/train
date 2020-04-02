package train;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class txtReader {
    public static void main(String[] args) throws IOException {
        Path testFilePath = Paths.get("C:\\Users\\bogda\\Desktop\\Sample text.txt");
        List<String> text = Files.readAllLines(testFilePath);
        int x = 0;
        for (int i=0; i < text.size(); i++) {
            String tmp = text.get(i);
            String[] split = tmp.split(" ");
            for (int j=0; j<split.length; j++) {
                if (split[j].equalsIgnoreCase("sample") || split[j].equalsIgnoreCase("sample.")) {
                    x++;
                }
            }
        }
        System.out.println(x);
    }
}
