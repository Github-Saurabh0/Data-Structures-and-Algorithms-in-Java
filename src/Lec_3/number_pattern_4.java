package Lec_3;

import java.util.Scanner;

public class number_pattern_4 {

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
				System.out.print("\t"); //tab saperate
				i++;
				
			}
			
			//star
			int j = 1;
			while(j<=star) {
				System.out.print(j+"\t");
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
