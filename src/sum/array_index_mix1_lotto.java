/**
 * �迭�� ��Ҹ� ������� �ٲ۴�.  �ζ���÷��
 */

package sum;

public class array_index_mix1_lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ball = new int[45]; // 45�� ���� �� �����ϱ����� �迭 ����.

		// �迭�� �� ��ҿ� 1~45 �� ���� ����
		for (int i = 0; i < ball.length; i++)
			ball[i] = i + 1; // ball[0]�� 1 �� ����.

		int temp = 0; // �ΰ��� �ٲٴµ� ����� �ӽú���
		int j = 0; // ������ ���� �� ������ ����

		
		
		
		// �迭�� 1��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲپ ���� ���´�.
		// 0��°���� 5���� ��ұ��� ��� 6���� �ٲ۴�.
		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45);
			temp = ball[i];                    // ball[i]�� ball[j] �� ���� ���� �ٲ۴�.
			ball[i] = ball[j];
			ball[j] = temp;
		}

		// �迭 ball �� �տ��� ���� 6���� ��Ҹ� ����Ѵ�.
		for (int i = 1; i <7; i++)
			System.out.printf("ball[%d] = %d%n", i, ball[i]);

	}

}
