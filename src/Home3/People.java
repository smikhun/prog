package Home3;

/**
 * Created by User on 15.03.2016.
 */
public class People {
    private String name;
    private String age;
    private String sex;

    public People(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String  getName(){
        return  name;

    }
    public void printStudent(){
        System.out.print("Name " + name + " Sex " + sex + " Age " +  age);
    }

    public String getStudent(){
        String get = "Name " + name + " Sex " + sex + " Age " +  age;
        return get;
    }
}
