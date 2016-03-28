package Home4;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;


/**
 * Created by User on 15.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        Group gr1 = new Group(1 , "IT");




        try {
            gr1.testGroup();
        }catch (IndexOutOfBoundsException e) {
            System.out.print("Sorry, no free seats ");}
        /*Student st1 = new Student();
        st1.setStudentsData();

        Student st2 = new Student();
        st2.setStudentsData();*/

        Student st1 = new Student("Vovk", 25, "man", 1, "programmer");
        Student st2 = new Student("Smikhun", 25, "man", 1, "programmer");
        Student st3 = new Student("Boyko", 25, "man", 1, "programmer");

        try {
            gr1.testGroup();
            gr1.addStudent(st1);
            gr1.testGroup();
            gr1.addStudent(st2);
            gr1.testGroup();
            gr1.addStudent(st3);
        }catch (IndexOutOfBoundsException e){
            System.out.print("Sorry, no free seats " + e);
        }

        //gr1.searchPerson();
        //gr1.dellStudent(st1);
        //gr1.showAllPersons();

            Arrays.sort(gr1.getStudents());

        gr1.showAllPersons();
        }




}
