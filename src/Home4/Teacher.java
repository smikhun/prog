package Home4;

/**
 * Created by User on 23.03.2016.
 */
public class Teacher extends Person {
    String department;
    String nameSubject;
    int experience;

    public Teacher(String name, int age, String sex, String department) {
        super(name, age, sex);
        this.department = department;
    }

    public Teacher(String name, int age, String sex) {
        super(name, age, sex);
    }


}
