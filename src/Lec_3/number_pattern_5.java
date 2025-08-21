package Lec_3;

import java.util.Scanner;

public class number_pattern_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n-1;
		
		while(row<=n) {
			
			//space
			int i = 1;
			while(i<=space) {
				System.out.print("  "); //tab saperate
				i++;
				
			}
			
			//star
			int j = 1;
			int val = 1;
			while(j<=star) {
				System.out.print(val+" ");
				if(j<star/2+1)
				{
					val++;
				}
				else 
				{
				val--;
			    } 
				j++;
			}
			
			//next row prep..
			row++;
			System.out.println();
			space--;
			star+=2; // star = star + 2 
			
		}
		sc.close();

	}

}
