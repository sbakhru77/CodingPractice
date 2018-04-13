package HackerRank;

public class ArrayLeftRotation {

    static int[] leftRotation(int[] a, int d) {
        // Complete this function
    	
    	if (d <= 0 || a.length <=1)
    		return a;
    	
    	for(int i=0; i<d; i++) {
    		int j, tmp;
    		tmp = a[0];
    		for(j = 0; j < a.length-1; j++) {
    			a[j] = a[j+1];
    		}
    		a[j] = tmp;
    	}
    	
    	return a;
    }
    
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int d = in.nextInt();
        
    	int[] a = new int[10];
        int d = 2;
        
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        a[5]=6;
        a[6]=7;
        a[7]=8;
        a[8]=9;
        a[9]=10;
        
//        for(int a_i = 0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
        
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

    }
}
