package ordeReview;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import FileManagement.fileManager;

import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateNewOrder {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldOrderNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateNewOrder window = new CreateNewOrder();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateNewOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("OrdeReview");
		
		JLabel lblWelcome = new JLabel("Welcome to Cake Maker");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(0, 10, 426, 21);
		frame.getContentPane().add(lblWelcome);
		
		JLabel lblExistingOrder = new JLabel("If you have an existing order enter order number and full name here:");
		lblExistingOrder.setBounds(20, 70, 416, 13);
		frame.getContentPane().add(lblExistingOrder);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(34, 93, 138, 19);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldOrderNum = new JTextField();
		textFieldOrderNum.setBounds(182, 93, 210, 19);
		frame.getContentPane().add(textFieldOrderNum);
		textFieldOrderNum.setColumns(10);
		
		JButton btnImport = new JButton("Import");
		btnImport.setBounds(166, 137, 85, 21);
		frame.getContentPane().add(btnImport);
		btnImport.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textFieldName.getText().equals(""))
					new FailOrderNum();
				else {
				fileManager f1 = new fileManager();
				ArrayList<String> order = new ArrayList<String>();
				try {
					order = f1.readFile(Integer.parseInt(textFieldOrderNum.getText()));
				} catch (NumberFormatException e1) {
					new FailOrderNum();
				} catch (IOException e1) {
					new FailOrderNum();
				}
				if(f1.orderExists(Integer.parseInt(textFieldOrderNum.getText())) && textFieldName.getText().equals(order.get(0))) {
					String[] name = order.get(0).split(" ");
					String first = name[0];
					String last = name[1];
					String[] toppings = order.get(5).split(" ");
					String top1 = toppings[0];
					String top2 = toppings[1];
					String top3 = toppings[2];
					new OrderForm(Integer.parseInt(order.get(3)),Integer.parseInt(order.get(4)),order.get(1),order.get(2),top1,top2,top3,order.get(6),first,last,order.get(7), Integer.parseInt(textFieldOrderNum.getText()));
					frame.dispose();
				}else {
					new FailOrderNum();
				
				}
				
			}
			}
		
		});
		
		JButton btnNewOrder = new JButton("Create New Order");
		btnNewOrder.setBounds(132, 167, 158, 60);
		frame.getContentPane().add(btnNewOrder);
		btnNewOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new OrderForm();
				frame.dispose();
			}
		});
		
		
		
		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setBounds(73, 115, 68, 13);
		frame.getContentPane().add(lblFullName);
		
		JLabel lblOrderNumber = new JLabel("Order Number");
		lblOrderNumber.setBounds(243, 114, 85, 13);
		frame.getContentPane().add(lblOrderNumber);
	}
}
