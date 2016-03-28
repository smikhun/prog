package Lesson5;
import java.io.File;
import java.io.IOException;

/**
 * Created by User on 21.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        File a = new File("a.txt");
        System.out.println(a.getAbsoluteFile());
        try{
            a.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }

        File b = new File("b.txt");
        a.renameTo(b);

        b.delete();

        File  folder = new File("A/B");
        folder.mkdir();

        File c = new File(folder, "a.txt");
        try {
            c.createNewFile();
        }catch (IOException e){
            System.out.println(e);
        }

      File file =new File(".");
        File[] files = file.listFiles();
        for (File fileOne : files){
            System.out.println(fileOne.getName() + ((fileOne.isFile())? " - File" : " - Directory"));
        }
    }
}
