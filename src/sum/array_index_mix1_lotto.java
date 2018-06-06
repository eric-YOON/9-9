/**
 * 배열의 요소를 순서대로 바꾼다.  로또추첨기
 */

package sum;

public class array_index_mix1_lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ball = new int[45]; // 45개 정수 값 저장하기위한 배열 생성.

		// 배열의 각 요소에 1~45 의 값을 저장
		for (int i = 0; i < ball.length; i++)
			ball[i] = i + 1; // ball[0]에 1 이 저장.

		int temp = 0; // 두값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 어어서 저장할 변수

		
		
		
		// 배열의 1번째 요소와 임의의 요소에 저장된 값을 서로 바꾸어서 값을 섞는다.
		// 0번째부터 5번쨰 요소까지 모두 6개만 바꾼다.
		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45);
			temp = ball[i];                    // ball[i]와 ball[j] 의 값을 서로 바꾼다.
			ball[i] = ball[j];
			ball[j] = temp;
		}

		// 배열 ball 의 앞에서 부터 6개의 요소를 출력한다.
		for (int i = 1; i <7; i++)
			System.out.printf("ball[%d] = %d%n", i, ball[i]);

	}

}
