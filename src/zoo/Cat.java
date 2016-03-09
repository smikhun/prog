package zoo;

/**
 * Created by User on 09.03.2016.
 */
public class Cat extends Animals{
    private String name;
    private int taleLength;

    public Cat(String color, int age, double weight, boolean sex, String name, int taleLength) {
        super(color, age, weight, sex);
        this.name = name;
        this.taleLength = taleLength;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", taleLength=" + taleLength + super.toString()
                '}';
    }
}
