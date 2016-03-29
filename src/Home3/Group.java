package Home3;

import java.util.PrimitiveIterator;

/**
 * Created by User on 15.03.2016.
 */
public class Group{
    private Student[] students = new Student[10];
    private int number;
    private String faculty;
    private int count;

    public Group(int number, String faculty) {
        this.number = number;
        this.faculty = faculty;
        this.count = count;
    }

    public void addStudent(Student student){
        try{
        students[count] = student;
            count++;}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("sorry but the group is full");
        }

    }
    public void showAllStudents(){
          for (int i = 0; i < count; i++){
              System.out.println(students[i].getStudent());
          }
      }
    void searchStudents(String name){
        System.out.println("Search result");
        int resultcount =0;
        for (int i = 0; i < count; i++){
            String tmp =students[i].getName();
            if (tmp.equals(name)){
                System.out.println(students[i].getStudent());
                resultcount++;
            }
        }
        if(resultcount ==0){
            System.out.println("Sorry,student missing");
        }
    }
}
