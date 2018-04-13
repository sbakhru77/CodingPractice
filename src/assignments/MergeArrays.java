package assignments;

public class MergeArrays {
	public static int[] first = {1,2,8,9,14,20,21};
	public static int[] second = {3,4,7,11,12,15};
	
	public static void main(String args[]) {
		final int[] mergedArr = new int[first.length + second.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		if (first.length != 0 && second.length != 0) {
			while ((i < first.length) && (j < second.length)) {
				if (first[i] < second[j]){
					mergedArr[k] = first[i];
					i++; k++;
				}
				else {
					mergedArr[k] = second[j];
					j++; k++;
				}
			}
			
			while (i < first.length) {
				mergedArr[k] = first[i];
				i++; k++;
			}
			
			while (j < second.length) {
				mergedArr[k] = second[j];
				j++; k++;
			}
		}
		
		for (k = 0; k < mergedArr.length; k++) {
			System.out.println("merged array ---- " + mergedArr[k]);
		}
	}
}
