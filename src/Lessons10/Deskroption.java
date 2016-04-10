package Lessons10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by User on 06.04.2016.
 */
public class Deskroption {
    private HashMap<String,String > fileEXC = new HashMap<>();

    public void loadFromFile(String fileAddres){
        if(fileAddres == null){
            throw new IllegalArgumentException("nul pointer");
        }
        File file  = new File(fileAddres);
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String temp = "";
            for (;(temp = br.readLine()) != null;){
                String[] arrayExc = temp.split("\t");
                fileEXC.put(arrayExc[0], arrayExc[1]);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
    private String getFileExc(String fileName){
        int i = fileName.lastIndexOf(".");
        if (i==-1){
            return "";

        }
        return fileName.substring(i+1);
    }
    public String getFileDescription(String fileName){
        if (fileName == null){throw new IllegalArgumentException("null fileName");
        }
        String exc = getFileExc(fileName);
        String description = fileEXC.get(exc);
        if (description == null){
            description = "UNKNOW";
        }
        return description;
    }
}
