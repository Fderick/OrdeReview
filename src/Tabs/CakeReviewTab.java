package Tabs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import FileManagement.fileManager;
import orders.BakeryOrder;

public class CakeReviewTab extends JPanel {

	private JTextPane review;
	private CakeInfoTab infoTab;
	private CakeTypeTab typeTab;
	private CakeFrostingTab frostingTab;
	private CakeToppingsTab toppingsTab;
	private int orderNumber = 1000000;
	private JLabel txtFirstName, txtLastName;
	private JTextField textFirstNameInput, textLastNameInput;
	private String firstName, lastName, specialInstructions, email1;
	public CakeReviewTab(JPanel panel, CakeInfoTab info, CakeTypeTab type, CakeFrostingTab frosting, CakeToppingsTab toppings, JFrame frame, String specialInstruc,
			String first, String last, String email) {
		fileManager fm = new fileManager();
		infoTab = info;
		typeTab = type;
		frostingTab = frosting;
		toppingsTab = toppings;
		textFirstNameInput = new JTextField();
		
		textFirstNameInput = new JTextField();
		textFirstNameInput.setBounds(67, 1, 96, 19);
		panel.add(textFirstNameInput);
		textFirstNameInput.setColumns(10);
		firstName = textFirstNameInput.getText();
		textFirstNameInput.setText(first);
		
		txtFirstName = new JLabel();
		txtFirstName.setText("First Name:");
		txtFirstName.setBounds(0, 1, 69, 19);
		panel.add(txtFirstName);
		
		textLastNameInput = new JTextField();
		textLastNameInput.setBounds(231, 1, 96, 19);
		panel.add(textLastNameInput);
		textLastNameInput.setColumns(10);
		lastName = textLastNameInput.getText();
		textLastNameInput.setText(last);
		
		txtLastName = new JLabel();
		txtLastName.setText("Last Name:");
		txtLastName.setBounds(166, 1, 69, 19);
		panel.add(txtLastName);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(329, 4, 45, 13);
		panel.add(lblEmail);
		
		JTextField textEmailInput = new JTextField();
		textEmailInput.setBounds(373, 1, 232, 19);
		panel.add(textEmailInput);
		textEmailInput.setColumns(10);
		textEmailInput.setText(email);
		
		JTextPane textSpecialInstructions = new JTextPane();
		textSpecialInstructions.setBounds(0, 220, 607, 98);
		textSpecialInstructions.setText(specialInstruc);
		panel.add(textSpecialInstructions);
		
		JLabel lblSpecialInstructions = new JLabel("Special Instructions:");
		lblSpecialInstructions.setBounds(0, 203, 115, 13);
		panel.add(lblSpecialInstructions);
		
		JTextPane txtpnReview = new JTextPane();
		txtpnReview.setText("Cake Diameter: "+info.getCakeSize()+" inches\n\nNumber of Layers: "+info.getCakeLayer()+" layers\n\nCake Flavor: "+type.getFlavor()+
				"\n\nType of Frosting: "+frosting.getFrosting()+"\n\nToppings: "+toppings.toppingsList());
		txtpnReview.setBounds(0, 24, 607, 169);
		txtpnReview.setEditable(false);
		panel.add(txtpnReview);
		review = txtpnReview;
		JButton btnUpdateButton = new JButton("Update");
		btnUpdateButton.setBounds(607, 0, 85, 21);
		panel.add(btnUpdateButton);
		btnUpdateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtpnReview.setText("Cake Diameter: "+info.getCakeSize()+" inches\n\nNumber of Layers: "+info.getCakeLayer()+" layers\n\nCake Flavor: "+type.getFlavor()+
						"\n\nType of Frosting: "+frosting.getFrosting()+"\n\nToppings: "+toppings.toppingsList());
				firstName = textFirstNameInput.getText();
				lastName = textLastNameInput.getText();
				textSpecialInstructions.setText(specialInstruc);
				textEmailInput.setText(email);
				
			}
		});
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(0, 328, 692, 83);
		panel.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtpnReview.setText("Cake Diameter: "+info.getCakeSize()+" inches\n\nNumber of Layers: "+info.getCakeLayer()+" layers\n\nCake Flavor: "+type.getFlavor()+
						"\n\nType of Frosting: "+frosting.getFrosting()+"\n\nToppings: "+toppings.toppingsList());
				specialInstructions = textSpecialInstructions.getText();
				firstName = textFirstNameInput.getText();
				lastName = textLastNameInput.getText();
				email1 = textEmailInput.getText();
				if(fm.orderExists(orderNumber)) {
					while(fm.orderExists(orderNumber)) {
						orderNumber++;
					}try {
						BakeryOrder order = new BakeryOrder(orderNumber, firstName,lastName,typeTab.getFlavor(),frostingTab.getFrosting(),infoTab.getCakeSize(),
								infoTab.getCakeLayer(),toppingsTab.toppingsList(),specialInstructions,email);
							order.createOrderFile();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}else {
						BakeryOrder order = new BakeryOrder(orderNumber,firstName,lastName,typeTab.getFlavor(),frostingTab.getFrosting(),infoTab.getCakeSize(),
								infoTab.getCakeLayer(),toppingsTab.toppingsList(),specialInstructions,email);
						try {
							order.createOrderFile();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
				}
				
					
				frame.dispose();
			}
			
		});
	}
	public CakeReviewTab(JPanel panel, CakeInfoTab info, CakeTypeTab type, CakeFrostingTab frosting, CakeToppingsTab toppings, JFrame frame) {
		fileManager fm = new fileManager();
		infoTab = info;
		typeTab = type;
		frostingTab = frosting;
		toppingsTab = toppings;
		textFirstNameInput = new JTextField();
		
		textFirstNameInput = new JTextField();
		textFirstNameInput.setBounds(67, 1, 96, 19);
		panel.add(textFirstNameInput);
		textFirstNameInput.setColumns(10);
		firstName = textFirstNameInput.getText();
		
		txtFirstName = new JLabel();
		txtFirstName.setText("First Name:");
		txtFirstName.setBounds(0, 1, 69, 19);
		panel.add(txtFirstName);
		
		textLastNameInput = new JTextField();
		textLastNameInput.setBounds(231, 1, 96, 19);
		panel.add(textLastNameInput);
		textLastNameInput.setColumns(10);
		lastName = textLastNameInput.getText();
		
		txtLastName = new JLabel();
		txtLastName.setText("Last Name:");
		txtLastName.setBounds(166, 1, 69, 19);
		panel.add(txtLastName);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(329, 4, 45, 13);
		panel.add(lblEmail);
		
		JTextField textEmailInput = new JTextField();
		textEmailInput.setBounds(373, 1, 232, 19);
		panel.add(textEmailInput);
		textEmailInput.setColumns(10);
		
		JTextPane textSpecialInstructions = new JTextPane();
		textSpecialInstructions.setBounds(0, 220, 607, 98);
		panel.add(textSpecialInstructions);
		
		JLabel lblSpecialInstructions = new JLabel("Special Instructions:");
		lblSpecialInstructions.setBounds(0, 203, 115, 13);
		panel.add(lblSpecialInstructions);
		
		JTextPane txtpnReview = new JTextPane();
		txtpnReview.setText("Cake Diameter: "+info.getCakeSize()+" inches\n\nNumber of Layers: "+info.getCakeLayer()+" layers\n\nCake Flavor: "+type.getFlavor()+
				"\n\nType of Frosting: "+frosting.getFrosting()+"\n\nToppings: "+toppings.toppingsList());
		txtpnReview.setBounds(0, 24, 607, 169);
		txtpnReview.setEditable(false);
		panel.add(txtpnReview);
		review = txtpnReview;
		JButton btnUpdateButton = new JButton("Update");
		btnUpdateButton.setBounds(607, 0, 85, 21);
		panel.add(btnUpdateButton);
		btnUpdateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtpnReview.setText("Cake Diameter: "+info.getCakeSize()+" inches\n\nNumber of Layers: "+info.getCakeLayer()+" layers\n\nCake Flavor: "+type.getFlavor()+
						"\n\nType of Frosting: "+frosting.getFrosting()+"\n\nToppings: "+toppings.toppingsList());
				firstName = textFirstNameInput.getText();
				lastName = textLastNameInput.getText();
				
			}
		});
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(0, 328, 692, 83);
		panel.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtpnReview.setText("Cake Diameter: "+info.getCakeSize()+" inches\n\nNumber of Layers: "+info.getCakeLayer()+" layers\n\nCake Flavor: "+type.getFlavor()+
						"\n\nType of Frosting: "+frosting.getFrosting()+"\n\nToppings: "+toppings.toppingsList());
				specialInstructions = textSpecialInstructions.getText();
				firstName = textFirstNameInput.getText();
				lastName = textLastNameInput.getText();
				email1 = textEmailInput.getText();
				if(fm.orderExists(orderNumber)) {
					while(fm.orderExists(orderNumber)) {
						orderNumber++;
					}try {
						BakeryOrder order = new BakeryOrder(orderNumber, firstName,lastName,typeTab.getFlavor(),frostingTab.getFrosting(),infoTab.getCakeSize(),
								infoTab.getCakeLayer(), toppingsTab.toppingsList(),specialInstructions,email1);
							order.createOrderFile();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}else {
						BakeryOrder order = new BakeryOrder(orderNumber,firstName,lastName,typeTab.getFlavor(),frostingTab.getFrosting(),infoTab.getCakeSize(),
								infoTab.getCakeLayer(), toppingsTab.toppingsList(),specialInstructions,email1);
						try {
							order.createOrderFile();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
				}
				
					
				frame.dispose();
			}
			
		});
	}
	public void updateText() {
		review.setText("Cake Diameter: "+infoTab.getCakeSize()+" inches\n\nNumber of Layers: "+infoTab.getCakeLayer()+" layers\n\nCake Flavor: "+typeTab.getFlavor()+
				"\n\nType of Frosting: "+frostingTab.getFrosting()+"\n\nToppings: "+toppingsTab.toppingsList());
	}
}