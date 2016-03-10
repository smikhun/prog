package Home1;

/**
 * Created by IntelliJ IDEA.
 * User: User
 * Date: 08.03.16
 * Time: 8:00
 * To change this template use File | Settings | File Templates.
 */
public class Cat {
    private String name;
    private int age;
    private String color;
    private String sex;
    private double weight;

    public Cat(String name, int age, String color, String sex, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
        this.weight = weight;
    }

    public double addWeight(double addweight){
        weight += addweight;
        return weight;
    }
    public void printWeight(){
        System.out.print("Cat weight " + name + " = " + weight + "kg");
    }
}




