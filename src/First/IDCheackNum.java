// idan hur 318247822
package First;

import java.util.Scanner;

public class IDCheackNum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int id;
		int sum=0;
		int numCheack = 0 ;
		int checkDigit = 0;
	    int numberOfNum = 0;
	    int differences = 0;
	    
		
		System.out.println("please enter your ID number: ");
		id = s.nextInt();
		checkDigit = id % 10;
		id = id / 10;
		
			for (int i = 1; i < id; ) {
				numCheack = id % 10;
				id = id / 10;
				numCheack = numCheack * 2;
				if (numCheack > 10) {
					sum = sum + (numCheack % 10);
					numCheack = numCheack /10;
					sum = sum + numCheack;
					
				}
				else {
					sum = sum + numCheack;
				}
				numCheack = id % 10;
				id = id / 10;
				sum = sum + numCheack;
				numberOfNum = numberOfNum + 2;
				
		}
			if (numberOfNum >= 9 || numberOfNum <= 6) {
				System.out.println("The ID you enterd has an unvalid amount of numbers please try again");
				
			} 
			else {
				if ((sum % 10)==0) {
					sum = sum / 10;
					if (sum == checkDigit) {
						System.out.println("The ID you enterd is correct");
					}
					else {
						System.out.println("The ID you enterd is unvalid");
					}
					
				} 
				else {
					differences = sum /10;
					differences = (differences + 1) ;
					differences = differences * 10;
					sum = differences - sum;
					if (sum == checkDigit) {
						System.out.println("The ID you enterd is correct");
					}
					else {
						System.out.println("The ID you enterd is unvalid");
					}

				}
			}
	}

}
