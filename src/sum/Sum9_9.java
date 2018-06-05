// 사용자 입력값 구구단

package sum;

import java.util.Scanner;

public class Sum9_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int num=0;
		int num1=0;
		
		System.out.println("1부터9사이의숫자를넣으시오\n" + "1부터 9사이의 숫자를 넣으시오");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();                // 화면을통해 입력받은 내용을 tmp에 저장 	
		num = Integer.parseInt(tmp);                   // 입력받은 문자열 tmp 을 숫자로 변환 
		
		String tmp1 = scanner.nextLine();                // 화면을통해 입력받은 내용을 tmp에 저장 
		num1 = Integer.parseInt(tmp1);                   // 입력받은 문자열 tmp 을 숫자로 변환 
		
		
		for(int i=2;i<=num;i++) {
			for(int j=1;j<=num1;j++) {
				System.out.printf("%d X %d = %d\n" , i, j, i*j);
			}
		}
	}

}
