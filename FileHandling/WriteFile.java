package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("FileHandling\\filename.txt");
            try {
                file.write("hello");
                file.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
