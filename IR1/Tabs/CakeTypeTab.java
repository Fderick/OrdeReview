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
				cakeFlavor = "PeanutButter";
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
//		JLabel lblJellies = new JLabel("Jellies");
//		lblJellies.setBounds(10, 149, 45, 13);
//		panel.add(lblJellies);
//		lblJellies.setVisible(visible);
//		
//		JRadioButton rdbtnJelly1 = new JRadioButton("Jelly 1");
//		jellyType.add(rdbtnJelly1);
//		rdbtnJelly1.setBounds(6, 168, 84, 21);
//		panel.add(rdbtnJelly1);
//		rdbtnJelly1.setVisible(visible);
//		
//		JRadioButton rdbtnJelly2 = new JRadioButton("Jelly 2");
//		jellyType.add(rdbtnJelly2);
//		rdbtnJelly2.setBounds(92, 168, 84, 21);
//		panel.add(rdbtnJelly2);
//		rdbtnJelly2.setVisible(visible);
//		
//		JRadioButton rdbtnJelly3 = new JRadioButton("Jelly 3");
//		jellyType.add(rdbtnJelly3);
//		rdbtnJelly3.setBounds(178, 168, 84, 21);
//		panel.add(rdbtnJelly3);
//		rdbtnJelly3.setVisible(visible);
//		
//		JRadioButton rdbtnJelly4 = new JRadioButton("Jelly 4");
//		jellyType.add(rdbtnJelly4);
//		rdbtnJelly4.setBounds(264, 168, 84, 21);
//		panel.add(rdbtnJelly4);
//		rdbtnJelly4.setVisible(visible);
//		
//		JRadioButton rdbtnJelly5 = new JRadioButton("Jelly 5");
//		jellyType.add(rdbtnJelly5);
//		rdbtnJelly5.setBounds(6, 191, 84, 21);
//		panel.add(rdbtnJelly5);
//		rdbtnJelly5.setVisible(visible);
//		
//		JRadioButton rdbtnJelly6 = new JRadioButton("Jelly 6");
//		jellyType.add(rdbtnJelly6);
//		rdbtnJelly6.setBounds(92, 191, 84, 21);
//		panel.add(rdbtnJelly6);
//		rdbtnJelly6.setVisible(visible);
//		
//		JRadioButton rdbtnJelly7 = new JRadioButton("Jelly 7");
//		jellyType.add(rdbtnJelly7);
//		rdbtnJelly7.setBounds(178, 191, 84, 21);
//		panel.add(rdbtnJelly7);
//		rdbtnJelly7.setVisible(visible);
//		
//		JRadioButton rdbtnJelly8 = new JRadioButton("Jelly 8");
//		jellyType.add(rdbtnJelly8);
//		rdbtnJelly8.setBounds(264, 191, 84, 21);
//		panel.add(rdbtnJelly8);
//		rdbtnJelly8.setVisible(visible);
	}
	public String getFlavor() {
		return cakeFlavor;
	}
}
