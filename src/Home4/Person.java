package Home4;

/**
 * Created by User on 15.03.2016.
 */
public class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /////////////////////////////////////////////////////////
    public void printStudent(){
        System.out.print("Name " + name + " Sex " + sex + " Age " +  age);
    }

    public String getStudent(){
        String get = "Name " + name + " Sex " + sex + " Age " +  age;
        return get;
    }
}
