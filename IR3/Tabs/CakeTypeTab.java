package Tabs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CakeTypeTab extends JPanel {

	private String cakeFlavor;
	private ButtonGroup cakeType = new ButtonGroup();
	private ButtonGroup jellyType = new ButtonGroup();
	
	public CakeTypeTab(JPanel panel, String type) {
		
		JLabel lblCakeType = new JLabel("Type of Cake");
		lblCakeType.setBounds(10, 10, 120, 13);
		panel.add(lblCakeType);
		JRadioButton rdbtnVanillaCake = new JRadioButton("Vanilla");
		cakeType.add(rdbtnVanillaCake);
		rdbtnVanillaCake.setBounds(10, 29, 113, 21);
		panel.add(rdbtnVanillaCake);
		rdbtnVanillaCake.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Vanilla";
			}
			
		});
		JRadioButton rdbtnChocolateCake = new JRadioButton("Chocolate");
		cakeType.add(rdbtnChocolateCake);
		rdbtnChocolateCake.setBounds(125, 29, 113, 21);
		panel.add(rdbtnChocolateCake);
		rdbtnChocolateCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Chocolate";
			}
		});
		JRadioButton rdbtnRedVelvetCake = new JRadioButton("Red Velvet");
		cakeType.add(rdbtnRedVelvetCake);
		rdbtnRedVelvetCake.setBounds(240, 29, 113, 21);
		panel.add(rdbtnRedVelvetCake);
		rdbtnRedVelvetCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Red Velvet";
			}
		});
		JRadioButton rdbtnStrawberryCake = new JRadioButton("Strawberry");
		cakeType.add(rdbtnStrawberryCake);
		rdbtnStrawberryCake.setBounds(355, 29, 113, 21);
		panel.add(rdbtnStrawberryCake);
		rdbtnStrawberryCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Strawberry";
			}
		});
		JRadioButton rdbtnCoffeeCake = new JRadioButton("Coffee");
		cakeType.add(rdbtnCoffeeCake);
		rdbtnCoffeeCake.setBounds(10, 52, 113, 21);
		panel.add(rdbtnCoffeeCake);
		rdbtnCoffeeCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Coffee";
			}
		});
		JRadioButton rdbtnPeanutButterCake = new JRadioButton("Peanut Butter");
		cakeType.add(rdbtnPeanutButterCake);
		rdbtnPeanutButterCake.setBounds(125, 52, 113, 21);
		panel.add(rdbtnPeanutButterCake);
		rdbtnPeanutButterCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Peanut Butter";
			}
		});
		JRadioButton rdbtnYellowCake = new JRadioButton("Yellow");
		cakeType.add(rdbtnYellowCake);
		rdbtnYellowCake.setBounds(240, 52, 113, 21);
		panel.add(rdbtnYellowCake);
		rdbtnYellowCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Yellow";
			}
		});
		JRadioButton rdbtnCarrotCake = new JRadioButton("Carrot");
		cakeType.add(rdbtnCarrotCake);
		rdbtnCarrotCake.setBounds(355, 52, 113, 21);
		panel.add(rdbtnCarrotCake);
		rdbtnCarrotCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Carrot";
			}
		});
		if(type.equals("Vanilla")) {
			cakeFlavor = "Vanilla";
			rdbtnVanillaCake.setSelected(true);
		}else if(type.equals("Chocolate")) {
			cakeFlavor = "Chocolate";
			rdbtnChocolateCake.setSelected(true);
		}else if(type.equals("Red Velvet")) {
			cakeFlavor = "Red Velvet";
			rdbtnRedVelvetCake.setSelected(true);
		}else if(type.equals("Strawberry")) {
			cakeFlavor = "Strawberry";
			rdbtnStrawberryCake.setSelected(true);
		}else if(type.equals("Coffee")) {
			cakeFlavor = "Coffee";
			rdbtnCoffeeCake.setSelected(true);
		}else if(type.equals("Peanut Butter")) {
			cakeFlavor = "Peanut Butter";
			rdbtnPeanutButterCake.setSelected(true);
		}else if(type.equals("Yellow")) {
			cakeFlavor = "Yellow";
			rdbtnYellowCake.setSelected(true);
		}else if(type.equals("Carrot")) {
			cakeFlavor = "Carrot";
			rdbtnCarrotCake.setSelected(true);
		}
	}
	public CakeTypeTab(JPanel panel) {
		
		JLabel lblCakeType = new JLabel("Type of Cake");
		lblCakeType.setBounds(10, 10, 120, 13);
		panel.add(lblCakeType);
		JRadioButton rdbtnVanillaCake = new JRadioButton("Vanilla");
		cakeType.add(rdbtnVanillaCake);
		rdbtnVanillaCake.setBounds(10, 29, 113, 21);
		panel.add(rdbtnVanillaCake);
		rdbtnVanillaCake.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Vanilla";
			}
			
		});
		JRadioButton rdbtnChocolateCake = new JRadioButton("Chocolate");
		cakeType.add(rdbtnChocolateCake);
		rdbtnChocolateCake.setBounds(125, 29, 113, 21);
		panel.add(rdbtnChocolateCake);
		rdbtnChocolateCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Chocolate";
			}
		});
		JRadioButton rdbtnRedVelvetCake = new JRadioButton("Red Velvet");
		cakeType.add(rdbtnRedVelvetCake);
		rdbtnRedVelvetCake.setBounds(240, 29, 113, 21);
		panel.add(rdbtnRedVelvetCake);
		rdbtnRedVelvetCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Red Velvet";
			}
		});
		JRadioButton rdbtnStrawberryCake = new JRadioButton("Strawberry");
		cakeType.add(rdbtnStrawberryCake);
		rdbtnStrawberryCake.setBounds(355, 29, 113, 21);
		panel.add(rdbtnStrawberryCake);
		rdbtnStrawberryCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Strawberry";
			}
		});
		JRadioButton rdbtnCoffeeCake = new JRadioButton("Coffee");
		cakeType.add(rdbtnCoffeeCake);
		rdbtnCoffeeCake.setBounds(10, 52, 113, 21);
		panel.add(rdbtnCoffeeCake);
		rdbtnCoffeeCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Coffee";
			}
		});
		JRadioButton rdbtnPeanutButterCake = new JRadioButton("Peanut Butter");
		cakeType.add(rdbtnPeanutButterCake);
		rdbtnPeanutButterCake.setBounds(125, 52, 113, 21);
		panel.add(rdbtnPeanutButterCake);
		rdbtnPeanutButterCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Peanut Butter";
			}
		});
		JRadioButton rdbtnYellowCake = new JRadioButton("Yellow");
		cakeType.add(rdbtnYellowCake);
		rdbtnYellowCake.setBounds(240, 52, 113, 21);
		panel.add(rdbtnYellowCake);
		rdbtnYellowCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Yellow";
			}
		});
		JRadioButton rdbtnCarrotCake = new JRadioButton("Carrot");
		cakeType.add(rdbtnCarrotCake);
		rdbtnCarrotCake.setBounds(355, 52, 113, 21);
		panel.add(rdbtnCarrotCake);
		rdbtnCarrotCake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeFlavor = "Carrot";
			}
		});
}
	public String getFlavor() {
		return cakeFlavor;
	}
}
