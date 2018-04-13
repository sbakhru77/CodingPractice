package LeetCode;

// String vs StringBuilder vs StringBuffer
// StringBuilder and StringBuffer are mutable with only difference that StringBuffer is thread safe
// String is immutable. Altering a value of string will create another string object and that value might not be visible to another method calling it
// StringBuilder and StringBuffer class have inbuilt reverse methods that String does not have
// String has toCharArray() which is not present in StringBuilder or StringBuffer

public class ReverseString {
	public static String reverseString(String s) {
        StringBuffer sb = new StringBuffer();
       
        for(int i = s.length()-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
	
	public static void main(String args[]) {
		System.out.println(reverseString("hello"));
	}
}
