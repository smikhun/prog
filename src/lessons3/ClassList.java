package lessons3;

import java.util.Objects;
import java.io.File;

/**
 * Created by User on 14.03.2016.
 */
public class ClassList {
    private Class[] classArray = new Class[0];
    public void add(Class a){
        if(a==null){
            throw new IllegalArgumentException("Not null please");
        }
        if(a == File.class){
           // throw  new AddClassException(a);
        }
        if ((isPresent(a))){
            return;
        }
        Class [] tempArray = new Class[classArray.length +1] ;
            System.arraycopy(classArray, 0, tempArray, 0, classArray.length);
        tempArray[tempArray.length -1] = a;
        classArray = tempArray;

    }
    private boolean isPresent (Class a){
        for (Class class11: classArray){
            if (class11 == a){
                return true;
            }
        }
        return false;
    }
    public boolean chek(Objects obj){
        if (obj == null){
            throw new IllegalArgumentException("Nul is not valid");
        }
        return isPresent(obj.getClass());
    }
}
