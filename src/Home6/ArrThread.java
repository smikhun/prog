package Home6;

/**
 * Created by User on 29.03.2016.
 */
public class ArrThread extends Thread{
    private int[] arr;
    int begin;
    int end;
    public long sum;

    public ArrThread(int[] arr, int begin, int end) {
        this.begin = begin;
        this.end = end;
        this.arr = arr;
        this.sum = 0;
        this.start();

    }
    public long getSum(){
        return sum;
    }

    @Override
    public synchronized void run() {

        for (int i = begin; i < end; i++) {
            sum += arr[i];
        }

    }

}
