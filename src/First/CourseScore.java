// idan hur 318247822
package First;

import java.util.Scanner;

public class CourseScore {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		final double AVRG1 = 0.2;
		final double AVRG2 = 0.25;
		final double AVRG3 = 0.3;
		final double TEST_AVRG1 = 0.8;
		final double TEST_AVRG2 = 0.75;
		final double TEST_AVRG3 = 0.7;
		final int HOMEWORK1 = 4;
		final int HOMEWORK2 = 6;
		final int MIN_TEST_SCORE = 54;
		final int HOMEWORK_AVRG_SCALE = 80;
		int finalScore;
		
		
		System.out.println("please enter in this following order: your test score, the average grade of your homework assignments and the amount of homework that was submitted");
		double testScore = s.nextInt();
		double homeworkAvrg = s.nextInt();
		double amountOfHomework = s.nextInt();
		
		if (amountOfHomework <= HOMEWORK1) {
			System.out.println("you failed your final score is: 0 ");
			
		}else if (amountOfHomework > HOMEWORK1 && amountOfHomework <=HOMEWORK2 ) {
			
			if (MIN_TEST_SCORE < testScore) {
				finalScore = (int) ((homeworkAvrg * AVRG1) + (testScore * TEST_AVRG1));
				System.out.println("your final score is: " + finalScore);
			} 
			else {
				System.out.println("your final score is: " + testScore);
			}
		}
		else {
			if (MIN_TEST_SCORE < testScore) {
				finalScore= (int) ((homeworkAvrg * AVRG3) + (testScore * TEST_AVRG3));
				if (finalScore > testScore) {
					System.out.println("your final score is: " + finalScore);
				} 
				else {
					System.out.println("your final score is: " + testScore);

				}
				
			} 
			else {
				if (HOMEWORK_AVRG_SCALE <= homeworkAvrg) {
					finalScore = (int) ((AVRG2 * homeworkAvrg) + (testScore * TEST_AVRG2));
					if (finalScore > testScore) {
						System.out.println("your final score is: " + finalScore);
						
					} 
					else {
						System.out.println("your final score is: " + testScore);

					}
					
				} 
				else {
					finalScore = (int) ((AVRG1 * homeworkAvrg) + (testScore * TEST_AVRG1));
					if (finalScore > testScore) {
						System.out.println("your final score is: " + finalScore);
						
					} 
					else {
						System.out.println("your final score is: " + testScore);

					}

				}

			}
		} 
			
		
	
	}

}
