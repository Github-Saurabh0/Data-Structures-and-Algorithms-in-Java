package Lec_1;

import java.util.Scanner;

public class code10_Sum_Of_Natural_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value: ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i<=n) {
			sum = sum + i;
            System.out.print(i);
            if (i < n) {
                System.out.print("+");
            }
            i++;
        }
		
        System.out.println(" = " + sum);
		sc.close();
	}

}
