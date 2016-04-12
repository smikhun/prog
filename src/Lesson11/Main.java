package Lesson11;

import java.net.*;
import java.io.*;
import java.util.*;

/**
 * Created by User on 11.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("c:/url.txt");
            BufferedReader f = new BufferedReader(file);
            String line;

            while ((line = f.readLine()) != null){

            }
        }   catch (IOException e){}

        try{
            URL url=new URL("http://www.google.ru/");
            HttpURLConnection urlc=(HttpURLConnection) url.openConnection();
            System.out.println("Метод запроса на сервер "+urlc.getRequestMethod());
            System.out.println("Тип ответа "+urlc.getResponseMessage());
            Map<String,List<String>> hm=urlc.getHeaderFields();
            Set<String> hdrf=hm.keySet();
            for(String k:hdrf){
                System.out.println("Key = "+k+" : "+"Value = "+hm.get(k));
            }} catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
