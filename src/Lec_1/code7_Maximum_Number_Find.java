package Lec_1;

import java.util.Scanner;

public class code7_Maximum_Number_Find {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int c = sc.nextInt();
		
		if(a>=b && a>=c )
		{
			System.out.println("Higest Value: A = "+ a);
		}
		if(b>=c && b>=a )
		{
			System.out.println("Higest Value: B = "+ b);
		}
		if(c>=a && c>=b )
		{
			System.out.println("Higest Value: C = "+ c );
		}
		
	}
}
