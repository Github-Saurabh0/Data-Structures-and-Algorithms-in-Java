package Lec_4;

import java.util.Scanner;

public class Gcd_Hcf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Divisor: ");
		int divisor = sc.nextInt();
		// Divisor = 36
		System.out.print("Enter Divident: ");
		int divident = sc.nextInt();
		// Divident = 60
		
		while(divident % divisor != 0)
		{
			int reminder = divident % divisor;
			divident = divisor;
			divisor = reminder;
			
		}
		while(divisor % divident == 0)
		{
			int reminder = divident % divisor;
			reminder = divisor;
			divisor =divident;
		}
		System.out.println("GCD is: "+ divisor);
	}

}
