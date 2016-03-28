package Lesson5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by User on 21.03.2016.
 */
public class FileOpeation {
    public static void fileCopy(File fileS, File fileD) {
        if (fileS  == null){
            throw new IllegalArgumentException("Null pointer");
        }
    /* if (!fileS.exists() || !fileS.isFile()){
         throw  new IllegalArgumentException("File does not exist");
     }
        try( FileInputStream fis = new FileInputStream(fileS);
        FileOutputStream fos = new FileOutputStream(fileD);)
        {
            byte [] bufferedArray = new byte[1024*4];
            int readByte = 0;
            for (;(readByte = fis.read(bufferedArray))>0;){
                fos.write(bufferedArray,0, readByte);
            }

        catch(IOException e){
            System.out.print(e);
        }  }           */
    }
    public static void CopyFolder(String folderS, String folderD, String ...exc){
        if(folderS == null || folderS.length() == 0){
            throw new IllegalArgumentException("null pointer");
        }
        File folderSO = new File(folderS);
        if(!folderSO.exists() || !folderSO.isDirectory()){
            throw  new IllegalArgumentException();
        }
        File folderDo = new File(folderD);
        File [] files = folderSO.listFiles();
        for (File file : files){
            if (check(file, exc)){
                File cope = new File(folderDo, file.getName());
                fileCopy(file, cope);
            }
        }
    }
    private static boolean check(File file, String...exc){
        for (String  string: exc){
            if (file.isFile() && file.getName().endsWith(string)){
                return true;
            }
        }
        return false;

    }
}
