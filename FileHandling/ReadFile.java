package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader a = new FileReader("filename.txt");
            try {
                int ch;
                while ((ch = a.read()) != -1)
                    System.out.print((char) ch);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
