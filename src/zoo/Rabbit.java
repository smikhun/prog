package zoo;

/**
 * Created by User on 09.03.2016.
 */
public class Rabbit extends Animals{
    private String name;

    public Rabbit(String color, int age, double weight, boolean sex, String name) {
        super(color, age, weight, sex);
        this.name = name;
    }


    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                '}';
    }
}
