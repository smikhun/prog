package Lessons6;

/**
 * Created by User on 23.03.2016.
 */
public class SingleThread implements Runnable {

    private int generation;
    private Thread th;

    public SingleThread(int generation) {
        this.generation = generation;
        th = new Thread(this);
        th.start();
    }

    public Thread getTh() {
        return th;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "->" + this.generation);
        if (generation < 2){
            SingleThread[] array = new SingleThread[3];
            for (int i = 0;i < array.length;i++){
                new SingleThread(generation +1);
            }
        }
    }
}
