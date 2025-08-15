package Lec_2;

import java.util.Scanner;

public class pattern_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space = 0;
		
		while(row<=n) {
			
			//space
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
				
			}
			
			//star
			int j = 1;
			while(j<=star) {
				System.err.print("* ");
				j++;
			}
			
			//next row prep..
			row++;
			System.out.println();
			space = space +2;
			star--;
			
		}
		sc.close();
	}
}
