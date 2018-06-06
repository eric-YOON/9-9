/**
 * 행렬의 곱셈
 * 두행렬 (matrix)를 곱한결과를 출력.
 * p.226
 */


package sum;

public class array_multrix_Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m1 = {
				{1,2,3},               //2행3열
				{4,5,6}
		};
		
		int [][] m2 = {                // 3행2열
				{1,2},
				{3,4},
				{5,6}
		};
		final int ROW = m1.length;   //m1 의 행길이 
		final int COL = m2[0].length;   // m2 의 열길이
		final int M2_ROW = m2.length;   //m2의 행길이
		
		int[][] m3 = new int[ROW][COL];
		
		// 행렬곱 m1 x m2 의 결과를 m3 에 저장
		for (int i=0;i<ROW;i++)
			for (int j=0;j<COL;j++)
				for (int k=0;k<M2_ROW;k++)
					m3[i][j] += m1[i][k] * m2 [k][j];
		
		// 행렬 m3 를 출력
		for (int i=0;i<ROW;i++) {
			for (int j=0;j<COL;j++) {
				System.out.printf("3%d", m3[i][j]);
			}
			System.out.println();
		}
	}// main 끝.

}
