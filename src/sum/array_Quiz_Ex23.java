package sum;

import java.util.Scanner;

public class array_Quiz_Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] words = {
				{"desk ?","책상"},                 //  words[0][0], [0][1]
				{"computer","컴퓨터"},             //  words[1][0], [1][1]
				{"integer", "정수 " },            //  words[2][0], [2][1]
				{"apple" , "사과"} ,
				
		};
		
		Scanner scanner= new Scanner(System.in);
		
		for (int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s 의 뜻은 ??", i+1, words[i][0]);
			
			String tmp =scanner.nextLine();
			
			if (tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n,%n");
			}else {
				System.out.printf("틀렷습니다. 정답은%s입니다.%n%n" ,words[i][1]);
			}
		}  // for
	}// main

}
