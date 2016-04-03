package Home6;

/**
 * Created by User on 29.03.2016.
 */
public class Task2 {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        //Create ARRAY
        int sizeArraySumm = 20000000;
        //create Array
        int[] arr = new int[sizeArraySumm];
        for (int i=0; i < arr.length;i++){
            arr[i] = 1+ (int)(Math.random()*(100000 - 1)+1);
        }

        long start2 = System.nanoTime();
        oneThread(arr);
        long end2 = System.nanoTime();
        long traceTime2 = end2-start2;
        System.out.println("One Thread MiliSec = " + traceTime2/1000000);

        int sizeTread = 40;                             // numbers thread
        ArrThread[] arr1 = new ArrThread[sizeTread];      // create array Threads
        int sizeArrThread = sizeArraySumm/sizeTread;    //size Array in Thread



        long start = System.nanoTime();

        int countStart = 0;
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

        }



        startTread(arr1);

        plus(arr1);

        long end = System.nanoTime();
        long traceTime = end-start;
        System.out.println("MiliSec = " + traceTime/1000000);

         System.out.print("Stop" + t);

    }

    static void plus (ArrThread[] arr1){
        long tmpSum = 0;
        for (int v = 0; v < arr1.length; v++){

            tmpSum += arr1[v].getSum();

        }
        System.out.println("New Sum  = " + tmpSum);

    }

    static void oneThread(int[] arr){
        long sum = 0;
        for (int i: arr){
            sum += i;
        }
        System.out.println("One Thread Sum = " + sum);
    }

    static void startTread(ArrThread[] arr1){
        for (int i = 0; i <arr1.length; i++){
             arr1[i].start();
            try{
            arr1[i].join();
            }catch (InterruptedException e){}
        }
    }

}
