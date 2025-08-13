package Lec_1;

import java.util.Scanner;

public class code6_Age_voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int age = sc.nextInt();
		if (age >= 18 ) {
			System.out.print("Eligible");
		} 
		else{
			System.out.print("Not Eligible");
		}

	}

}
