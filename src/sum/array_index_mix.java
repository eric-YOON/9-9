/**
 * 
 *�迭�� ����� ������ �ݺ��ؼ� �ٲ۴�. 
 *  ī�� ���� ����....
 * 
 */

package sum;

public class array_index_mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = new int[10];
		
		for (int i=0; i<numArr.length; i++)  {
			numArr[i] = i ;  //�迭�� 0~9 �� ���ڷ� �ʱ�ȭ �Ѵ� . 
			System.out.print(numArr[i]);                 
		}
		System.out.println();
		
		for (int i=0; i<100; i++)  {                    // �������� ����� �迭 �ε��� �� numArr[0]�� ��Ұ��� 100�� �ݺ�.
			int n = (int) (Math.random() *10);     //0~9���� �Ѱ��� ���Ƿ� ��´�.
			
		
			int tmp = numArr[0];
			numArr[0] = numArr[n];          // numArr[0]�� numArr[n] �� ���� ���� �ٲ�.
			numArr[n] = tmp;               
			
			// for (int i=0; i<numArr.length; i++ )    100�� �������� �����°ź��� �̰� ��ȿ�����̴� 
			// int tmp = numArr[i];
			// numArr[i]=numArr[n];
			// numArr[n]=tmp;
			
		}
		
		for (int i=0; i<numArr.length; i++)
			System.out.print(numArr[i]);
	}

}
