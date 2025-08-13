package Lec_2;

import java.util.Scanner;

public class pattern_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		while(row<=n) {
			int i = 1;
			while(i<=row){
				System.out.print("* ");
				i++;
			}
			row++;
			System.out.println();
		}
	}

}
