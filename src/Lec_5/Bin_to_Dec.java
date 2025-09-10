package Lec_5;

import java.util.Scanner;

public class Bin_to_Dec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int n = sc.nextInt();
		int sum = 0;
		int mul = 1;
		
		while(n>0)
		{
			int rem = n%10;
			sum = sum + rem * mul;
			mul = mul * 2;
			n = n/10;
		}
		System.out.println(sum);
		
	}

}
