/**
 * 
 * 
 * 
 */


package sum;

public class array_Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length !=3) {  
			System.out.println("usage: java ArrayEx17 NUM1 OP NUM2");
			System.exit(0);
			}
		int num1 = Integer.parseInt(args[0]);  // ���ڿ��� ���ڷ� ��ȯ�Ѵ�.	
		char op = args[1].charAt(0);           // ���ڿ��� ����(char)�� ��ȯ.
		int num2 = Integer.parseInt(args[2]);
		int result = 0;
		
		switch (op)  {   // switch  ���� �������� char Ÿ���� ������ �����ϴ�.
		case '+' :
			result = num1+num2;
			break;
		case '-' :
			result = num1-num2;
			break;
		case 'X' :
			result = num1*num2;
			break;
		case '/' :
			result = num1/num2;
			break;
			
		default :
			System.out.println("���������ʴ� �����Դϴ�.");
		}
		System.out.println("���: " + result);
	}

}
