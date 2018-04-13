package HackerRank;

import java.util.Scanner;
//Davis has s staircases in his house and he likes to climb each staircase 1, 2, or 3 steps at a time.
//Given the respective heights for each of the s staircases in his house, find and print the number of ways he can climb each staircase on a new line.

public class RecursiveStaircase {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            
            System.out.println(findStaircaseClimbWays(n, 3));
        }
    }
	
	public static int findStaircaseClimbWays(int steps) {
		
		if (steps == 0)
			return 1;
		
		if (steps <= 2)
			return steps;
		
		return findStaircaseClimbWays(steps-3) + findStaircaseClimbWays(steps-2) + findStaircaseClimbWays(steps-1);
	}
	
	public static int findStaircaseClimbWays(int steps, int ways) {
		int res = 0;
		
		if (steps == 0)
			res = 1;
		
		if (steps <= 2)
			res = steps;
		
		while (ways != 0) {
			res += findStaircaseClimbWays(steps - ways);
			ways--;
		}
		
		return res;
	}
}
