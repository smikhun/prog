package Lessons8;

/**
 * Created by User on 30.03.2016.
 */
public class Tank implements Cloneable{
    private Fish [] fishArray = new Fish[0];

    public void addFish(Fish fish){
        if (fish == null){
            throw new IllegalArgumentException("null pointer fish");
        }
        Fish[] temp = new Fish[fishArray.length + 1];
        System.arraycopy(fishArray,0,temp,0, fishArray.length);
        temp[temp.length -1] = fish;
        fishArray = temp;
    }
    public Fish getFish(int index){
        if (index<0){
            throw new IllegalArgumentException("negativ not index");
        }
        if (index>=fishArray.length){
            return null;
        }
        return fishArray[index];
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Fish fish: fishArray){
            sb.append(fish).append(System.lineSeparator());

        }
        return sb.toString();
    }
    @Override
    public Tank clone() {

    Tank cloneTank = new Tank();
        for (Fish fish:fishArray){
            cloneTank.addFish(fish.clone());
        }
        return cloneTank;
    }


}
