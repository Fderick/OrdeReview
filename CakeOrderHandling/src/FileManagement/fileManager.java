package FileManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
/**
 * Description
 * @author Evan, Scott, Derick
 *
 */
public class fileManager {
	
	public void addOrder(int orderNumber, String orderDetails) {
		String numToString = Integer.toString(orderNumber);
		
		try {
            FileWriter writer = new FileWriter(numToString + ".txt", true);
            writer.write(numToString);          //writes text to the file itself
            writer.write("\r\n");               // write new line for iteration purposes
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public boolean numberExists(int orderNumber) {
		String numToString = Integer.toString(orderNumber);
		
	    try {
	    	
	        FileReader reader = new FileReader(numToString + ".txt");
	        BufferedReader bufferedReader = new BufferedReader(reader);

	        String line;
	        String currOrder = Integer.toString(orderNumber);
	 
            while ((line = bufferedReader.readLine()) != null) {
            	if (line.equals(currOrder)) {
            		return true;
            	}
	        }
	        reader.close();
	        bufferedReader.close();
	        
	    } catch (IOException e) {
	        System.out.println("File " + orderNumber + " does not exist");
	    }
		return false;
	}
}
