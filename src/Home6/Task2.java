package Home6;

/**
 * Created by User on 29.03.2016.
 */
public class Task2 {

    public static void main(String[] args) {

        //Create ARRAY
        int sizeArraySumm = 1000000;
        //create Array
        int[] arr = new int[sizeArraySumm];
        for (int i=0; i < arr.length;i++){
            arr[i] = 1+ (int)(Math.random()*(2000000 - 1)+1);
        }

        //Print Array
        // for (int i = 0; i < arr.length; i++) System.out.println("ch " + arr[i]);
        long start2 = System.nanoTime();
         oneThread(arr);
        long end2 = System.nanoTime();
        long traceTime2 = end2-start2;
        System.out.println("One Thread MiliSec = " + traceTime2/1000000);

        int sizeTread = 3;                             // numbers thread
        int sizeArrThread = sizeArraySumm/sizeTread;    //size Array in Thread
        ArrThread[] arr1 = new ArrThread[sizeTread];      // create array Threads

        //int [] arrThread = new int [sizeArrThread];      //crete array for thread
        int countStart = 0;

        long start = System.nanoTime();

        for (int i = 0; i < arr1.length; i++){ //create and run threads

            int [] arrThread = new int [sizeArrThread];

            int countEnd = countStart + sizeArrThread; //diapazon array tread
            int c = 0 ;                                //count fo array thread
            for (int j = countStart; j < countEnd; j++){ //rebild array
                arrThread[c] = arr[j];
                c++;
            }
            countStart = countEnd;
            arr1[i] = new ArrThread(sizeArrThread, arrThread);
            arr1[i].start();

        }


        System.out.println("tmp = " + tmp);
        long end = System.nanoTime();
        long traceTime = end-start;
        System.out.println("MiliSec = " + traceTime/1000000);

    }
    static long tmp = 0;
    static void plus (long arrsum){
        tmp +=arrsum;
    }

    static void oneThread(int[] arr){
        long sum = 0;
        for (int i: arr){
            sum += i;
        }
        System.out.println("One Thread Sum = " + sum);
    }
}
