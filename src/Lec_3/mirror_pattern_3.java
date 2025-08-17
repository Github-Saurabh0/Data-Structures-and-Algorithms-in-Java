package Lec_3;

import java.util.Scanner;

public class mirror_pattern_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space = n-1;

		while (row <= 2*n-1) {

			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.err.print("* ");
				j++;
			}
			// next row prep..
			// Mirror Concept
			if(row<n)
			{
				space--;
				star--;
			}
			else 
			{
				star++;
				space++;
			}
			
			row++;
			System.out.println();
			

		}
		sc.close();

	}

}
