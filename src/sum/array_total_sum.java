/**
 * 총합과 평균 
 * 배열의 모든 요소를 더해서 총합과 평균을 구한다.
 * 
 */

package sum;

public class array_total_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;                //총점을 저장하는변수
		float average =0f;         // 평균을 저장하는변수
		
		int[] score = {100,88,100,100,90};
		for (int i=0; i <score.length ; i++)  {
			sum += score[i];    // 반복문을 이용해서 배열에 저장되어있는 값들을 모두 더한다.
		}
		average = sum / (float)score.length ;    //계산결과를 float 로 얻기 위해 형변환 
		//          478/5         478/(float5)     478/5.0f         478f/5.0f   95.6f
		System.out.println("총점: " + sum );
		System.out.println("평균: " + average);
	}

}
