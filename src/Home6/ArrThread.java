package Home6;

/**
 * Created by User on 29.03.2016.
 */
public class ArrThread extends Thread{
    int[] arr;
    int arrsize;
    public long sum;

    public ArrThread(int arrsize, int[] arr5) {
        this.arrsize = arrsize;
        this.arr = arr5;
        this.sum = 0;

    }
    public long getSum(){
        return sum;
    }

    @Override
    public synchronized void run() {

        for (int i = 0; i < this.arr.length; i++) {
            sum += arr[i];
        }

    }

}
