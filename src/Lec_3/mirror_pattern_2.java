package Lec_3;

import java.util.Scanner;

public class mirror_pattern_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
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
			
			if(row<n)
			{
				space--;
				star++;
			}
			else 
			{
				space++;
				star--;
			}
			

			// next row prep..
			// Mirror Concept
			
			row++;
			System.out.println();
			

		}
		sc.close();

	}

}
