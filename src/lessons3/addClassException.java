package lessons3;

/**
 * Created by User on 14.03.2016.
 */
public class addClassException extends Exception {
    private Class aclass;
    @Override
    public String toString() {
        return "Add"+aclass.toString() + "go away";

    }
}
