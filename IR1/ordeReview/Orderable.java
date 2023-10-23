package ordeReview;

public interface Orderable {
	
	
	void setCustomerName(String first, String last);
	int getOrderNumber();
	String toString();
	boolean createOrderFile();
	void readOrderFile(int orderNumber);
	
}
