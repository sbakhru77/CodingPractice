package DataStructureAndAlgo;

public class orderedArrayApp {
	public static void main(String[] args) {
		int maxitems = 20;
		orderedArray arr = new orderedArray(maxitems);
		
		arr.insert(10);
		arr.insert(20);
		arr.insert(22);
		arr.insert(43);
		arr.insert(55);
		arr.insert(60);
		arr.insert(77);
		arr.insert(82);
		arr.insert(99);
		
		arr.display();
		
		int searchVal = 22;
		int searchKey = arr.find(searchVal);
		
		if (searchKey == maxitems) {
			System.out.println("could not find the search item!");
		}
		else
			System.out.println("Found search item!");

		arr.delete(22);
		arr.delete(82);
		
		arr.display();
	}
}
