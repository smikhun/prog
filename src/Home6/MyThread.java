package Home6;

import java.math.BigInteger;

/**
 * Created by User on 28.03.2016.
 */
public class MyThread extends Thread {
    private int id;
    private int time;

    public MyThread(int id, int time) {
        this.id = id;
        this.time = time;
    }

    @Override
    public void run() {
        synchronized (this){
        if(id == 0 || id == 1){
            System.out.println("Factirial "+ id + " - " + id );
        }else {
        BigInteger f = BigInteger.valueOf(1);
            for (int i=1; i<=id; i++){

            f.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factirial " + id + " - " + f.toString() );
        }
        }

        /*for (int i = 0; i < 100; i++){
            System.out.println(" Thread" + id + "  -    " + i);
            try {
                Thread.sleep(time);
            }catch (InterruptedException e){}
        } */
    }
}
