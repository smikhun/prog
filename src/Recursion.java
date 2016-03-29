import java.util.Random;

/**
 * Created by User on 28.03.2016.
 */
public class Recursion {
    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i=0; i < arr.length; i++){
            arr[i] =  1+ (int)(Math.random()*(200 - 1)+1);;
        }

        for (int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }

}
