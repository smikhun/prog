package Home7;

/**
 * Created by User on 10.04.2016.
 */
public class Ship implements Runnable {
    private String name;
    private int shipment;

    public Ship(String name, int shipment) {
        this.name = name;
        this.shipment = shipment;
    }

    public String getName() {
        return name;
    }

    public int getShipment() {
        return shipment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShipment(int shipment) {
        this.shipment = shipment;
    }

    @Override
    public void run() {
        for (int i = 1; i <=shipment; i++){
            System.out.println(getName() + " Box " + i + " Unloaded");
            try {
                Thread.sleep(500);
            }   catch (InterruptedException e){System.out.println(e);}
        }

    }
}
