package sum;

import java.util.Arrays;
/**
 * �迭�� ��� ���� �� ���غ�
 * �迭���� ¦�� �ε��� element�鸸 ���غ�   0,2,4, 
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
		
		// �迭�� ��� ������ �� ���ϰ� ����!
		int total = 0;
		for ( int i = 0 ; i < scores.length ; i ++ ) { // i : �迭�� �ε����� ����� ����!
			// System.out.println( scores[i] );
			if ( i % 2 == 0 ) {
				total += scores[i];
			}
		}
		
		System.out.println("¦�� �ε��� ����� ���� "+total);
		System.out.println(scores[0]);  // 0��° �ε��� 
		
		
	}
}
