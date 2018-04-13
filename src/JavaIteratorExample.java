
import java.util.Iterator;
import java.util.ArrayList;
 
public class JavaIteratorExample {
 
  public static void main(String[] args) {
 
     ArrayList aList = new ArrayList();
     aList.add("1");
     aList.add("2");
     aList.add("3");
     aList.add("4");
     aList.add("5");
     aList.add("Sunila");
     aList.add(new ListExample());
     
     
     ArrayList<Integer> intList = new ArrayList<Integer>();
     intList.add(1);
     intList.add(2);
     intList.add(100);
     //Any other object type will not work since ArrayList is explicitly of type Integer
    // intList.add(new ListExample());
  
     
    // Iterator intItr = intList.i
     
     for(int i: intList) {
    	System.out.println(i); 
     }
     
     System.out.println("\n");
     
     
     aList.remove(6);
     aList.ensureCapacity(10);
     
     System.out.println("After increasing the capacity, size of arraylist is: " + aList.size() );
     
     Iterator itr = aList.iterator();
     
     while(itr.hasNext())
    	 System.out.println(itr.next());
   
  }
}