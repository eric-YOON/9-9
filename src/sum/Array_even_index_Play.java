package sum;

import java.util.Arrays;
/**
 * 배열의 모든 값을 다 더해봄
 * 배열에서 짝수 인덱스 element들만 더해봄   0,2,4, 
 * @author Y
 *
 */
public class Array_even_index_Play {

	public static void main(String[] args) {
		
		int [] scores = new int [ 5 ]; // [0, 2, 4]
		for ( int i = 0 ; i < scores.length ; i ++) {
			scores[i] = (int)(Math.random()*10);
		}
		System.out.println( Arrays.toString(scores));
		
		// 배열의 모든 값들을 다 더하고 싶음!
		int total = 0;
		for ( int i = 0 ; i < scores.length ; i ++ ) { // i : 배열의 인덱스로 사용할 목적!
			// System.out.println( scores[i] );
			if ( i % 2 == 0 ) {
				total += scores[i];
			}
		}
		
		System.out.println("짝수 인덱스 요소의 값은 "+total);
		System.out.println(scores[0]);  // 0번째 인덱스 
		
		
	}
}
