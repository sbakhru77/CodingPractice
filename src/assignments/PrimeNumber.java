package assignments;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean checkPrime(int num) {
        
    	if( num == 2 ){ 
            return true;
        } 
        else if( num == 1 || (num & 1) == 0){
            return false;
        }
        
        for(int i=3; i<=Math.sqrt(num); i+=2) {
            if (num%i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            if (checkPrime(n))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
        
        in.close();
    }
}
