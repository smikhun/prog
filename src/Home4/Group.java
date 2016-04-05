package Home4;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;


/**
 * Created by User on 15.03.2016.
 */
public class Group implements IfaceUniversity, IfaceSave {
    private Student[] students = new Student[3];
    private int number;
    private String faculty;


    public Group(int number, String faculty) {
        this.number = number;
        this.faculty = faculty;

    }

    public int getNumber() {
        return number;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent() {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students [i]= new Student();
                    students[i].setStudentsData();
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

    public void dellStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Set name Student");
        String dellname = sc.next();
        for (int i = 0 ; i<students.length; i++) {
            if (students[i].getName().equals(dellname)) { students[i] = null;
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

    public Group() {
        super();
    }

    @Override
    public void saveInFile() throws IOException{
    File file = new File("D:/Group_"+getNumber()+".txt");
        FileWriter tmpfile = new FileWriter(file);
        for (Student s :students){
            tmpfile.append(s.toString() +"\r\n");
        }
        tmpfile.flush();
        tmpfile.close();


    }

    @Override
    public void downloadOutFile() throws IOException{
        FileReader sk = new FileReader("D:/Group_" + getNumber() + ".txt");
        BufferedReader tmsk = new BufferedReader(sk);
        String line = " ";
        while ((line = tmsk.readLine())!= null ){
            System.out.println(line);
        }
        sk.close();
        tmsk.close();
    }
}
