package Home1;

/**
 * Created by IntelliJ IDEA.
 * User: User
 * Date: 08.03.16
 * Time: 17:37
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        
    Cat cat1 = new Cat("Tom", 2, "blue","man", 2.5 );
    Cat cat2 = new Cat("Catty", 2, "Grey","woman", 2.1 );

    cat1.addWeight(1.2);
    cat1.printWeight();
    }
}
