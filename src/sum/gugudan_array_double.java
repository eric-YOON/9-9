package sum;

import java.util.Scanner;

public class gugudan_array_double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] result = new int [9][9];
		int total = 0;
		
		System.out.println("����� �������� ��� �Դϱ� ?");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.printf("����� �������� %d �� �Դϴ�.",+ num);
		
		
		
		for (int i =num;i<=num;i++ ) {
			for (int j = 1; j<result.length+1; j++) {
				total = i*j;
				
				System.out.printf("%d X %d :%d%n",+ i,j,total);
			}
		}
	}
}

			

