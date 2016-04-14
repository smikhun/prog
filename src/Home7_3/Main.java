package Home7_3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by User on 11.04.2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Set address folder");
        String foldermap = sc.next();
        File folder = new File(foldermap);
        ///////////
        deleteRecurs(folder).delete();

    }

    static File deleteRecurs(File folder) {
        try {
            if (folder.list().length == 0) {
                return folder;
            } else {

                String[] ls = folder.list();
                for (int i = 0; i < ls.length; i++) {
                    File tmp = new File(folder.getAbsolutePath() + "/" + ls[i]);

                    System.out.println(" -- " + tmp.getAbsolutePath());

                    if (tmp.isDirectory()) { deleteRecurs(tmp).delete();
                    }else{
                        tmp.delete();
                    }
                }
            }
        }catch (NullPointerException e){System.out.print("Wrong address folder");}
        return folder;
    }
}
