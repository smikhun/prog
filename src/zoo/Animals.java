package zoo;

/**
 * Created by User on 09.03.2016.
 */
public class Animals {
    private String color;
    private int age;
    private double weight;
    private boolean sex;

    public Animals(String color, int age, double weight, boolean sex) {
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isSex() {
        return sex;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", sex=" + sex +
                '}';
    }
}
