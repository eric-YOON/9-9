/**
 * ���հ� ��� 
 * �迭�� ��� ��Ҹ� ���ؼ� ���հ� ����� ���Ѵ�.
 * 
 */

package sum;

public class array_total_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;                //������ �����ϴº���
		float average =0f;         // ����� �����ϴº���
		
		int[] score = {100,88,100,100,90};
		for (int i=0; i <score.length ; i++)  {
			sum += score[i];    // �ݺ����� �̿��ؼ� �迭�� ����Ǿ��ִ� ������ ��� ���Ѵ�.
		}
		average = sum / (float)score.length ;    //������� float �� ��� ���� ����ȯ 
		//          478/5         478/(float5)     478/5.0f         478f/5.0f   95.6f
		System.out.println("����: " + sum );
		System.out.println("���: " + average);
	}

}
