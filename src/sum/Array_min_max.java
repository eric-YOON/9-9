package sum;

import java.util.Arrays;

/**
 * 
 * 배열에서 최대값을 찾아서 출력함!
 * 
 * @author Y
 *
 */
public class Array_min_max {

	public static void main(String[] args) {

		int[] scores = new int[5]; // [0, 2, 4]
		for ( int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * 100); // 2 [0.0 ~ 1.0 )
		}
		System.out.println(Arrays.toString(scores));
		// [ 21, 11, 32, 40, 29]
		// max := 첫번째 값을 일단 넣고 시작!
		// 모든 element들에 대해서 루프를 돌면서
		// max 와 i번째 값을 비교함
		int max = scores[0];   // 배열의 첫번째 값으로 맥스값을 초기화함 . 0인덱스
		int min = scores[0];   // 배열의 첫번째 값으로 미니멈값으로 초기화함. 0인덱스 
		int tmp = 0;
		// max := 3 
		// [2, 3, 6, 9, 6]
		// scores[1]:=2
		for (int i = 0; i < scores.length; i++) {    // 배열의 두번째 요소부터 읽기 위하여 변수 i  값을 1로 초기화함.   
			if (scores[i] > max) {
				max = scores[i];
//				score[i]=tmp ;

			}
			else if (scores[i]<min) {
				min = scores[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : "+ min);
	}   // end for main 
}// end for class  
