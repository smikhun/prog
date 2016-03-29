package Home6;

/**
 * Created by User on 29.03.2016.
 */
public class Task2 {

    public static void main(String[] args) {

        //Create ARRAY
        int sizeArraySumm = 1000;
        //create Array
        int[] arr = new int[sizeArraySumm];
        for (int i=0; i < arr.length;i++){
            arr[i] = 1+ (int)(Math.random()*(2000000 - 1)+1);
        }
        //Print Array
        // for (int i = 0; i < arr.length; i++) System.out.println("ch " + arr[i]);



        int sizeTread = 10;                             // numbers thread
        int sizeArrThread = sizeArraySumm/sizeTread;    //size Array in Thread
        ArrThread[] arr1 = new ArrThread[sizeTread];      // create array Threads

        int [] arrThread = new int [sizeArrThread];      //crete array for thread
        int countStart = 0;

        long start = System.nanoTime();
        for (int i = 0; i < arr1.length; i++){ //create and run threads

            int countEnd = countStart + sizeArrThread; //diapazon array tread
            int c = 0 ;                                //count fo array thread
            for (int j = countStart; j < countEnd; i++){ //rebild array
                arrThread[c] = arr[j];
                c++;
            }
            arr1[i] = new ArrThread(sizeArrThread, arrThread);
            arr1[i].start();
        }
        long threadSum = 0;
        for (int i = 0; i < arr.length; i++){

          threadSum = arr1[i].getSum();
        }

        long end = System.nanoTime();
        long traceTime = end-start;
        System.out.println("MiliSec - " + traceTime/1000000);

    }
}
