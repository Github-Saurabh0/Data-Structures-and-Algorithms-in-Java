package Lec_1;

import java.util.Scanner;

public class code11_Print_N_Natural_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value: ");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.println(i);
			i++;
		}

		sc.close();

	}

}
