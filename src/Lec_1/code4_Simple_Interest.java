package Lec_1;

import java.util.Scanner;

public class code4_Simple_Interest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter principal Value: ");
		int p = sc.nextInt();
		System.out.print("Please Enter rate Value: ");
		int r = sc.nextInt();
		System.out.print("Please Enter time Value: ");
		int t = sc.nextInt();
		// Formula Sinple Interest 
		int si = (p*r*t)/100;
		System.out.print("This is your Simple Intrest: " + si);
	}

}
