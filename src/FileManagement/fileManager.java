package FileManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Manages the files through the directory specified.
 * 
 * @author Evan, Scott, Derick
 */
public class fileManager {

	String directoryPath;
	
	/**
	 * Constructor for File Manager, sets directory to read/save files as currentWorkingDirectory/Orders
	 */
	public fileManager() {
		String directory = new File(System.getProperty("user.dir"), "Orders").getAbsolutePath();
		directoryPath = directory;
	}
	/**
	 * Constructor for File Manager, sets directory to iDirectory specify.
	 * @param iDirectory - Directory to save/read files.
	 */
	public fileManager(String iDirectory) {
		String directory = new File(iDirectory).getAbsolutePath();
		directoryPath = directory;
	}
	
//CREATING FILES--------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	/**
	 * Creates a text file with the name of the order number and writes the order details inside the text file,
	 * stored at the class's directory path.
	 * 
	 * @param
	 * @throws IOException
	 */
	public void addOrder(int orderNumber, ArrayList<String> orderDetails) throws IOException {
		String numToString = Integer.toString(orderNumber);        // makes the order number a string so it can be added to the file name
		File orderFile = new File(directoryPath, numToString + ".txt"); // instantiates new file
		File orders  = new File(directoryPath, "OrderNumbers.txt"); // instantiates new orders file
		File directory = orderFile.getParentFile();                     // instantiates new directory
		
		if (!directory.exists()) {                                 // if the directory does not exist,
			directory.mkdirs();                                    // make the directory per the supposed parent file (first parameter) of the newly created file.
			System.out.println("Directory did not exist. Directory created at: " + directoryPath);
		}
		
		if (!orderExists(orderNumber)) {
			orderFile.createNewFile();                                  // this line actually creates the file itself
			FileWriter fileWriter = new FileWriter(orderFile, true);        // true parameter means add to the end of file, false means add to the beginning + replace
			for (String detail: orderDetails) {                    // writes the order details inside the file and writes a line for iteration purposes
				fileWriter.write(detail + "\r\n");
			}
			fileWriter.close();
			System.out.println("File saved successfully to: " + orderFile.getAbsolutePath()); // proof that the file was created and where it was created
			FileWriter ordersWriter = new FileWriter(orders, true);   //writes the new order number to the orders file
			if(!orders.exists()) {
				orders.createNewFile();
			}
			ordersWriter.write(numToString + "\r\n");
			ordersWriter.close();
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
		String numToString = Integer.toString(orderNumber);
		File orderFile = new File(directoryPath, numToString + ".txt");
		File orders  = new File(directoryPath, "OrderNumbers.txt");
		File directory = orderFile.getParentFile();
		
		if (!directory.exists()) {
			directory.mkdirs();
			System.out.println("Directory did not exist. Directory created at: " + directoryPath);
		}
		
		if (!orderExists(orderNumber)) {
			orderFile.createNewFile();
			System.out.println("File saved successfully to: " + orderFile.getAbsolutePath());
			FileWriter ordersWriter = new FileWriter(orders, true);
			if(!orders.exists()) {
				orders.createNewFile();
			}
			ordersWriter.write(numToString + "\r\n");
			ordersWriter.close();
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
	 * @return ArrayList<String> of every line in a file.
	 * @throws IOException
	 */
	public ArrayList<String> readFile(int orderNumber) throws IOException {
		ArrayList<String> lines = new ArrayList<String>();
		
		if (orderExists(orderNumber)) {
			String numToString = Integer.toString(orderNumber);
			File file = new File(directoryPath, numToString + ".txt");

			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				lines.add(line);
			}
			reader.close();
			bufferedReader.close();

		}
		return lines;
	}
	
	/**
	 * @param
	 * @return true if the order exists, false if order does not exist.
	 */
	public boolean orderExists(int orderNumber) {
		String numToString = Integer.toString(orderNumber);
		File file = new File(directoryPath, numToString + ".txt");
		if (file.exists()) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @param
	 * @return ArrayList<String> of every line in a file.
	 * @throws IOException
	 */
	public String getName(int orderNumber) throws IOException {
		
		if (orderExists(orderNumber)) {
			String numToString = Integer.toString(orderNumber);
			File file = new File(directoryPath, numToString + ".txt");

			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);

			String name = bufferedReader.readLine();
			reader.close();
			bufferedReader.close();
			return name;

		} else {
			throw new IOException("Order not found."); // this wont happen because it will be found
		}
	}
	
	/**
	 * @return ArrayList<String> of every order number in the OrderNumbers.txt file.
	 * @throws IOException
	 */
	public ArrayList<String> getOrders() throws IOException {
		
			File file = new File(directoryPath, "OrderNumbers.txt");
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			ArrayList<String> numbers = new ArrayList<String>();
			String number;
			
			while ((number = bufferedReader.readLine()) != null) {
				numbers.add(number);
			}
			reader.close();
			bufferedReader.close();
			return numbers;
		}



//EDITING FILES--------------------------------------------------------------------------------------------------------------------------------------------------


	/**
	 * If the file exists, then clear file and add user element to file.
	 * 
	 * @param integer order number, string user element
	 */
	public void rewriteFile(int orderNumber, ArrayList<String> userElements) {
		if (orderExists(orderNumber)) {
			String numToString = Integer.toString(orderNumber);
			File file = new File(directoryPath, numToString + ".txt");

			try {
				// possibly print every line in the file and allow user to edit line
				FileWriter writer = new FileWriter(file, false);
				for (String detail: userElements) {                    // writes the order details inside the file and writes a line for iteration purposes
					writer.write(detail + "\r\n");
				}
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
	public void addToFile(int orderNumber, ArrayList<String> userElements) {
		if (orderExists(orderNumber)) {
			String numToString = Integer.toString(orderNumber);
			File file = new File(directoryPath, numToString + ".txt");

			try {
				// possibly print every line in the file and allow user to edit line
				FileWriter writer = new FileWriter(file, true);
				for (String detail: userElements) {
					writer.write(detail + "\r\n");
				}
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
	public void deleteOrder(int orderNumber) throws IOException {
		if (orderExists(orderNumber)) {
			String numToString = Integer.toString(orderNumber);
			File file = new File(directoryPath, numToString + ".txt");     //file itself to be deleted
			file.delete();
			
			//------------------------------------------------
			
			File ordersOrig = new File(directoryPath, "OrderNumbers.txt"); //original orders file
//			File temp = new File("OrderNumbers.txt");
			File ordersNew = new File(directoryPath, "OrderNumbersNew.txt");  //new orders file
			
			FileReader fileReader = new FileReader(ordersOrig);
			FileWriter lineWriter = new FileWriter(ordersNew);
			BufferedReader lineReader = new BufferedReader(fileReader);
			
			ordersNew.createNewFile();                                      //creates new order file
			String line;
			
			while ((line = lineReader.readLine()) != null) {
				if (!line.equals(numToString)) {
					lineWriter.write(line + "\r\n");
				}
			}
			
			
			lineWriter.close();
			lineReader.close();
			ordersOrig.delete();
			ordersNew.renameTo(ordersOrig);
		}
	}
}