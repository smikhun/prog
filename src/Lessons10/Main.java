package Lessons10;

/**
 * Created by User on 06.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Deskroption desk = new Deskroption();
        desk.loadFromFile("C:/Users/User/IdeaProjects/prog/desk.txt");
        System.out.println(desk.getFileDescription("avi"));
    }
}
