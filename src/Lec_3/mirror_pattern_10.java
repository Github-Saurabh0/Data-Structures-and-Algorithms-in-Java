package Lec_3;

import java.util.Scanner;

public class mirror_pattern_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int n = sc.nextInt();
		int row = 1;
		int spacestart = 0;
		int spacemiddle = n-2;

		while (row <= n) {

			
			// space 
			int i = 1; 
			while(i<=spacestart)
			{
			 System.out.print("  ");
			 i++;
			}
			
			// star 
			System.out.print("* ");
				
		    // space 
			int k = 1; 
			while(k<=spacemiddle)
			{
			 System.out.print("  ");
				k++;
			}
			
			// star	
			if(row==n/2+1)
			{
            //System.out.print("  ");
			}
			else
			{
				System.out.print("* ");
			}
			
			//next prep // Mirror Concept 
			
			if(row<n/2+1)
			{
				spacestart++;
				spacemiddle-=2;
			}
			else
			{
				spacestart--;
				spacemiddle+=2;
			}
			row++;
			System.out.println();
		}
		sc.close();
	}
}


