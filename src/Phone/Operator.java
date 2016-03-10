package Phone;

import java.util.ArrayList;

/**
 * Created by User on 09.03.2016.
 */
public class Operator {
    private String name;
    private String country;
    private ArrayList<Telephone> mytelephone;

    public Operator(String name, String country) {
        this.name = name;
        this.country = country;
        this.mytelephone = new ArrayList();
    }
    public void addPhone(Telephone telephone){
        mytelephone.add(telephone);
    }
    public void showPhone(){
        for (int i=0; i < mytelephone.size(); i++ ){
            System.out.println(mytelephone.get(i).model + " | " + mytelephone.get(i).imei + " | " + mytelephone.get(i).number + " | ");
        }
    }
    public void caalPhone(Telephone telephone){
        if (telephone.switchoff == 0){
            System.out.println("Telephone online. Call number " + telephone.number);
            System.out.println("Din Din");
        }else {
            System.out.print("Sory, tou phone offline");
        }
    }
}
