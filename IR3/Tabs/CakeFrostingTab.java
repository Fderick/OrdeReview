package Tabs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CakeFrostingTab extends JPanel {

	private String cakeFrosting;
	private ButtonGroup frostingType = new ButtonGroup();
	
	public CakeFrostingTab(JPanel panel, String frosting) {
		
		JLabel lblFrosting = new JLabel("Frosting");
		lblFrosting.setBounds(10, 10, 81, 13);
		panel.add(lblFrosting);
		JRadioButton rdbtnStrawberryFrost = new JRadioButton("Strawberry");
		frostingType.add(rdbtnStrawberryFrost);
		rdbtnStrawberryFrost.setBounds(10, 29, 113, 21);
		panel.add(rdbtnStrawberryFrost);
		rdbtnStrawberryFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Strawberry";
			}
		});
		JRadioButton rdbtnChocolateFrost = new JRadioButton("Chocolate");
		frostingType.add(rdbtnChocolateFrost);
		rdbtnChocolateFrost.setBounds(125, 29, 113, 21);
		panel.add(rdbtnChocolateFrost);
		rdbtnChocolateFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Chocolate";
			}
		});
		JRadioButton rdbtnButterCreamFrost = new JRadioButton("Buttercream");
		frostingType.add(rdbtnButterCreamFrost);
		rdbtnButterCreamFrost.setBounds(240, 29, 113, 21);
		panel.add(rdbtnButterCreamFrost);
		rdbtnButterCreamFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Butter Cream";
			}
		});
		JRadioButton rdbtnCoffeeFrost = new JRadioButton("Coffee");
		frostingType.add(rdbtnCoffeeFrost);
		rdbtnCoffeeFrost.setBounds(10, 52, 113, 21);
		panel.add(rdbtnCoffeeFrost);
		rdbtnCoffeeFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Coffee";
			}
		});
		JRadioButton rdbtnVanillaFrost = new JRadioButton("Vanilla");
		frostingType.add(rdbtnVanillaFrost);
		rdbtnVanillaFrost.setBounds(125, 52, 113, 21);
		panel.add(rdbtnVanillaFrost);
		rdbtnVanillaFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Vanilla";
			}
		});
		JRadioButton rdbtnCreamCheeseFrost = new JRadioButton("Cream Cheese");
		frostingType.add(rdbtnCreamCheeseFrost);
		rdbtnCreamCheeseFrost.setBounds(240, 52, 113, 21);
		panel.add(rdbtnCreamCheeseFrost);
		rdbtnCreamCheeseFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Cream Cheese";
			}
		});
		JRadioButton rdbtnPeanutButterFrost = new JRadioButton("Peanut Butter");
		frostingType.add(rdbtnPeanutButterFrost);
		rdbtnPeanutButterFrost.setBounds(10, 75, 113, 21);
		panel.add(rdbtnPeanutButterFrost);
		rdbtnPeanutButterFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Peanut Butter";
			}
		});
		JRadioButton rdbtnWhippedFrost = new JRadioButton("Whipped");
		frostingType.add(rdbtnWhippedFrost);
		rdbtnWhippedFrost.setBounds(125, 75, 103, 21);
		panel.add(rdbtnWhippedFrost);
		rdbtnWhippedFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Whipped";
			}
		});
		if(frosting.equals("Strawberry")) {
			cakeFrosting = "Strawberry";
			rdbtnStrawberryFrost.setSelected(true);
		}else if(frosting.equals("Chocolate")) {
			cakeFrosting = "Chocolate";
			rdbtnChocolateFrost.setSelected(true);
		}else if(frosting.equals("Butter Cream")) {
			cakeFrosting = "Butter Cream";
			rdbtnButterCreamFrost.setSelected(true);
		}else if(frosting.equals("Coffee")) {
			cakeFrosting = "Coffee";
			rdbtnCoffeeFrost.setSelected(true);
		}else if(frosting.equals("Vanilla")) {
			cakeFrosting = "Vanilla";
			rdbtnVanillaFrost.setSelected(true);
		}else if(frosting.equals("Cream Cheese")) {
			cakeFrosting = "Cream Cheese";
			rdbtnCreamCheeseFrost.setSelected(true);
		}else if(frosting.equals("Peanut Butter")) {
			cakeFrosting = "Peanut Butter";
			rdbtnPeanutButterFrost.setSelected(true);
		}else if(frosting.equals("Whipped")) {
			cakeFrosting = "Whipped";
			rdbtnWhippedFrost.setSelected(true);
		}
	}
	public CakeFrostingTab(JPanel panel) {
		
		JLabel lblFrosting = new JLabel("Frosting");
		lblFrosting.setBounds(10, 10, 81, 13);
		panel.add(lblFrosting);
		JRadioButton rdbtnStrawberryFrost = new JRadioButton("Strawberry");
		frostingType.add(rdbtnStrawberryFrost);
		rdbtnStrawberryFrost.setBounds(10, 29, 113, 21);
		panel.add(rdbtnStrawberryFrost);
		rdbtnStrawberryFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Strawberry";
			}
		});
		JRadioButton rdbtnChocolateFrost = new JRadioButton("Chocolate");
		frostingType.add(rdbtnChocolateFrost);
		rdbtnChocolateFrost.setBounds(125, 29, 113, 21);
		panel.add(rdbtnChocolateFrost);
		rdbtnChocolateFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Chocolate";
			}
		});
		JRadioButton rdbtnButterCreamFrost = new JRadioButton("Buttercream");
		frostingType.add(rdbtnButterCreamFrost);
		rdbtnButterCreamFrost.setBounds(240, 29, 113, 21);
		panel.add(rdbtnButterCreamFrost);
		rdbtnButterCreamFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Butter Cream";
			}
		});
		JRadioButton rdbtnCoffeeFrost = new JRadioButton("Coffee");
		frostingType.add(rdbtnCoffeeFrost);
		rdbtnCoffeeFrost.setBounds(10, 52, 113, 21);
		panel.add(rdbtnCoffeeFrost);
		rdbtnCoffeeFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Coffee";
			}
		});
		JRadioButton rdbtnVanillaFrost = new JRadioButton("Vanilla");
		frostingType.add(rdbtnVanillaFrost);
		rdbtnVanillaFrost.setBounds(125, 52, 113, 21);
		panel.add(rdbtnVanillaFrost);
		rdbtnVanillaFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Vanilla";
			}
		});
		JRadioButton rdbtnCreamCheeseFrost = new JRadioButton("Cream Cheese");
		frostingType.add(rdbtnCreamCheeseFrost);
		rdbtnCreamCheeseFrost.setBounds(240, 52, 113, 21);
		panel.add(rdbtnCreamCheeseFrost);
		rdbtnCreamCheeseFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Cream Cheese";
			}
		});
		JRadioButton rdbtnPeanutButterFrost = new JRadioButton("Peanut Butter");
		frostingType.add(rdbtnPeanutButterFrost);
		rdbtnPeanutButterFrost.setBounds(10, 75, 113, 21);
		panel.add(rdbtnPeanutButterFrost);
		rdbtnPeanutButterFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Peanut Butter";
			}
		});
		JRadioButton rdbtnWhippedFrost = new JRadioButton("Whipped");
		frostingType.add(rdbtnWhippedFrost);
		rdbtnWhippedFrost.setBounds(125, 75, 103, 21);
		panel.add(rdbtnWhippedFrost);
		rdbtnWhippedFrost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFrosting = "Whipped";
			}
		});
	}
	public String getFrosting() {
		return cakeFrosting;
	}
}
