// ����� �Է°� ������

package sum;

import java.util.Scanner;

public class Sum9_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int num=0;
		int num1=0;
		
		System.out.println("1����9�����Ǽ��ڸ������ÿ�\n" + "1���� 9������ ���ڸ� �����ÿ�");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();                // ȭ�������� �Է¹��� ������ tmp�� ���� 	
		num = Integer.parseInt(tmp);                   // �Է¹��� ���ڿ� tmp �� ���ڷ� ��ȯ 
		
		String tmp1 = scanner.nextLine();                // ȭ�������� �Է¹��� ������ tmp�� ���� 
		num1 = Integer.parseInt(tmp1);                   // �Է¹��� ���ڿ� tmp �� ���ڷ� ��ȯ 
		
		
		for(int i=2;i<=num;i++) {
			for(int j=1;j<=num1;j++) {
				System.out.printf("%d X %d = %d\n" , i, j, i*j);
			}
		}
	}

}
