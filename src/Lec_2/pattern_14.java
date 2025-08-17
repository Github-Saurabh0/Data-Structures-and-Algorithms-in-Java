package Lec_2;

import java.util.Scanner;

public class pattern_14 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int n = sc.nextInt();

        int row = 1;
        int star = n;
        int space = 0;

        while (row <= n) {

            // left stars
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }

            // spaces
            int j = 2;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }

            // right stars
            int k = 1;
            if(k==1 && star == n  ) {
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

            // next row prep
            row++;
            System.out.println();
            space += 2;
            star--;
        }

        sc.close();
    }
}
