package Home3;

/**
 * Created by User on 15.03.2016.
 */
public class Start {
    public static void main(String[] args) {
        Group gr1 = new Group(1,"programer");

        Student st1 = new Student("Smikhun", "25", "man", 1, "programmer");
        Student st2 = new Student("Vovk", "25", "man", 1, "programmer");
        Student st3 = new Student("Zabolotniy", "25", "man", 1, "programmer");
        Student st4 = new Student("Smikhun", "25", "man", 1, "programmer");
        Student st5 = new Student("Bida", "25", "man", 1, "programmer");
        Student st6 = new Student("Baniy", "25", "man", 1, "programmer");
        Student st7 = new Student("Goncharenko", "25", "man", 1, "programmer");
        Student st8 = new Student("Lipkan", "25", "man", 1, "programmer");
        Student st9 = new Student("Levchenko", "25", "man", 1, "programmer");
        Student st10 = new Student("Gerasimov", "25", "man", 1, "programmer");
        Student st11 = new Student("Kustovskiy", "25", "man", 1, "programmer");
        Student s12 = new Student("Kustovskiy", "25", "man", 1, "programmer");

        st1.printStudent();

        gr1.addStudent(st1);
        gr1.addStudent(st2);
        gr1.addStudent(st3);
        gr1.addStudent(st4);
        gr1.addStudent(st5);
        gr1.addStudent(st6);
        gr1.addStudent(st7);
        gr1.addStudent(st8);
        gr1.addStudent(st9);
        gr1.addStudent(st10);
        gr1.addStudent(st11);

        /////////////////////
        gr1.showAllStudents();

        gr1.searchStudents("Blala");

    }


}
