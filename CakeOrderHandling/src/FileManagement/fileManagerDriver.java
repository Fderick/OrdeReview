package FileManagement;

public class fileManagerDriver {

	public static void main(String[] args) {
	
		fileManager fm = new fileManager();
		
//		fm.addOrder(1000000);
//		fm.addOrder(1000001);
		
		System.out.println(fm.numberExists(1000002));
		
	}
}
