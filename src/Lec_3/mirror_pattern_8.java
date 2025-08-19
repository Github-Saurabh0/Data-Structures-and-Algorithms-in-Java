package Lec_3;

import java.util.Scanner;

public class mirror_pattern_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int n = sc.nextInt();
		int row = 1;
		int spacestart = n/2;
		int spacemiddle = -1;

		while (row <= n) {

			// space
			int i = 1;
			while (i <= spacestart) {
				System.out.print("  ");
			     i++;
			}
			
			// star
			System.out.print("* ");
			
			// space
			int j = 1;
			while (j <= spacemiddle) {
				System.out.print("  ");
			     j++;
			}
			
			// star
			if(row == 1  || row ==n) {
				System.out.print("  "); 
			}
			else
			{
				System.out.print("* ");
			}
			
			
			// next row prep..
			// Mirror Concept
			
			if(row<n/2+1)
			{
                spacestart--;
                spacemiddle+=2;
			}
			else
			{
				 spacestart++;
	             spacemiddle-=2;
			}
		
			row++;
			System.out.println();
			
		}
		sc.close();

	}

}
