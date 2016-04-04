package Home4;

/**
 * Created by User on 23.03.2016.
 */
public class Teacher extends Person {
    private String department;
    private String nameSubject;
    private int experience;

    public Teacher(String name, int age, String sex, String department) {
        super(name, age, sex);
        this.department = department;
    }

    public Teacher(String name, int age, String sex) {
        super(name, age, sex);
    }


}
