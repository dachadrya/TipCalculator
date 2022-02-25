package com.bootcamp;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Car {
	  String make = "";
	  String model = "";
	  int year = 15;
	  String type ="";

	  public static void main(String[] args) 
		  throws IOException
		  
		  {
	    Car dinupCar = new Car();
	    Car dayasCar = new Car();
	    Car psCar = new Car();
	    
	    dinupCar.make = "Honda";
	    dinupCar.model = "Accord";
	    dinupCar.year = 2018;
		dinupCar.type = "Sedan";
	   

	    dayasCar.make = "Toyota";
	    dayasCar.model = "Prius";
	    dayasCar.year = 2013;
	    dayasCar.type = "Stationwagon";

	    psCar.make = "Dodge";
	    psCar.model = "Caravan";
	    psCar.year = 2006;
	    psCar.type = "Minivan";
	    
	    ArrayList<Car> autos = new ArrayList<Car>();
	    autos.add(dinupCar);
	    autos.add(dayasCar);
	    autos.add(psCar);
	    
	    FileWriter writer = new FileWriter("C:\\Users\\daya2\\eclipse-workspace\\TipCalculator\\src\\com\\bootcamp\\output.txt");
	    
	    for (int i=0; i < autos.size(); i++)
	    {
	    	System.out.println(autos.get(i).make);
	    	System.out.println(autos.get(i).model);
	    	System.out.println(autos.get(i).year);
	    	System.out.println(autos.get(i).type);
	    	
	    	writer.write(autos.get(i).make + "\n");
	    	writer.write(autos.get(i).model + "\n");
	    	writer.write("" + autos.get(i).year + "\n");
	    	writer.write(autos.get(i).type + "\n");
	    	writer.write("\n");
	    	writer.write("\n");
	    	System.out.println("Writing successful");
	    }

	    writer.close();
	    
	  /*
	    Path fileName = Path.of("C:\\Users\\daya2\\eclipse-workspace\\TipCalculator\\src\\com\\bootcamp\\output.txt");

	    String text1 = "Following is Owner, make model , year and type of given car\n";
	    text1 = text1 + ("Owner\t\tmake\tmodel\tyear\ttype\n");
	   text1 = text1 + ("Daya\t\t"+ dayasCar.make + "\t"+ dayasCar.model+ "\t" +dayasCar.year+ "\t" +dayasCar.type + "\n");
	  text1 = text1 + ("Prakash\t"+ psCar.make+ "\t"+  psCar.model+ "\t" + psCar.year+ "\t" + psCar.type + "\n");
	    text1 = text1 + ("Dinup\t"+ dinupCar.make+ "\t"+  dinupCar.model+ "\t" +dinupCar.year+ "\t" + dinupCar.type + "\n");
	   
	    Files.writeString(fileName, text1);
	    */
	    
	  }
	}
