package Lessons8;

import Home6.Task2;

/**
 * Created by User on 30.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.addFish(new Fish("Karas","gold", 3));
        tank.addFish(new Fish("Gupic","gerey", 2));
        tank.addFish(new Fish("Som","black", 10));
        System.out.print(tank);
        System.out.println();
        Tank tankTwo = tank.clone();
        System.out.println(tank == tankTwo);
        System.out.println(tankTwo);
        tankTwo.getFish(0).setSge(5);

        System.out.println("Afte cheng");
        System.out.println(tank);
        System.out.println(tankTwo);

        String a = "Java";
        String b = "Java";

        System.out.println(a.equals(b));
    }
}
