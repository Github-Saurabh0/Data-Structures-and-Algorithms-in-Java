package Lec_4;

import java.util.Scanner;

public class check_prime {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int count = 0;
			for (int i = 2; i < n; i++)
			if (n % 2 == 0) {
			count++;
			}
			if (count >= 1) {
			System.out.println("Not Prime");
			} else {
			System.out.println("Prime");

			}

	}

}
