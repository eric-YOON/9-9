/**
 *  string  을 char 로 변환 
 *  char[] char = string.toCharArray();
 * 
 */

package sum;

public class array_Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String src = "ABCDE";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i); // src 의 i 번째 문장을 ch 에 저장
			System.out.println("src.charAt(" + i + "):" + ch);

			char[] chArr = src.toCharArray(); // string 을 char[]로 변환

			System.out.println(chArr); // charr 배열 (char[]) 을 출력.

		}
	}

}
