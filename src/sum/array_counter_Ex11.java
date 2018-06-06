/**
 * 빈도수 구하기
 * 배열에 어떤값이 몇개 저장 되어 있는지 세어준다.
 * 플래시 영상보고 이해햇슴...
 * 
 */

package sum;

public class array_counter_Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 객수 :" + counter[i]);
		}
	}

}
