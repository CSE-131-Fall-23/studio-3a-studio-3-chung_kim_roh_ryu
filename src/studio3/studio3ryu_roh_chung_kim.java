package studio3;

import java.util.Scanner;

public class studio3ryu_roh_chung_kim {
	public static void main(String[] args) {
		
		
	    Scanner sc = new Scanner(System.in);

	    

	    System.out.println("Enter the finishing number of the code.");
	       int y = sc.nextInt();
		
	       
	       
	       
	       
	       
		for (int i = 2; i <= y; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
           
            
            
            if (isPrime) {
                System.out.println(i);
            }
		}
		
		
		
		
		
		
		
		
		
    }
}
