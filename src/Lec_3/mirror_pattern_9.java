package Lec_3;

import java.util.Scanner;

public class mirror_pattern_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space =1;

		while (row <= n) {

			// star 
			if(row == 1 || row == n)
			{
				int i = 1; 
				while(i<=star) 
				{
				 System.out.print("* ");
				 i++;
				}
			}
			else
				
			{
				
				System.out.print("* ");
				
		    // space 
				int j = 1; 
				while(j<=n-2)
				{
				 System.out.print("  ");
				 j++;
				}
				
				System.out.print("* ");
			}
			
			//next prep // Mirror Concept 
			
//			if(row<2*n+1)
//			{
//				
//			}
//			else
//			{
//				
//			}
			row++;
			System.out.println();
			
		}
		sc.close();

	}

}
