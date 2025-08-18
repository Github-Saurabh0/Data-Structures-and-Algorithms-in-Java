package Lec_3;

import java.util.Scanner;

public class mirror_pattern_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int n = sc.nextInt();
		int row = 1;
		int star = n/2+1;
		int space = -1;

		while (row <= n) {

			// star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
			     i++;
			}
			
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			// star
			 int k = 1;
	            if(star == n/2+1  ) {
	            	while (k <= star-1) {
	                    System.out.print("* ");
	                    k++;
	                }
	            }
	            else
	            {
	            	while (k <= star) {
	                    System.out.print("* ");
	                    k++;
	                }
	            }
			
			// next row prep..
			// Mirror Concept
			
			if(row<n/2+1)
			{
                star--;
                space+=2;
			}
			else
			{
				star++;
				space-=2;
			}
//			
			row++;
			System.out.println();
			
            
		}
		sc.close();

	}

}
