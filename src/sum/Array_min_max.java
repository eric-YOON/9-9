package sum;

import java.util.Arrays;

/**
 * 
 * �迭���� �ִ밪�� ã�Ƽ� �����!
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
		// max := ù��° ���� �ϴ� �ְ� ����!
		// ��� element�鿡 ���ؼ� ������ ���鼭
		// max �� i��° ���� ����
		int max = scores[0];   // �迭�� ù��° ������ �ƽ����� �ʱ�ȭ�� . 0�ε���
		int min = scores[0];   // �迭�� ù��° ������ �̴ϸذ����� �ʱ�ȭ��. 0�ε��� 
		int tmp = 0;
		// max := 3 
		// [2, 3, 6, 9, 6]
		// scores[1]:=2
		for (int i = 0; i < scores.length; i++) {    // �迭�� �ι�° ��Һ��� �б� ���Ͽ� ���� i  ���� 1�� �ʱ�ȭ��.   
			if (scores[i] > max) {
				max = scores[i];
//				score[i]=tmp ;

			}
			else if (scores[i]<min) {
				min = scores[i];
			}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : "+ min);
	}   // end for main 
}// end for class  
