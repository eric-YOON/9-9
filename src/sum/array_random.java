/**
 * 
 * �����ǰ����� �迭 ä��� 

 *  ���ӶǴ� �ҿ������� ����� �迭�� �ʱ�ȭ �Ѵ�.
 *  �迭�� �������ΰ��� �ƴ� �ұ�Ģ���� ���� ���̿��� �������� �̾Ƴ��� �ִ�.
 * 
 */


package sum;

import java.util.Arrays;                  //arrays.tostrinf ����ϱ����� �߰�.

public class array_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] code = {-4,-1,3,6,11};      //�ҿ������� ����� ������ �迭
		int[] arr = new int[10];
		
		for (int i=0; i<arr.length;i++) {
			int tmp = (int)(Math.random()*code.length);         
		//  int tmp = (int)(Math.random()*5;       0,1,2,3,4 �� �ϳ��� ����ȴ�.	
			arr[i] = code[tmp];
		}
		System.out.println(Arrays.toString(arr));

	}
}
