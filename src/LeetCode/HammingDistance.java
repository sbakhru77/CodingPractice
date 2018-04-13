package LeetCode;

public class HammingDistance {
	public static int getHammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
    }
	
	public static void main(String args[]) {
		System.out.println(getHammingDistance(1,4));
	}
}
