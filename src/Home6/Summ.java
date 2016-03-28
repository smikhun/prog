package Home6;

/**
 * Created by User on 28.03.2016.
 */
public class Summ extends Thread{
    private int[] arr;
    private long sum;

    public Summ(int size) {
        this.arr[size] = arr[size];
        this.sum = 0;
    }

    public void serArr(){
        for (int i=0; i < arr.length;i++){
            arr[i] = 1+ (int)(Math.random()*(2000000 - 1)+1);
        }
    }

    public void printArr(){
        for (int i = 0; i < arr.length; i++) System.out.println("ch " + arr[i]);
    }



    @Override
    public void run() {


    }
}
