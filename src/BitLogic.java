import java.util.ArrayList;


public class BitLogic {
	public static void main(String[] args) {
		//42 is also represented as 0x2a in hex (2 is 10 and a is 1010, 2a 101010)
		//int a = 0x2a;
		int[] a = {86, 42, 8, 4, 0};
//		int b = 1;
//		
//		System.out.println("Binary value of a is "+ Integer.toBinaryString(a));
//		
//		int cnt = 0;
//		int intLen = Integer.toBinaryString(a).length();
//		
//		for (int i = 0; i<intLen; i++) {
//			if ((a & b) == 1){
//				cnt++;
//			}
//			a = a>>1;
//		}
//		
//		System.out.println("Number of 1's in binary value are: "+cnt);
		for(int i: a) {
			System.out.println("Binary value of a is "+ Integer.toBinaryString(i));
			System.out.println("Number of 1's in binary value "+ i + " are: " + numOfOnes(i));
		}
	}
	
	public static int numOfOnes(int num) {
		int oneCnt = 0;
		
		while (num != 0) {
			if ((num & 1) == 1) {
				oneCnt++;
			}
			num = num >>> 1;
		}
		
		return oneCnt;
		
	}
}

