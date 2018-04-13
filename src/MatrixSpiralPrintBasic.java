
public class MatrixSpiralPrintBasic {

	public enum Direction {
		RIGHT, DOWN, LEFT, UP;
	}
	
	public static void printMatrixSpiral(char[][] charArray) {
		
		int xMax = charArray[0].length;
		int yMax = charArray.length;
		int xMin = 0;
		int yMin = 0;
		int xPoint = -1;
		int yPoint = 0;
		int totalCharCnt = xMax*yMax;
		int writeCharCnt = 0;
		
		Direction dir = Direction.RIGHT;
		
		while(writeCharCnt < totalCharCnt) {
			
			switch(dir) {
			
				case RIGHT:
					xPoint++;
					System.out.print(charArray[yPoint][xPoint]);
					if(xPoint == xMax-1) {
						yMin++;
						dir = Direction.DOWN;
					}
					break;
					
				case DOWN:
					yPoint++;
					System.out.print(charArray[yPoint][xPoint]);
					if(yPoint == yMax-1) {
						xMax--;
						dir = Direction.LEFT;
					}
					break;
					
				case LEFT:
					xPoint--;
					System.out.print(charArray[yPoint][xPoint]);
					if(xPoint == xMin) {
						yMax--;
						dir = Direction.UP;
					}
					break;
					
				case UP:
					yPoint--;
					System.out.print(charArray[yPoint][xPoint]);
					if(yPoint == yMin) {
						xMin++;
						dir = Direction.RIGHT;
					}
					break;
			}
			
			writeCharCnt++;
		}
		
	}
	
	
	public static void printSpiralMatrix(char a[][]) {
		int n=a[0].length;
		int m=a.length;
		
		int rowStart = 0, colStart=0;
		int rowEnd = n-1, colEnd = m-1;
		
		while (rowStart <= rowEnd && colStart <= colEnd)
		{
			int i = rowStart, j = colStart;
			for(j=colStart; j<=colEnd; j++)
			{
				//System.out.print("i="+i+ ",j=" +j +" "+ a[i][j] + " ");
				System.out.print(a[i][j] + " ");
			}
			j=colEnd;
			for(i = rowStart+1; i<=rowEnd; i++) {
				System.out.print(a[i][j] + " ");
			}
			i=rowEnd;
			for(j=colEnd-1;j>=colStart;j--)
			{
				System.out.print(a[i][j] + " ");
			}
			j=colStart;
			for(i=rowEnd-1;i>rowStart;i--)
			{
				System.out.print(a[i][j] + " ");
			}
			
			rowStart++;
			colStart++;
			rowEnd--;
			colEnd--;
		}
	}
	
	public static void main(String[] args) {

		final char[][] charArray = 
			{
				{'i',	'l', 	'o', 	'v', 	'e' },
				{'d',	'i', 	'n', 	't', 	'e' },
				{'n', 	'e', 	'w', 	'e', 	'p' }, 
				{'a', 	'i', 	'v', 	'r', 	'i' }, 
				{'m',	'a', 	'x', 	'e', 	'c' } 
			};
		
//	final char[][] charArray = 
//			{
//				{'1','2','3'},
//				{'8','9','4'},
//				{'7','6','5'}
//			};

	/*		
		final char[][] charArray = 
			{
				{'a',	'b', 	'c', 	'd'},
				{'l',	'm', 	'n', 	'e'},
				{'k', 	'p', 	'o', 	'f'}, 
				{'j', 	'i', 	'h', 	'g'} 
			};
		

		
		final char[][] charArray = 
			{
				{'1',	'2'},
				{'8',	'3'},
				{'7', 	'4'}, 
				{'6', 	'5'} 
			};
		

		/*
		final char[][] charArray = 
			{
				{'1',	'2',	'3',	'4'} 
			};
		*/
		
		//printMatrixSpiral(charArray);
		//printSpiralOrder(charArray);
		printSpiralMatrix(charArray);
	}
}
