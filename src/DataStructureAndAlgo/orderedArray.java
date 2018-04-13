package DataStructureAndAlgo;

public class orderedArray {

	private long[] elems;
	private int nElems;
	
	orderedArray(int max) {
		elems = new long[max];
		nElems = 0;
	}
	
	protected int size() {
		return nElems;
	}
	
	protected int find(long searchElem)
	{
		int lowerbound = 0;
		int upperbound = nElems-1;
		int current;
		
		while(true) {
			current = (lowerbound + upperbound) / 2;
			
			if(searchElem==elems[current]) {
				return current;
			}
			else if (lowerbound > upperbound) {
				return nElems;
			}
			else {
				if (searchElem > elems[current]) {
					lowerbound = current+1;
				}
				else
					upperbound = current-1;
			}
		} //end while loop	
	}//end find
	
	public void insert(int newVal) {
		int j;
		for (j=0; j < nElems; j++) {
			if (elems[j] > newVal) break;
		}
		
		for (int k=nElems; k>j; k--) {
			elems[k+1] = elems[k];
		}
		
		elems[j] = newVal;
		nElems++;
	}
	
	public void insert(int newVal,boolean isSort) {
		
		elems[nElems] = newVal;
		nElems++;
	}
	
	public boolean delete(int val) {
		int index = find(val);
		
		if (index == nElems) 
			return false;
		else {
			for (int j=index; j<nElems; j++) {
				elems[j] = elems[j+1];
			}
			nElems--;
			return true;
		}		
	}
	
	public void display() {
		for(int i=0; i<nElems; i++) {
			System.out.println(elems[i] + "");
			//System.out.println("\n");
		}
	}
	
	//compare consecutive values and swap them to keep them sorted. This will move the highest value to the end. Right array will be sorted
	//Requires O(N^2) comparisons and swap
	public long[] bubbleSort() {
		for(int out=nElems-1; out>1; out--) {
			for(int in=0; in<out; in++) {
				if (elems[in] > elems[in+1])
					swap(in, in+1);
			}
		}
		return elems;
	}
	
	public void swap(int one, int two) {
		long temp = elems[one];
		elems[one] = elems[two];
		elems[two] = temp;
	}
	
	// Find min and move it left. Left array will be sorted
	// Requires O(N^2) comparisons and O(N) swap. (A little faster than bubble sort since the swap are reduced)
	public long[] selectionSort() {
		
		for(int i=0 ; i<nElems; i++) {
			int min = i;
			
			for(int j = i+1; j < nElems ; j++) {
				if (elems[j] < elems[min])
					min = j;
			}
			
			swap(i, min);
		}
		return elems;
	}
	
	// The idea is half of array is sorted and we need to sort the other half.
	// Select a value in array and compare it to the sorted values on the left. 
	// Move the higher values to the right and insert the selected value where it fits 
	// Since there is no swap and the values get moved and inserted where they fit this approach is better than bubble/selection sort
	// Runs in O(N^2) time for random data. If the data almost sorted then it runs in O(N) time
	public void insertionSort() {
		
		for (int i=0; i < nElems; i++) {
			long temp = elems[i];
			int j = i;
			while(j>0 && elems[j-1]>=temp) {
				elems[j] = elems[j-1];
				--j;
			}
			elems[j] = temp;
		}
	}
}
