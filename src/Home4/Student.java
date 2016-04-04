package Home4;
import java.util.Objects;
import java.util.Scanner;


/**
 * Created by User on 15.03.2016.
 */
public class Student extends Person implements Comparable{
    private int kurs;
    private String specialty;

    public Student(String name, int age, String sex, int kurs, String specialty) {
        super(name, age, sex);
        this.kurs = kurs;
        this.specialty = specialty;
    }

    public Student() {
        super();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setSex(String sex) {
        super.setSex(sex);
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getKurs() {
        return kurs;
    }

    public void setStudentsData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Set name");
        String name = sc.next();
        setName(name);

        System.out.println("Set age");
        int age = sc.nextInt();
        setAge(age);

        System.out.println("Set sex");
        String sex = sc.next();
        setSex(sex);

        System.out.println("Set kurs");
        int kurs = sc.nextInt();
        setKurs(kurs);

        System.out.println("Set speciality");
        String specialty = sc.next();
        setSpecialty(specialty);
    }



    @Override
    public void printStudent() {
        super.printStudent();
        System.out.println(" Kurs " + kurs + " Speciality " + specialty);
    }

    @Override
    public int compareTo(Object o) {
        System.out.println(o);
        Student tmp = (Student) o;
        int a = getName().compareTo(tmp.getName());
        return a;

    }

    @Override
    public String toString() {
        return getName()+ " " + getAge()+ " " + getSex() + " "+ getKurs()+ " " + getSpecialty();
    }
}
