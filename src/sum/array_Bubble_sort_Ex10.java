/**

 *  ���� ����!!!!
 *  
 * �迭 ���� �ϱ� 
 * ��������,������������ ����.
 * 
 * 
 */


package sum;

public class array_Bubble_sort_Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = new int[10];
		
		for (int i=0; i< numArr.length; i++)  {
			System.out.print( numArr[i] = (int)(Math.random() *10));
	//      numArr[i] = (int)(Math.random()*10);
	//      System.out.print (numArr[i]);     �̰ſ� ����.
			
			
		}
		System.out.println();
		
		for (int i=0; i<numArr.length-1 ; i++)  {
			boolean changed = false;    //  �ڸ��ٲ��� �߻� �ߴ��� üũ.    �Źݺ����� changed ��false �ʱ�.
			
			for (int j=0; j<numArr.length-1-i ; j++)  {    //numArr[j]�� �ٷο��ǿ��numArr[j+1] �� ��..
				if (numArr[j] > numArr[j+1])      {   //���ǰ��� ������ ���� �ٲ۴�.
					int temp =numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;               //�ڸ��ٲ��� �߻��Ͽ�����, changed �� true ��..
				}
			}     // end for j
			
			if (!changed) break;              //�ڸ��ٲ��� ������ �ݺ����� �����.
			
			for (int k=0; k<numArr.length;k++)
				System.out.print(numArr[k]);    //���ĵ� ����� ����Ѵ�.
			System.out.println();
			
		}   // end  for i 
	}   // end for mail

}
