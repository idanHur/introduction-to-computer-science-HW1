// idan hur 318247822

package First;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		int base;
		int spaceCounter=0;
		int rows;
		int limit;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the base of the hour glass:");
		base = s.nextInt();
		rows = base/2 +1;
		limit = base;
				
		for (int i = 1; i <= rows ; i++) {
			for (int j = 0; j < spaceCounter; j++) {
				System.out.print(" ");
			}
			for (int j = base; j > 0; j--) {
				System.out.print("*");
				
			}
			System.out.println();
			spaceCounter++;
			base = base-2;
		}
		
		spaceCounter--;
		base = base+2;
		 
		for (int i = 0 ; i <= rows ; i++) {
			for (int j = 0; j < spaceCounter; j++) {
				System.out.print(" ");
			}
			for (int j = 1 ; j <= base; j++ ) {
				System.out.print("*");
			}
			System.out.println();
			spaceCounter--;	
			base = base+2;
			if (base> limit) {
				break;
				
			}
		}
		

	}

}
