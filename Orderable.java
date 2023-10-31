package orders;

import java.io.IOException;

public interface Orderable {
	
	
	void setCustomerName(String first, String last);
	int getOrderNumber();
	String toString();
	void createOrderFile() throws IOException;
	void readOrderFile(int orderNumber);
	void modifyOrder() throws IOException;
	
}
