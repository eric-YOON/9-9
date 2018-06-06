/**

 *  버블 정렬!!!!
 *  
 * 배열 정리 하기 
 * 오름차순,내림차순으로 정렬.
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
	//      System.out.print (numArr[i]);     이거와 같다.
			
			
		}
		System.out.println();
		
		for (int i=0; i<numArr.length-1 ; i++)  {
			boolean changed = false;    //  자리바꿈이 발생 했는지 체크.    매반복마다 changed 를false 초기.
			
			for (int j=0; j<numArr.length-1-i ; j++)  {    //numArr[j]와 바로옆의요소numArr[j+1] 을 비교..
				if (numArr[j] > numArr[j+1])      {   //옆의값이 작으면 서로 바꾼다.
					int temp =numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;               //자리바꿈이 발생하였으니, changed 를 true 로..
				}
			}     // end for j
			
			if (!changed) break;              //자리바꿈이 없으면 반복문을 벗어난다.
			
			for (int k=0; k<numArr.length;k++)
				System.out.print(numArr[k]);    //정렬된 결과를 출력한다.
			System.out.println();
			
		}   // end  for i 
	}   // end for mail

}
