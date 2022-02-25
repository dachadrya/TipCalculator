package com.bootcamp;

//Java Program to illustrate
//reading from Text File
//using Scanner Class
import java.io.File;
import java.util.Scanner;
public class ReadFromFileUsingScanner
{
public static void main(String[] args) throws Exception
{
 // pass the path to the file as a parameter
 File file = new File("C:\\Users\\daya2\\eclipse-workspace\\TipCalculator\\src\\com\\bootcamp\\input.txt");
 Scanner sc = new Scanner(file);
 
 double meal = sc.nextDouble();
 System.out.println("meal price:  " +meal);
 
 double tip = sc.nextDouble();
 System.out.println("tip persent: " +tip);
 
 int people= sc.nextInt();
 System.out.println("number of people:"+people);
 
 String server= sc.next();
 System.out.println("Server: " +server);
 
// boolean splitCheck=false;
  boolean splitCheck = sc.nextBoolean();
  System.out.println("Split check: " +splitCheck);
  sc.close();
  double tipAmount = meal*(double)tip/(double)100;
  double mealTotal = meal+tipAmount;
	
	System.out.println("you are tipping "+ tip + " % of $" + meal);
	System.out.println("Total tip amount:"+tipAmount);
	System.out.println("your meal total is: $"+ mealTotal);
	
	if(splitCheck==true && people> 1) {
		double each =mealTotal/people;
		System.out.println("Each person owes: $"+ each);
	}
	else if (people ==0) {
		System.out .println("are you sure there is nobody in your party?");
	}
	else {
		System.out.println("Have a nice day");
	}
 
}
}