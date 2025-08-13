package Lec_1;

import java.util.Scanner;

public class code9_Loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value : ");
		int n = sc.nextInt();
		int i = 1;
		while(i<=n){
			System.out.println(i +":"+ " Hello");
			i++;
		}

	}

}
