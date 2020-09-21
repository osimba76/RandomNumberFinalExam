package generateRdmNumbers;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		
		
		int rd=0; int smallest=100;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 500 :");
		int N = input.nextInt();
	    Random numb = new Random();
	    rd = numb.nextInt(1000);
	    for(int i=0;i<N;i++) {
	    	rd = numb.nextInt(1000);
	    	System.out.println(rd);
	    	if(rd<smallest) {
	    		smallest=rd;
	    	}
	    	
	    }
	    System.out.println("The smallest number is : " +smallest);
		
		
		
 }
}
        	
    