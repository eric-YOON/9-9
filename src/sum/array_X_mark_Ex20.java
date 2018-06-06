/**��ǥ ���߱� ����.
 * ��ǥ�� X ǥ�ϱ�
 * �Է��� 2������ ��ǥ�� ��ġ�� X �� ǥ��.
 * ��ǥ�����߸� o Ʋ���� x  1ǥ�� ��ǥ ���߱�.
 */


package sum;

import java.util.Scanner;

public class array_X_mark_Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int SIZE =10;
		int x=0, y=0;
		
		char[][] board = new char [SIZE][SIZE];
		byte[][] shipBoard = {
			//   1,2,3,4,5,6,7,8,9
				{0,0,0,0,0,0,1,0,0},   //1
			    {1,1,1,1,0,0,1,0,0},   //2
				{0,0,0,0,0,0,1,0,0},   //3
				{0,0,0,0,0,0,1,0,0},   //4
				{0,0,0,0,0,0,0,0,0},   //5
				{1,1,0,1,0,0,0,0,0},   //6
				{0,0,0,1,0,0,0,0,0},   //7
				{0,0,0,1,0,0,0,0,0},   //8
				{0,0,0,0,0,1,1,1,0},   //9
				// 1 �࿡ ���ȣ��, 1���� ����ȣ�� ����.
		};
		for (int i=1; i<SIZE; i++)
			board[0][i] = board[i][0] = (char) (i+'0');    //(char)(1+'0')='1'   
		Scanner scanner = new Scanner(System.in);          // (char)(2+'0')='2'
		
		while(true) {
			System.out.printf("��ǥ�� �Է��ϼ���.(����� 00)>");
			String input = scanner.nextLine();                  // ȭ���Է¹��� ������ input�� ����
			
			if (input.length()==2)  {             //���� �α��ڸ� �Է��� �����,
				x= input.charAt(0) - '0';
				y= input.charAt(1) - '0';     //���ڸ� ���ڷ� ��ȯ.
				
				if (x==0  && y==0)   // x��y�� ��� 0�ΰ�� ���� . 
					break;
			}
			if (input.length()!=2  || x<=0  ||  x>=SIZE  || y<=0   ||  y>=SIZE)  {
				System.out.println("�߸��� �Է� �Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			//shipBoard[x-1][y-1] �� ���� 1�̸�, '0' �� boreaad[x][y]�� �����Ѵ�.
			board[x][y] = shipBoard[x-1][y-1]==1  ?'o' : 'X';
			
			//�迭 board �� ������ ȭ�鿡 ����Ѵ�.
			for(int i=0;i<SIZE;i++)
				System.out.println(board[i]);   //board[i] �� 1���� �迭
			System.out.println();
		}
	}  // mian ��.

}
