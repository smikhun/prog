package Home6;

/**
 * Created by User on 29.03.2016.
 */
public class ArrThread extends Thread{
    int[] arr;
    int arrsize;
    long sum;

    public ArrThread(int arrsize, int[] arr5) {
        this.arrsize = arrsize;
        this.arr = arr5;
        this.sum = 0;

    }

    @Override
    public synchronized void run() {
        long summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        this.sum = summa;
        Task2.plus(summa);
        //System.out.println("sum = " + sum);
    }

    public void printSum(){

        for (int i = 0; i < arr.length; i++) {
            System.out.println("sum = " + sum);
        }



    }

}
