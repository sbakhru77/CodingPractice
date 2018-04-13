package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class RestaurantHighPrice {

	private static String dataFile = "C:\\Users\\Sunila\\workspace\\BSSWBQAWork\\src\\RestaurantList.txt";
	static ArrayList<String> fileLines = new ArrayList<String>();
	
	public static void main(String args[]) {
		File file = new File(dataFile);
		
		ReadFile(file);
		splitLines(fileLines);
		
	}
	
	static void ReadFile(File file)
	{
		try {
			Scanner scanObj = new Scanner(file);
			
			while (scanObj.hasNextLine())
			{
				fileLines.add(scanObj.nextLine());
			}
			
			scanObj.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File restaurantList.txt not found");
			e.printStackTrace();
		}
		
	}
	
	static void splitLines(ArrayList<String> lines)
	{
		//Set<Integer> priceList = new TreeSet<Integer>();
		
		//HashMap<String,Set> resPrice = new HashMap<String, Set>();
		String rName;
		Integer[] r1Price=new Integer[5];
		Integer[] r2Price=new Integer[5];
		Integer[] r3Price=new Integer[2];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		for(String line: lines) {
			
			rName = line.split("\\,")[0];
			
			if (rName.equals("r1")) {
				r1Price[i] = Integer.parseInt(line.split("\\,")[2]);
				//priceList.add(Integer.parseInt(i.split("\\,")[2]));
				i++;
			}
			else if (rName.equals("r2")) {
				r2Price[j] = Integer.parseInt(line.split("\\,")[2]);
				j++;
			}
			else if (rName.equals("r3")) {
				r3Price[k] = Integer.parseInt(line.split("\\,")[2]);
				k++;
			}
				
			//resPrice.put(rName, priceList);
		}
		
		Arrays.sort(r1Price);
		Arrays.sort(r2Price);
		Arrays.sort(r3Price);
		
		System.out.println("Highest Price on a item in restaurant r1 is: " + r1Price[r1Price.length-1]);
		System.out.println("Highest Price on a item in restaurant r2 is: " + r2Price[r2Price.length-1]);
		System.out.println("Highest Price on a item in restaurant r3 is: " + r3Price[r3Price.length-1]);
		//TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>(resPrice);
		
//		Set entries = resPrice.entrySet();
//	    Iterator it = entries.iterator();
//	    
//	    while (it.hasNext()) {
//	    	Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
//	    	System.out.println(entry.getKey() + "-->" + entry.getValue());
//	    	//System.out.println(it.next());
//	    }

	}
}
