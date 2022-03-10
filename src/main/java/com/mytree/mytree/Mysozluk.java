package com.mytree.mytree;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyTree {

    public static void main(String[] args) {
    try {
      System.out.println("Sözlük yüklenior ....");
      File myObj = new File("sozluk.txt");      
      Scanner myReader = new Scanner(myObj); 
       System.out.println("Sözlük yüklendi.");
        String username2 = readInput();
        System.out.println(username2);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          if(data.toLowerCase().startsWith(username2.toLowerCase())){
              System.out.println(data);
          }
        }
    } catch (FileNotFoundException e) {
      System.out.println("Bir Hata Oluştu !");
      e.printStackTrace();
    } 

        
    }
    public static String readInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Bir Kelime Yazıp Enter Tuşuna Basınız ");
        String username = null;
        try {
            username = reader.readLine();
        } catch (IOException e) {
            System.out.println("Bir Hata Oluştu !");
            e.printStackTrace();
        }
        return username;
    }
}
