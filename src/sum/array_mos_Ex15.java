/**
 * 모스부호
 * 16진수를 2진수로 변환과 비슷하다.
 * but 현재 예외 처리....
 */

package sum;

public class array_mos_Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.", "-..", ".",
						  "..-.", "--.", "....", "..", ".---",
						  "-.-", ".-..", "--", "-.", "---",
						  ".--.", "--.-", ".-.", "...", "-",
						  "..-", "...-", ".--", "-..-", "-.--",
						  "--.." };
		
		String result="";
		for (int i=0; i<source.length(); i++ ) {               
			result +=morse[source.charAt(i)-'a'];       // if .  i 가 0 이라면  source.charAt(0) 의 첫 번쨰 문자 "S"
		}                                               // 's'-'a' =83-65=18
		System.out.println("source: "+ source);         // result = result + "..." 과 같다.
		System.out.println("morse :"+ result);
}

}
