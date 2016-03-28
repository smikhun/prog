package Home4;

import com.sun.xml.internal.ws.policy.jaxws.PolicyWSDLGeneratorExtension;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;



/**
 * Created by User on 15.03.2016.
 */
public class Group implements IfaceUniversity {
    private Student[] students = new Student[3];
    private int number;
    private String faculty;


    public Group(int number, String faculty) {
        this.number = number;
        this.faculty = faculty;

    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = student;
                    break;
                }
            }


    }

    public void testGroup()throws IndexOutOfBoundsException{
        int count = 0;
        for(Student x: students){
            if (x == null) count++;
        }
        if (count == 0 ) throw new IndexOutOfBoundsException();
    }

    public void dellStudent(Student student){
        for (int i = 0 ; i<students.length; i++) {
            if (students[i] == student) { students[i] = null;
            System.out.println("Student deleted");}
        }
    }

    @Override
    public void showAllPersons() {
        for (Student x : students){
            if (x != null) System.out.println(x.getName());
        }


    }

    @Override
    public void searchPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Search: set student name");
        String setsearch = sc.nextLine();
        for (Student i : students){
            try {
                String name = i.getName();
                if (name.equals(setsearch)) {
                    System.out.print("Group name " + faculty + " Name " + i.getName() + " Age " + i.getAge());
                }
            }catch (NullPointerException e){}

        }

    }



}
