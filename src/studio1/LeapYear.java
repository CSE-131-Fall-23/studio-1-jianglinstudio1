package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for arg 1: ");
		int year = in.nextInt();
		
		boolean leapYear = true;
		
		leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		System.out.println(leapYear);
			
		System.out.println(year + " is a leap year: " + leapYear);
	}
}
