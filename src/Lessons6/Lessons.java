package Lessons6;

/**
 * Created by User on 23.03.2016.
 */
public class Lessons {

    public static void main(String[] args) {

        Thread[] thArray =new Thread[3];
        for (int i = 0; i < thArray.length; i++){
            thArray[i] = new Thread(new NewThread(), "thread" + i);
            thArray[i].setDaemon(true);
            thArray[i].start();
        }
        System.out.print("main thread end");
    }
}
