package sum;

import java.util.Arrays;
/**
 * �迭�� ù��°�� ������ ���� ���غ�
 * @author Y
 *
 */
public class Array_choice_index_sum_Play2 {

	public static void main(String[] args) {
		
		int [] scores = new int [ 5 ]; // [0, 2, 4]
		for ( int i = 0 ; i < scores.length ; i ++) {
			scores[i] = (int)(Math.random()*10);
		}
		System.out.println( Arrays.toString(scores));
		
		int first = scores[0];
		int last = scores[scores.length-1];
		System.out.println(first + last);
	}
}
