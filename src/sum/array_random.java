/**
 * 
 * 임의의값으로 배열 채우기 

 *  연속또는 불연속적인 값들로 배열을 초기화 한다.
 *  배열을 연속적인값이 아닌 불규칙적인 값들 사이에서 랜덤으로 뽑아낼수 있다.
 * 
 */


package sum;

import java.util.Arrays;                  //arrays.tostrinf 사용하기위해 추가.

public class array_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] code = {-4,-1,3,6,11};      //불연속적인 값들로 구성된 배열
		int[] arr = new int[10];
		
		for (int i=0; i<arr.length;i++) {
			int tmp = (int)(Math.random()*code.length);         
		//  int tmp = (int)(Math.random()*5;       0,1,2,3,4 중 하나가 저장된다.	
			arr[i] = code[tmp];
		}
		System.out.println(Arrays.toString(arr));

	}
}
