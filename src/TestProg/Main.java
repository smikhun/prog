package TestProg;
import java.io.*;
import java.nio.Buffer;

/**
 * Created by User on 03.04.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException{

     //  File file = new File("d:/text.txt");
       // FileWriter tmp = new FileWriter(file);
       // tmp.append("aaa \r\n");

       // tmp.flush();

        FileReader sk = new FileReader("C:/Users/User/Desktop/Melnichenko.txt");
        BufferedReader tmsk = new BufferedReader(sk);
        String line = " ";
        while ((line = tmsk.readLine())!= null ){
            System.out.println(line);
        }
        sk.close();
        tmsk.close();

    }
}
