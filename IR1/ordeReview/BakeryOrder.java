package ordeReview;

import java.util.ArrayList;
import FileManagement.*;


public class BakeryOrder implements Orderable {

	//Customer Info
	private int orderNumber;
	private String firstName;
	private String lastName;
	//Cake Info
	private String cakeFlavor;
	private String cakeFrosting;
	private int cakeDiam;
	private int cakeLayer;
	ArrayList<String> toppings;
	private String specialRequest;
	private fileManager fileMan = new fileManager();
	
	
	public BakeryOrder() {
	}
	
	public BakeryOrder(int iOrderNumber) {
		this.orderNumber = iOrderNumber;
	}
	
	
	public BakeryOrder(int orderNumber, String firstName, String lastName, String cakeFlavor,
			String cakeFrosting, int cakeDiam, int cakeLayer, ArrayList<String> toppings, String specialRequest) {
		this.orderNumber = orderNumber;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public boolean createOrderFile() {
		if (orderNumber!=0 && !fileMan.numberExists(orderNumber)) {
			fileMan.addOrder(orderNumber, toString());
			return true;
		} else {
//			throw new orderNumberException("Missing Order Number or Order Already exists");
			return false;
		}	
	}
	public boolean modifyOrder() {
		if (orderNumber!=0 && fileMan.numberExists(orderNumber)) {
			fileMan.addOrder(orderNumber, "This is the Order String/parameters of order");
			return true;
		} else {
//			throw new orderNumberException("Missing Order Number or Order does not exist");
			return false;
		}	
	}
	
	/**
	 * Transforms the order into a string to be used by the fileManager.
	 */
	public String toString() {
		return orderNumber +"\n\nFirst name: "+firstName+"\n\nLast Name: "+lastName+"\n\nCake Diameter: "+ cakeDiam +" inches\n\nNumber of Layers: "+cakeLayer+" layers\n\nCake Flavor: "+cakeFlavor+
				"\n\nType of Frosting: "+cakeFrosting+"\n\nToppings: "+toppings;
	}






}
