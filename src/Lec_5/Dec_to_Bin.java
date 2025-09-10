package Lec_5;

import java.util.Scanner;

public class Dec_to_Bin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int n = sc.nextInt();
		int sum = 0;
		int mul = 1;
		
		while(n>0)
		{
			int rem = n%2;
			sum = sum + rem * mul;
			mul = mul * 10;
			n = n/2;
		}
		System.out.println(sum);
	}
}
