/**
 * 
 *배열의 요소의 순서를 반복해서 바꾼다. 
 *  카드 섞는 예제....
 * 
 */

package sum;

public class array_index_mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = new int[10];
		
		for (int i=0; i<numArr.length; i++)  {
			numArr[i] = i ;  //배열을 0~9 의 숫자로 초기화 한다 . 
			System.out.print(numArr[i]);                 
		}
		System.out.println();
		
		for (int i=0; i<100; i++)  {                    // 랜덤으로 얻어진 배열 인덱스 와 numArr[0]의 요소값을 100번 반복.
			int n = (int) (Math.random() *10);     //0~9중의 한값을 임의로 얻는다.
			
		
			int tmp = numArr[0];
			numArr[0] = numArr[n];          // numArr[0]과 numArr[n] 의 값을 서로 바꿈.
			numArr[n] = tmp;               
			
			// for (int i=0; i<numArr.length; i++ )    100번 랜덤으로 돌리는거보다 이게 더효율적이다 
			// int tmp = numArr[i];
			// numArr[i]=numArr[n];
			// numArr[n]=tmp;
			
		}
		
		for (int i=0; i<numArr.length; i++)
			System.out.print(numArr[i]);
	}

}
