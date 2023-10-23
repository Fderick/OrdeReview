package orders;

public interface Orderable {
	
	
	void setCustomerName(String first, String last);
	int getOrderNumber();
	String toString();
	void createOrderFile();
	void readOrderFile(int orderNumber);
	
}
