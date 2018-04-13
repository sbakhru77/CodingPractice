import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ConvertCSV2ArrayList {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/items.csv"));
			String line = "";
			//String cvsSplitBy = "";
			
			String[] inputId = null;
			int cnt = 0;
			
			while ((line = br.readLine()) != null) {
				
                // use comma as separator
               inputId[cnt] = line;
               cnt++;

			}
			
			 System.out.println(inputId.toString());
             System.out.println("Length: " + inputId.length);
             
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
