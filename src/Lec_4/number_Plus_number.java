package Lec_4;

import java.util.Scanner;

public class number_Plus_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = sc.nextInt();
		
		int sum = 0;
		while(number>0)
		{
			int reminder = number % 10;
			sum = sum + reminder;
			number = number/10;
		}
		System.out.println("Your Addition: "+ sum);
	}

}
