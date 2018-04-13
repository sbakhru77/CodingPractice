package HackerRank;

public class ReverseArr {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int arr[] = new int[4];
//        for(int arr_i=0; arr_i < 5; arr_i++){
//            arr[arr_i] = in.nextInt();
//        }
        
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        
        printRevArr(arr);
    }
    
    public static void printRevArr(int arr[]) {
    	String result = null;
        if (arr.length <= 1) {
        	result = Integer.toString(arr[0]);
        }
        else {
        	
        	for (int i=arr.length-1; i>=0; i--) {
        		if (i == arr.length-1)
        			result = Integer.toString(arr[i]);
        		else
        			result = result + " " + arr[i];
        	}
        }
        
        System.out.println(result);
    }
}
