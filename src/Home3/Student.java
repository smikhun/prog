package Home3;

/**
 * Created by User on 16.03.2016.
 */
public class Student extends People{
    private int kurs;
    private String specialty;

    public Student(String name, String age, String sex, int kurs, String specialty) {
        super(name, age, sex);
        this.kurs = kurs;
        this.specialty = specialty;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void printStudent() {
        super.printStudent();
        System.out.println(" Kurs " + kurs + " Speciality " + specialty);

    }

    @Override
    public String getStudent() {
        String student =  super.getStudent() + " Kurs " + kurs + " Speciality " + specialty;
        return student;

    }
}
