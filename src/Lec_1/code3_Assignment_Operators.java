package Lec_1;

public class code3_Assignment_Operators {

	public static void main(String[] args) {
		
	System.out.println("========================================");
	int a = 10;
    int b = 20;
    int c = 0;
    System.out.println("int a = 10;");
    System.out.println("int b = 20;");
    System.out.println("int c = 0;");
    System.out.println("========================================");
    c = a + b;
    
    System.out.println("c = a + b = " + c );
    System.out.println("========================================");
    c += a ;
    System.out.println("c += a  = " + c );
    System.out.println("========================================");
    c -= a ;
    System.out.println("c -= a = " + c );
    System.out.println("========================================");
    c *= a ;
    System.out.println("c *= a = " + c );
    System.out.println("========================================");
    c /= a ;
    System.out.println("c /= a = " + c );
    System.out.println("========================================");
    c = 30;
    c %= a ;
    System.out.println("c %= a  = " + c );
    System.out.println("========================================");
//    c = 30;
//    c &= a ;
//    System.out.println("c &= a  = " + c );
//    System.out.println("========================================");
//    c = 30;	  
//    c ^= a ;
//    System.out.println("c ^= a   = " + c );
//    System.out.println("========================================");
//    c = 30;
//    c |= a ;
//    System.out.println("c |= a   = " + c );
//    System.out.println("========================================");
	}

}
