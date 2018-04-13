package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoteInMagazine {
	//Map<String, Integer> magazineMap = new HashMap<String, Integer>();
    Map<String, Integer> noteMap = new HashMap<String, Integer>();
    
    public boolean solve(String magazine, String note) {
    	
    	String[] mwordlist = magazine.split(" ");
    	String[] nwordlist = note.split(" ");
    	boolean isNote = false;
    	
    	for (String nword : nwordlist) {
    		if (!noteMap.containsKey(nword))
    			noteMap.put(nword, 1);
    		else
    			noteMap.put(nword, noteMap.get(nword)+1);
    		
    	}
    	
    	for (String mword : mwordlist) {
    		if (noteMap.containsKey(mword))
    			noteMap.put(mword, noteMap.get(mword)-1);
    	}
    	
    	for (Integer count: noteMap.values())
    		if (count == 0)
    			isNote = true;
    		else
    			isNote = false;
    					
    	return isNote;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        NoteInMagazine s = new NoteInMagazine();
        
        boolean answer = s.solve(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
