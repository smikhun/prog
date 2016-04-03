package Lessons8;

/**
 * Created by User on 30.03.2016.
 */
public class Fish implements Cloneable{
    private String type;
    private String color;
    private int age;

    public Fish(String type, String color, int age) {
        this.type = type;
        this.color = color;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getSge() {
        return age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSge(int sge) {
        this.age = sge;
    }
    @Override
    public String toString() {
        return "Fish [type=" + type + ", colour=" + color + ", age=" + age + "]";
    }
    @Override
    public Fish clone(){
        try {
            return (Fish)super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}
