package ordeReview;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import FileManagement.fileManager;
import Tabs.CakeInfoTab;

public class TestMain {

	public static void main(String[] args) throws IOException {
//		JPanel panel = new JPanel();
//	CakeInfoTab cakeTab = new CakeInfoTab(panel);
//	JFrame frame = new JFrame("Canvas");
//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	frame.add(panel);
//	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//	frame.setSize(700,500);
//	frame.setVisible(true);
//	System.out.println(cakeTab.getCakeLayer());
//	System.out.println(cakeTab.getCakeSize());
		fileManager fm = new fileManager();
		ArrayList<String> orders = fm.getOrders();
		for (int i = 0; i < orders.size(); i++) {
			System.out.println(orders.get(i));
		}
	}
	
	
}
