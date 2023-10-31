package orders;

import java.io.IOException;
import java.util.ArrayList;
import FileManagement.*;


public class BakeryOrder implements Orderable {

	//Customer Info
	private Integer orderNumber;
	private String firstName;
	private String lastName;
	//Cake Info
	private Integer cakeSize;
	private String cakeFlavor;
	private String cakeFrosting;
	private Integer cakeDiam;
	private Integer cakeLayer;
	ArrayList<String> toppings;
	private String specialRequest;
	private fileManager fileMan = new fileManager();
	
	
	public BakeryOrder() {
	}
	
	public BakeryOrder(int iOrderNumber) {
		this.orderNumber = iOrderNumber;
	}
	
	
	public BakeryOrder(int orderNumber, String firstName, String lastName, int cakeSize, String cakeFlavor,
			String cakeFrosting, int cakeDiam, int cakeLayer, ArrayList<String> toppings, String specialRequest) {
		this.orderNumber = orderNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cakeSize = cakeSize;
		this.cakeFlavor = cakeFlavor;
		this.cakeFrosting = cakeFrosting;
		this.cakeDiam = cakeDiam;
		this.cakeLayer = cakeLayer;
		this.toppings = toppings;
		this.specialRequest = specialRequest;
	}

	//Order Setters
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCakeSize(int cakeSize) {
		this.cakeSize = cakeSize;
	}
	
	public void setCustomerName(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}

	public void setCakeFlavor(String cakeFlavor) {
		this.cakeFlavor = cakeFlavor;
	}

	public void setCakeFrosting(String cakeFrosting) {
		this.cakeFrosting = cakeFrosting;
	}

	public void setCakeDiam(int cakeDiam) {
		this.cakeDiam = cakeDiam;
	}

	public void setCakeLayer(int cakeLayer) {
		this.cakeLayer = cakeLayer;
	}

	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}

	public void setSpecialRequest(String specialRequest) {
		this.specialRequest = specialRequest;
	}

	public int getOrderNumber() {
		return orderNumber;
	}
	
	public void readOrderFile(int orderNumber) {
		
	}

	public void createOrderFile() throws IOException {
		if (orderNumber!=0 && !fileMan.orderExists(orderNumber)) {
			fileMan.addOrder(orderNumber, this.writeDetails());
		} else {
			throw new orderNumberException("Missing Order Number or Order Already exists");
		}	
	}
	public void modifyOrder() throws IOException {
		if (orderNumber!=0 && fileMan.orderExists(orderNumber)) {
			fileMan.rewriteFile(orderNumber,this.writeDetails());
		} else {
			throw new orderNumberException("Missing Order Number or Order does not exist");
		}	
	}
	
	public ArrayList<String> writeDetails(){
		ArrayList<String> orderDetails = new ArrayList<String>();
		orderDetails.add(firstName+ " " + lastName);
		orderDetails.add(cakeSize.toString());
		orderDetails.add(cakeFlavor);
		orderDetails.add(cakeFrosting);
		orderDetails.add(cakeDiam.toString());
		orderDetails.add(cakeLayer.toString());
		for(String topping: toppings)
			orderDetails.add(topping);
		
		orderDetails.add(specialRequest);
		return orderDetails;
		
		
	}
	
	/**
	 * Transforms the order into a string to be used by the fileManager.
	 */
	public String toString() {
		String newLine = " \r\n ";
		return firstName + " " + lastName + newLine + cakeSize + newLine + cakeFlavor + newLine + cakeFrosting + newLine + cakeDiam + newLine + cakeLayer + newLine + toppings + newLine + specialRequest ;
	}






}
