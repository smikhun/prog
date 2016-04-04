package Home4;

import java.io.IOException;
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

        for (; ;){

        System.out.println("Set number menu ");
        System.out.println("1 Students ");
        System.out.println("2 Teacher ");
        System.out.println("0 Exit ");

        Scanner sc = new Scanner(System.in);
        int choes = sc.nextInt();

        switch (choes) {
            case 1:
                System.out.println("Students ");
                System.out.println("Set number menu");
                System.out.println("1 Add students");
                System.out.println("2 Dell students");
                System.out.println("3 Search Students");
                System.out.println("4 Sort Group students");
                System.out.println("5 Save Group In File");
                System.out.println("6 Download Group out File");
                System.out.println("7 Print Groups' Students");
                System.out.println("0 Exit");
                Scanner scan = new Scanner(System.in);
                int ind = scan.nextInt();
                switch (ind) {
                    case 1:
                        try {
                            gr1.testGroup();
                            gr1.addStudent();
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println(e);
                        }
                        break;
                    case 2:
                        gr1.dellStudent();
                        break;
                    case 3:
                        gr1.searchPerson();
                        break;
                    case 4:
                        Arrays.sort(gr1.getStudents());
                        break;
                    case 5:
                        try {
                            gr1.saveInFile();
                        } catch (IOException e) {
                            System.out.println(e);
                        }
                        break;
                    case 6:
                        try {
                            gr1.downloadOutFile();
                        }catch (IOException e){System.out.println(e);}
                        break;
                    case 7: gr1.showAllPersons();
                    case 0:
                        break;
                }


                break;
            case 2:
                System.out.print("Hello Teacher");
                break;
            case 0:
                return;


        }
    } }
}

