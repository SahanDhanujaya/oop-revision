package streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutput {
    public static void main(String[] args) {
        FileOutputStream fos = null; 
        String text = "I'm a new line";
        try {
            File file = new File("D:\\Class\\OOP\\streams\\example.txt");
            fos = new FileOutputStream(file);
            fos.write(text.getBytes());
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
