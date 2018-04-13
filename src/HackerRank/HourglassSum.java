package HackerRank;

import java.util.Scanner;

public class HourglassSum {
	 public static void main(String[] args) {
	        //Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
//	        for(int arr_i=0; arr_i < 6; arr_i++){
//	            for(int arr_j=0; arr_j < 6; arr_j++){
//	                arr[arr_i][arr_j] = in.nextInt();
//	            }
//	        }
	        
	        arr[0][0] = 1;
	        arr[0][1] = 1;
	        arr[0][2] = 1;
	        arr[0][3] = 0;
	        arr[0][4] = 0;
	        arr[0][5] = 0;
	        
	        arr[1][0] = 0;
	        arr[1][1] = 1;
	        arr[1][2] = 0;
	        arr[1][3] = 0;
	        arr[1][4] = 0;
	        arr[1][5] = 0;

	        arr[2][0] = 1;
	        arr[2][1] = 1;
	        arr[2][2] = 1;
	        arr[2][3] = 0;
	        arr[2][4] = 0;
	        arr[2][5] = 0;
	        
	        arr[3][0] = 0;
	        arr[3][1] = 9;
	        arr[3][2] = 2;
	        arr[3][3] = -4;
	        arr[3][4] = -4;
	        arr[3][5] = 0;
	        
	        arr[4][0] = 0;
	        arr[4][1] = 0;
	        arr[4][2] = 0;
	        arr[4][3] = -2;
	        arr[4][4] = 0;
	        arr[4][5] = 0;
	        
	        arr[5][0] = 0;
	        arr[5][1] = 0;
	        arr[5][2] = -1;
	        arr[5][3] = -2;
	        arr[5][4] = -4;
	        arr[5][5] = 0;
	        
	        System.out.println(printHourglass(arr));
	   }
	 
	 public static int printHourglass(int arr[][]) {
		 int hourGlassMax = Integer.MIN_VALUE;
		 int rows = arr.length;
         int cols = arr[0].length;
         
         System.out.println("rows=" + rows + ", cols=" + cols);
         
         if (rows < 3 || cols < 3){
             return -1;
         }
         else {
	         for (int i = 0; i < arr.length/2 ; i++) {
				 for(int j = 0; j < arr.length/2; j++) {
					 int hourGlassSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2] ; 
					 		
					 if (hourGlassSum > hourGlassMax) {
						 hourGlassMax = hourGlassSum;
					 }
				 }
				 
			 }
         }
		 
		 return hourGlassMax;
	 }
}
