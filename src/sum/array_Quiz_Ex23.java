package sum;

import java.util.Scanner;

public class array_Quiz_Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] words = {
				{"desk ?","å��"},                 //  words[0][0], [0][1]
				{"computer","��ǻ��"},             //  words[1][0], [1][1]
				{"integer", "���� " },            //  words[2][0], [2][1]
				{"apple" , "���"} ,
				
		};
		
		Scanner scanner= new Scanner(System.in);
		
		for (int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s �� ���� ??", i+1, words[i][0]);
			
			String tmp =scanner.nextLine();
			
			if (tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�.%n,%n");
			}else {
				System.out.printf("Ʋ�ǽ��ϴ�. ������%s�Դϴ�.%n%n" ,words[i][1]);
			}
		}  // for
	}// main

}
