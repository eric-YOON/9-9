/**
 * �𽺺�ȣ
 * 16������ 2������ ��ȯ�� ����ϴ�.
 * but ���� ���� ó��....
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
			result +=morse[source.charAt(i)-'a'];       // if .  i �� 0 �̶��  source.charAt(0) �� ù ���� ���� "S"
		}                                               // 's'-'a' =83-65=18
		System.out.println("source: "+ source);         // result = result + "..." �� ����.
		System.out.println("morse :"+ result);
}

}
