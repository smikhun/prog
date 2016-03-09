package Phone;

/**
 * Created by User on 09.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        Telephone tel1 = new Telephone("nokia7210","0671304035","123524587963", 0);
        Telephone tel2 = new Telephone("simens 7210","0671304035","123524587963", 0);
        Telephone tel3 = new Telephone("nokia3410","0671304035","123524587963", 1);

        Operator Kyivstar = new Operator("Kyivstar","Ukrain");

        Kyivstar.addPhone(tel1);
        Kyivstar.addPhone(tel2);
        Kyivstar.addPhone(tel3);

        Kyivstar.showPhone();

        Kyivstar.caalPhone(tel3);

    }
}
