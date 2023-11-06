package ownerReader;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Integer;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import FileManagement.*;
import javax.swing.ListSelectionModel;

public class OwnerView {

	fileManager fm = new fileManager();
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OwnerView window = new OwnerView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public OwnerView() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	public void initialize() throws IOException {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 712, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane orderDetails = new JTextPane();
		orderDetails.setEditable(false);
		orderDetails.setBounds(10, 31, 429, 321);
		frame.getContentPane().add(orderDetails);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(449, 239, 239, 113);
		frame.getContentPane().add(textPane_1);
		
		JLabel lblNewLabel = new JLabel("Notes on Order");
		lblNewLabel.setBounds(449, 223, 114, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblOrderInfo = new JLabel("Order Information");
		lblOrderInfo.setBounds(10, 8, 114, 13);
		frame.getContentPane().add(lblOrderInfo);
		orderDetails.setText("Full Name: "+"\n\nCake Diameter: "+" inches\n\nNumber of Layers: "+" layers\n\nCake Flavor: "+
				"\n\nType of Frosting: "+"\n\nToppings: "+"\n\nSpecial Instructions: ");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(449, 31, 239, 179);
		
		ArrayList<String> orders = fm.getOrders();
		ArrayList<String> newList = new ArrayList<String>();
		for(int i = 0; i < orders.size(); i++) {
			String orderq = orders.get(i);
			String name = fm.getName(Integer.parseInt(orders.get(i)));
			newList.add(orderq+" "+name);
		}
		String[] listInfo = new String[newList.size()];
		newList.toArray(listInfo);
		
		JList list = new JList(listInfo);
		scrollPane.setViewportView(list);
		list.setLayoutOrientation(JList.VERTICAL);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(449, 31, 239, 179);
		frame.getContentPane().add(scrollPane);
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				String[] ordd = ((String) list.getSelectedValue()).split(" ");
				String orderNum = ordd[0];
				ArrayList<String> order = new ArrayList<String>();
				if(!orderNum.equals("")) {
					
				try {
					order = fm.readFile(Integer.parseInt(orderNum));
				} catch (NumberFormatException | IOException e1) {
					
				}
				orderDetails.setText("Full Name: "+order.get(0)+"\n\nCake Diameter: "+order.get(3)+" inches\n\nNumber of Layers: "+order.get(4)+" layers\n\nCake Flavor: "+
				order.get(1)+"\n\nType of Frosting: "+order.get(2)+"\n\nToppings: "+order.get(5)+"\n\nSpecial Instructions: "+order.get(6));
			}
			}
		});
			

		
		JLabel lblOrders = new JLabel("Orders");
		lblOrders.setBounds(449, 10, 45, 13);
		frame.getContentPane().add(lblOrders);
		
		JButton btnReview = new JButton("Send Back for Review");
		btnReview.setBounds(478, 362, 171, 40);
		frame.getContentPane().add(btnReview);
		btnReview.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(40, 362, 168, 40);
		frame.getContentPane().add(btnConfirm);
		btnConfirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnDecline = new JButton("Decline");
		btnDecline.setBounds(238, 362, 171, 40);
		frame.getContentPane().add(btnDecline);
		frame.setVisible(true);
		btnDecline.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
				fileManager f1 = new fileManager();
				String[] ordd = ((String) list.getSelectedValue()).split(" ");
				try {
					f1.deleteOrder(Integer.parseInt(ordd[0]));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frame.setLocationRelativeTo(null);
	}

}
