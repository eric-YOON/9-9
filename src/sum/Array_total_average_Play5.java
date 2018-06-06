package sum;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 배열 값들의 평균을 구합니다!
 * 
 * @author Y
 *
 */
public class Array_total_average_Play5 {

	public static void main(String[] args) {

		int[] scores = new int[5]; // [0, 2, 4]
		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(scores));
		
		// 1. 총합을 구해서 
		// 2. 배열의 길이로 나눔!
		// [ 56, 12, 78, 32, 73]
		int total = 0; // 146
		int sum = 0;
		double q = 0.;
		for (int v : scores ) {
			total = v + total ; 
		}
		
		q= 1.0 * total / scores.length ;
		System.out.println("총점:" + total);
		System.out.println("평균 : " + q);
//		System.out.println(24.0/5);
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
	}
	
	static double mean ( int [] nums) {
		return 0.0;
	}
}
