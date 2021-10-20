package com.greatlearning.ques1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		int floors = sc.nextInt(); //No of floors in building
		int [] arrayFloorSize = new int[floors];
		int dayCount = 0;
		//Accept floor sizes and save in array
		while(floors > 0) {
			System.out.println("Enter the floor size given on day: " + (dayCount + 1));
			arrayFloorSize[dayCount] = sc.nextInt();
			dayCount++;
			floors--;
		}
		if(arrayFloorSize.length > 0) {
			System.out.println("The order of construction is as follows");
			OrderOfConstruction order = new OrderOfConstruction();
			order.orderOfConstruction(arrayFloorSize);
		} else {
			System.out.println("No floors in building");
		}
	
		sc.close();
	}

}
