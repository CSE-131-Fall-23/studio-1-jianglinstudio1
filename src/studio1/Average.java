package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first of two integers to be averaged?");
		System.out.println("Enter value for arg 0: ");
		int n1 = in.nextInt();
		System.out.print("Enter value for arg 1: ");
		int n2 = in.nextInt();
		
		System.out.println("Average of " + n1 + " and " + n2 + " is " + (double)(n1 + n2) / 2 + ".");
	}

}

