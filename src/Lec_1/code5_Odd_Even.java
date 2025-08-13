package Lec_1;

import java.util.Scanner;

public class code5_Odd_Even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Value: ");
		int n = sc.nextInt();
		if (n % 2 == 0 ) {
			System.out.print("Number is Even");
		} 
		else{
			System.out.print("Number is odd");
		}

	}

}
