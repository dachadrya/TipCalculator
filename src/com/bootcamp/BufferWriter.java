package com.bootcamp;

import java.io.FileWriter;
import java.io.BufferedWriter;

public class WritingToAFile {

public static void main(String[] args) {

   try{ 
   FileWriter fstream = new FileWriter ("P:/Computer Science/greeting.txt");
   BufferedWriter info = new BufferedWriter(fstream);

   for(int i = 1; i < 6; i++){
       info.write("Hello");
       info.newLine();
       info.write("Bonjour");
       info.newLine();
       info.write("Guten tag");
       info.newLine();
       info.write("Aloha");
       info.newLine();
       info.write("Nihao");
       info.close();
       }catch(Exception e){
          System.out.println("A write error has occurred");
    }   
  }
}
