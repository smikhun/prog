package zoo;

/**
 * Created by User on 09.03.2016.
 */
public class Zoo {
    private Animals[] animalsArray = new Animals[15];
    private String zooName;

    public Zoo(String zooName) {
        this.zooName = zooName;
    }
    public void addAnimal(Animals animal){
        for (int i = 0; i < animalsArray.length; i++) {
            if (animalsArray[i] == null) {
                animalsArray[i] = animal;
                return;
            }
            System.out.println("Zoo is full. Take you animals and go away");
        }

    }
    public  String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Zoo - ").append(this.zooName).append(System.lineSeparator());
        for (int i=0; i < animalsArray.length; i++){
            sb.append((i + 1)).append(") ");
            if (animalsArray[i] != null){
                    )sb.append(animalsArray[i]);
            }
        }
    }

}
