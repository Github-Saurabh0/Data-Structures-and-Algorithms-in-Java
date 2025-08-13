package Lec_1;

public class code12_Inc_Dec {

	    public static void main(String[] args) {
	        // Pre-increment (++)
	        int a = 5;
	        int b = ++a; // 'a' becomes 6, then 'b' is assigned 6
	        System.out.println("Pre-increment:");
	        System.out.println("a = " + a); // Output: a = 6
	        System.out.println("b = " + b); // Output: b = 6

	        System.out.println(); // Newline for readability

	        // Post-increment (++)
	        int x = 10;
	        int y = x++; // 'y' is assigned 10, then 'x' becomes 11
	        System.out.println("Post-increment:");
	        System.out.println("x = " + x); // Output: x = 11
	        System.out.println("y = " + y); // Output: y = 10

	        System.out.println(); // Newline for readability

	        // Pre-decrement (--)
	        int p = 15;
	        int q = --p; // 'p' becomes 14, then 'q' is assigned 14
	        System.out.println("Pre-decrement:");
	        System.out.println("p = " + p); // Output: p = 14
	        System.out.println("q = " + q); // Output: q = 14

	        System.out.println(); // Newline for readability

	        // Post-decrement (--)
	        int m = 20;
	        int n = m--; // 'n' is assigned 20, then 'm' becomes 19
	        System.out.println("Post-decrement:");
	        System.out.println("m = " + m); // Output: m = 19
	        System.out.println("n = " + n); // Output: n = 20
	    }
	}