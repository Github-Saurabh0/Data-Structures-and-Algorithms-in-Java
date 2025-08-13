package Lec_1;

import java.util.Scanner;

public class code8_Grade_Card {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==============================");
		System.out.print("Enter Your Marks: ");
		int marks = sc.nextInt();
		System.out.println("==============================");
		
		if(marks >= 80) {
			System.out.println("Your Grade : A");
		}
		else if( marks >= 70 && marks <= 80)
		{
			System.out.println("Your Grade : B");
		}
		else if( marks >= 50 && marks <= 70)
		{
			System.out.println("Your Grade : C");
		}
		else if( marks >= 40 && marks <= 50)
		{
			System.out.println("Your Grade : D");
		}
		else
		{
			System.out.println("Your Grade : Fails");
		}


	}

}
