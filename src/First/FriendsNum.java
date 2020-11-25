// idan hur 318247822
package First;

public class FriendsNum {

	public static void main(String[] args) {
		int counter = 1 ;
		int num1 = 220;
		int num1Secand=220;
		double num1Double;
		int showNum1 = 0;
		int sum1 = 0;
		int sum2 = 0;
		int num2 = 0;
		int num1Cheack = 1;
		double num2Double;
		
		
		for (; counter <= 10; counter++) {
			for (;num1Secand != sum2 ; num1++) {
				showNum1 = num1;
				for (int divider1 = 1; divider1 < num1; divider1++) {
					num1Double = num1;
					sum2 = 0;
					if ((num1 / divider1 ) == (num1Double / divider1 )) {
						sum1 = sum1 + divider1;
					}
					num1Secand = num1;
				}
				num2= sum1;
				sum1 = 0;
				for (int divider2 = 1; divider2 < num2; divider2++) {
					num2Double=num2;
					if ((num2Double / divider2 ) == (num2 / divider2 )) {
						sum2 = sum2 + divider2;
					}
				}
				if (num2==showNum1) {
					sum2 = 0;
				}
				if (num1Cheack == num2) {
					sum2 = 0;
				}
	}
			    num1Cheack = showNum1;
				System.out.println(counter + ") " + showNum1 + " and " + num2 + " are mates");	
				sum1 = 0;
				sum2 = 0;
			}
		}
	}

