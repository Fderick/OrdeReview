package FileManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Manages the files through the directory specified.
 * 
 * @author Evan, Scott, Derick
 */
public class fileManager {

	String directoryPath = "C:\\Classes 3\\software engineering\\orders"; // directory path of which the files will be saved to
	
//CREATING FILES--------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	/**
	 * Creates a text file with the name of the order number and writes the order details inside the text file,
	 * stored at the class's directory path.
	 * 
	 * @param
	 * @throws IOException
	 */
	public void addOrder(int orderNumber, String orderDetails) throws IOException {
		String numToString = Integer.toString(orderNumber);        // makes the order number a string so it can be added to the file name
		File file = new File(directoryPath, numToString + ".txt"); // instantiates new file
		File directory = file.getParentFile();                     // instantiates new directory
		
		if (!directory.exists()) {                                 // if the directory does not exist,
			directory.mkdirs();                                    // make the directory per the supposed parent file (first parameter) of the newly created file.
			System.out.println("Directory did not exist. Directory created at: " + directoryPath);
		}

		if (!orderExists(orderNumber)) {
			file.createNewFile();                                  // this line actually creates the file itself
			FileWriter writer = new FileWriter(file, true);        // true parameter means add to the end of file, false means add to the beginning + replace
			writer.write(orderDetails);                            // writes the order details inside the file
			writer.write("\r\n");                                  // writes a line for iteration purposes
			writer.close();
			System.out.println("File saved successfully to: " + file.getAbsolutePath()); // proof that the file was created and where it was created
		} else {
			System.out.println("File already exists.");
		}
	}
	
	/**
	 * Creates a text file with the name of the order number, stored at the class's directory path.
	 * 
	 * @param
	 * @throws IOException
	 */
	public void addOrder(int orderNumber) throws IOException {
		String numToString = Integer.toString(orderNumber);        // makes the order number a string so it can be added to the file name
		File file = new File(directoryPath, numToString + ".txt"); // instantiates new file
		File directory = file.getParentFile();                     // instantiates new directory
		
		if (!directory.exists()) {                                 // if the directory does not exist,
			directory.mkdirs();                                    // make the directory per the supposed parent file (first parameter) of the newly created file.
			System.out.println("Directory did not exist. Directory created at: " + directoryPath);
		}

		if (!orderExists(orderNumber)) {
			file.createNewFile();                                  // this line actually creates the file itself
			System.out.println("File saved successfully to: " + file.getAbsolutePath()); // proof that the file was created and where it was created
		} else {
			System.out.println("File already exists.");
		}
	}
	
	

//VALIDATING FILES--------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	/**
	 * @param
	 * @return true if element does exist, false if element does not exist.
	 * @throws IOException
	 */
	public boolean elementExists(int orderNumber, String element) throws IOException {
		if (orderExists(orderNumber)) {
			String numToString = Integer.toString(orderNumber);
			File file = new File(directoryPath, numToString + ".txt"); // finds the file based off the directory path and the order number

			FileReader reader = new FileReader(file);                   // opens the file from the order number requested
			BufferedReader bufferedReader = new BufferedReader(reader); // instantiates a buffered reader that goes through each line in the file

			String line;
			while ((line = bufferedReader.readLine()) != null) {        // goes through each line in the file
				if (line.contains(element)) {
					return true;                                        // element does exist
				}
			}
			reader.close();
			bufferedReader.close();

		}
		return false;                                                   // element does not exits
	}
	
	/**
	 * @param
	 * @return true if the order exists, false if order does not exist.
	 */
	public boolean orderExists(int orderNumber) {
		String numToString = Integer.toString(orderNumber);
		File file = new File(directoryPath, numToString + ".txt");
		File directory = file.getParentFile();
		if (file.exists()) {
			return true;
		} else {
			return false;
		}
	}
	
	

//EDITING FILES--------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	/**
	 * If the file exists, then clear file and add user element to file.
	 * 
	 * @param integer order number, string user element
	 */
	public void rewriteFile(int orderNumber, String userElement) {
		if (orderExists(orderNumber)) {
			String numToString = Integer.toString(orderNumber);
			File file = new File(directoryPath, numToString + ".txt");

			try {
				// possibly print every line in the file and allow user to edit line
				FileWriter writer = new FileWriter(file, false);
				writer.write(userElement);
				writer.write("\r\n");
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * If the file exists, then add user element to the end of the file.
	 * 
	 * @param integer order number, string user element
	 */
	public void addToFile(int orderNumber, String userElement) {
		if (orderExists(orderNumber)) {
			String numToString = Integer.toString(orderNumber);
			File file = new File(directoryPath, numToString + ".txt");

			try {
				// possibly print every line in the file and allow user to edit line
				FileWriter writer = new FileWriter(file, true);
				writer.write(userElement);
				writer.write("\r\n");
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * If the file exists, clear the file..
	 * @param integer order number
	 */
	public void clearFile(int orderNumber) throws IOException {
		if (orderExists(orderNumber)) {
			String numToString = Integer.toString(orderNumber);
			File file = new File(directoryPath, numToString + ".txt");
			if (file.delete()) {
				file.createNewFile();
			} else {
				System.out.println("File could not be cleared.");
			}
		}
	}
}