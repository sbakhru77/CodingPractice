package LeetCode;

public class JudgeRouteCircle {
	public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        
        for(char move : moves.toCharArray()) {
        	if (move == 'U')
        		++x;
        	else if (move == 'D')
        		--x;
        	else if (move == 'R')
        		++y;
        	else if (move == 'L')
        		--y;
        	else
        		return false;
        }
        
        return (x==0 & y==0);
    }

	public static void main(String args[]) {
		System.out.println(judgeCircle("LL"));
		System.out.println(judgeCircle("UD"));
		System.out.println(judgeCircle("RL"));
		System.out.println(judgeCircle(""));

	}
}
