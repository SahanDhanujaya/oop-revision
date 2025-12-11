package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            File file = new File("D:\\Class\\OOP\\streams\\example.txt");
            fis = new FileInputStream(file);
            byte arr[] = fis.readAllBytes();
            for (byte b : arr) {
                System.out.print((char)b);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } 
    }
}
