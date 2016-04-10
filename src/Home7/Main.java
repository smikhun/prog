package Home7;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by User on 10.04.2016.
 */
public class Main {
    public static void main(String[] args) {

        ExecutorService tr = Executors.newFixedThreadPool(2);
        tr.execute(new Ship("Peremozhec", 10));
        tr.execute(new Ship("Volodumer", 15));
        tr.execute(new Ship("Olshanskiy", 12));
        tr.shutdown();
    }
}
