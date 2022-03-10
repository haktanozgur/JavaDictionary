package com.mytree.mytree;
import java.util.Scanner;
import java.io.*;


public class MyTree {

    public static void main(String[] args) {
    
    try {
      System.out.println("Sözlük yükleniyor ....");
      File myObj = new File("sozluk.txt");      
      Scanner myReader = new Scanner(myObj); 
      System.out.println("Sözlük yüklendi.");
      String kelime2 = readInput();
      System.out.println(kelime2);
    while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        
    if(data.toLowerCase().startsWith(kelime2.toLowerCase())){
        System.out.println(data);
                }
            }
    
        }
    
    catch (FileNotFoundException e) {
      System.out.println("Bir Hata Oluştu !");
      e.printStackTrace();
        } 

        
    }
    public static String readInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Bir Kelime Yazıp Enter Tuşuna Basınız ");
        String kelime = null;
        
    try {
        kelime = reader.readLine();
        } 
    catch (IOException e) {
        System.out.println("Bir Hata Oluştu !");
        e.printStackTrace();
        }
    
    return kelime;
    }
}
