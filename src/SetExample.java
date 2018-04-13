
import java.util.*;
import java.util.logging.Logger;

public class SetExample {
	public static void main(String args[]) {
		Set set = new HashSet();
		set.add("Behara");
		set.add("Eswar");
		set.add("Ganaesh");
		set.add("Eswar");
		set.add("Charan");
		System.out.println(set);
		Set sortedSet = new TreeSet(set);
		System.out.println(sortedSet);
		
		Set<Integer> setOfIntegers = new HashSet();
		setOfIntegers.add(Integer.valueOf(10));
		setOfIntegers.add(Integer.valueOf(20));
		setOfIntegers.add(Integer.valueOf(30));
		setOfIntegers.add(Integer.valueOf(40));
		setOfIntegers.add(Integer.valueOf(50));
		System.out.println(setOfIntegers);
		
		Logger l = Logger.getLogger("Test");
		for (Integer i : setOfIntegers) {
		  l.info("Integer value is : " + i);
		}

	}
}