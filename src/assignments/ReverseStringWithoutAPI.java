package assignments;

public class ReverseStringWithoutAPI {

	
	/* implement a method to reverse words in a given string.

	example if "this is a test" is given as input method should return "test a is this"

	note: limited access to string api. ask before using

	*/
	
	public static void main (String args[]) {
		String revString = reverseString("this is a test");
		System.out.println("String reversed is: " + revString);
	}

	public static String reverseString(String originalStr) {
	    
	    StringBuilder sbStr = new StringBuilder(originalStr.length());
	    int len = originalStr.length() - 1;
	    int counter = 1;
	    int spaceIndex = 0;
	    
	    for (int i=len; i>=0; i--) 
	    {
	        if (originalStr.charAt(i) == ' ') 
	        {
	            spaceIndex = i;
	           	            
	            //System.out.println("space index " + spaceIndex);
	            //System.out.println("counter " + counter);
	            
	            sbStr.append(originalStr.substring((spaceIndex+1), (spaceIndex+counter))).append(" ");
	            counter = 1;
	        }
	        else
	        	counter++;
		        
	    }
	    
	    if (counter>1) 
	    	sbStr.append(originalStr.substring(0,counter-1));
	    
	    String revStr = sbStr.toString().trim(); 
	    		
	    return revStr;

	}

}
