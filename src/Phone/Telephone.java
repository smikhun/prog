package Phone;

/**
 * Created by User on 09.03.2016.
 */
public class Telephone {
    String model;
    String number;
    String imei;
    Integer switchoff;

    public Telephone(String model, String number, String imei, Integer switchoff) {
        this.model = model;
        this.number = number;
        this.imei = imei;
        this.switchoff = switchoff;
    }
    String getPhoneNumber(){
        return number;
    }
}
