/**
 *  string  �� char �� ��ȯ 
 *  char[] char = string.toCharArray();
 * 
 */

package sum;

public class array_Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String src = "ABCDE";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i); // src �� i ��° ������ ch �� ����
			System.out.println("src.charAt(" + i + "):" + ch);

			char[] chArr = src.toCharArray(); // string �� char[]�� ��ȯ

			System.out.println(chArr); // charr �迭 (char[]) �� ���.

		}
	}

}
