package Lec_4;

import java.util.Scanner;

public class break_statement_loops {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int count = 0;
			for (int i = 2; i < n; i++)
			if (n % 2 == 0) {
			count++;
			break;
			
			}
			if (count == 1) {
			System.out.println("Not Prime");
			} else {
			System.out.println("Prime");

			}

	}

}
