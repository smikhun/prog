package Home6;

/**
 * Created by User on 28.03.2016.
 */
public class Main {
    public static void main(String[] args) {
       /*
        Thread[] fact = new MyThread[100];

        for (int i = 0; i< fact.length; i++) {
            fact[i] = new MyThread(i, 10);
            fact[i].start();

        }
        */

        long[] arr = new long[20000000];
        for (int i=0; i < arr.length;i++){
            arr[i] = 1+ (long)(Math.random()*(2000000 - 1)+1);
        }

       // for (int i = 0; i < arr.length; i++) System.out.println("ch " + arr[i]);

        long start = System.nanoTime();
        long sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Summ = " + sum);
        long end = System.nanoTime();
        long traceTime = end-start;
        System.out.println("MiliSec - " + traceTime/1000000);
        //Summ s = new Summ(200000);



    }
}
