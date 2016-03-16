package lessons3;
import java.util.Random;

/**
 * Created by User on 14.03.2016.
 */
public class main {
    public static void main(String[] args) {

        int[] a = generateArray();
        int[] c = generateArray();
        int[] b = generateArray();


    }
    public static int[] generateArray() {
    Random rn = new Random();
    int[] array = new int[5 + rn.nextInt(10)];
    for (int i = 0; i < array.length; i++) {
        array[i] = rn.nextInt(10);
    }
    return array;
}
}
