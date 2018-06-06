/**
 * 2진수 16진법 변환.
 * 
 */



package sum;

public class array_hex_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] hex = {'C','A','F','E'} ;
		String[] binary = {"0000","0001","0010","0011",   //0,1,2,3
				           "0100","0101","0110","0111",   //4,5,6,7
				           "1000","1001","1010","1011",   //8,9,A,B
				           "1100","1101","1110","1111"};  //C,D,E,F
		                                                                              // 문자   /코드 
		String result="";                                                             // 0   /48
		                                                                              // 1   /49
		for (int i=0; i<hex.length; i++) {                                            // 2   /50
			if (hex[i] >='0'  && hex[i] <='9') {                                      // A   /65
				result +=binary[hex[i]-'0'];          //'8'-'0' = 8                   // B   /66
			}                                                                         // C   /67
			else {            //a~F 라면,
				result +=binary[hex[i]-'A'+10];       //'C'-'A'=2  
			}
		}
		                                              // String(char[] value)
		System.out.println("hex:"+new String(hex));
		System.out.println("binary:" +result);
	}

}
