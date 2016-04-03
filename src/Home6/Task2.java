package Home6;

/**
 * Created by User on 29.03.2016.
 */
public class Task2 {

    public static void main(String[] args) {

        //size array
        int sizeArraySumm = 100000000;
        //create Array
        int[] arr = new int[sizeArraySumm];
        for (int i=0; i < arr.length;i++){
            arr[i] = 1+ (int)(Math.random()*(200000 - 1)+1);
        }

        long start2 = System.nanoTime();
        oneThread(arr);
        long end2 = System.nanoTime();
        long traceTime2 = end2-start2;
        System.out.println("One Thread MiliSec = " + traceTime2/1000000);



        long start = System.nanoTime();
        multiThreads(1,sizeArraySumm,arr);
        long end = System.nanoTime();
        long traceTime = end-start;
        System.out.println("MiliSec = " + traceTime/1000000);


    }

    static void plus (ArrThread[] arr1){
        long tmpSum = 0;
        for (int v = 0; v < arr1.length; v++){

            tmpSum += arr1[v].getSum();

        }
        System.out.println("Multi Sum  = " + tmpSum);

    }

    static void oneThread(int[] arr){
        long sum = 0;
        for (int i: arr){
            sum += i;
        }
        System.out.println("One Thread Sum = " + sum);
    }
    static void multiThreads(int numbersTread, int sizeArraySumm, int[] arr){

        ArrThread[] arr1 = new ArrThread[numbersTread];      // create array Threads
        int sizeArrThread = sizeArraySumm/numbersTread;    //size Array in Thread
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
