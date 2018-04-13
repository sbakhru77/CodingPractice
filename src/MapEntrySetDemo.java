
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;


public class MapEntrySetDemo {

  public static void main(String[] argv) {


    Map<String, String> map = new HashMap<String, String>();

    // The hash maps from company name to address.

    map.put("Adobe", "Mountain View, CA");
    map.put("IBM", "White Plains, NY");
    map.put("Learning Tree", "Los Angeles, CA");
    map.put("Microsoft", "Redmond, WA");
    map.put("Netscape", "Mountain View, CA");
    map.put("O'Reilly", "Sebastopol, CA");
    map.put("Sun", "Mountain View, CA");
    System.out.println(map.get("IBM"));
    
    Set entries = map.entrySet();
    Iterator it = entries.iterator();
//    
//    Set keyset = map.keySet();
//    Collection<String> values = map.values();
//    Iterator keyitr = keyset.iterator();
//    Iterator valueitr = values.iterator();
//    while(keyitr.hasNext()) {
//    	System.out.println(keyitr.next() + "-->" +valueitr.next());    	
//    }
    
    while (it.hasNext()) {
    	Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
    	System.out.println(entry.getKey() + "-->" + entry.getValue());
    	//System.out.println(it.next());
    }
  
  }

}