package sum;

import java.util.Arrays;

/**
 * 
 * ��� ��! �����
 * 
 * 1) �迭�� ���̰� Ȧ���� ��츸 2) �迭�� ���̰� ����� ���� ���� ���� ���ؼ� ����� ��!
 * 
 * @author Y
 *
 */
public class Array_center_index_Play3 {

	public static void main(String[] args) {
		
		int [] scores = new int [ 5 ]; // [0, 2, 4]
		for ( int i = 0 ; i < scores.length ; i ++) {
			scores[i] = (int)(Math.random()*10);
		}
		System.out.println( Arrays.toString(scores));
		
		// 5: [ 0, 1, 2, 3, 4 ] scores.length 5/2 = 2
		// 7: [ 0, 1, 2, 3, 4, 5, 6 ] scores.length 7/2 = 3
		// 6 [ 0, 1, 2, 3, 4, 5]  6/2 = 3(������), 3-1(����)
		// 10001 
		// scores.length 
		System.out.printf("length : %d, ��� %d\n", scores.length, scores.length/2);
		if (scores.length%2 == 1 ) {
			// 1, 3, 5, 7, 9, 11, 13, .... 
			int i = scores.length/2;
			System.out.println( scores[i] );
		} else if (scores.length%2==0) {
			// int p = (scores.length/2 ) + (scores.length/2-1); // �ε����� ���ϸ� �ȵ˴ϴ�!
			int o = scores[scores.length/2] ; // [ 12, 42, 56, 11] 4/2>=2
			int u = scores[scores.length/2-1];
			double f = (o+u)/2d;
			System.out.println( f );
		}
	}
}
