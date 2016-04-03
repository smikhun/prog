package Home6;

/**
 * Created by User on 28.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        int sizeArray = 100;
        Thread[] fact = new MyThread[sizeArray];

        for (int i = 0; i< fact.length; i++) {
            fact[i] = new MyThread(i, 0);
            fact[i].start();
        }

    }
}
