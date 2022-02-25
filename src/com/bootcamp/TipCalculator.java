package com.bootcamp;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Please Enter menu price for meal: ");
		double meal = myObj.nextDouble();	
		
		System.out.print("Please Enter tip: ");
		int tip = myObj.nextInt();  
		myObj.nextLine();
		
		
		System.out.print("Enter number of People: ");
		int people=myObj.nextInt();

		
		
		System.out.print("Enter ServerName: ");
		String serverName = myObj.next();
		
		System.out.print("Are you spliting Check:true/false: ");
		boolean splitCheck = myObj.hasNext();
		
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
