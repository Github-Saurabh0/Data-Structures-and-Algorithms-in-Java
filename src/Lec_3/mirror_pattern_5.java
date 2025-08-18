package Lec_3;

import java.util.Scanner;

public class mirror_pattern_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n/2;

		while (row <= n) {

			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			
			// next row prep..
			// Mirror Concept
			
			if(row<n/2+1)
			{
				star+=2;
				space--;
			}
			else
			{
				star-=2;
				space++;
			}
			
			row++;
			System.out.println();
			
		}
		sc.close();

	}

}
