package Tabs;


import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CakeToppingsTab extends JPanel {

	private int toppingsPrice = 0;
	private ArrayList<String> toppings = new ArrayList<String>(3);
	public CakeToppingsTab(JPanel panel, String topping1, String topping2, String topping3) {
		
		JLabel lblToppings = new JLabel("Toppings (Select up to three)");
		lblToppings.setBounds(10, 10, 250, 13);
		panel.add(lblToppings);
		JCheckBox chckbxStrawberries = new JCheckBox("Strawberries");
		chckbxStrawberries.setBounds(10, 29, 113, 21);
		panel.add(chckbxStrawberries);
		chckbxStrawberries.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size()== 3) {
					chckbxStrawberries.setSelected(false);
				}
				if(chckbxStrawberries.isSelected()==true) {
					toppings.add("Strawberries");
				} else {
					if(toppings.contains("Strawberries"))
						toppings.remove(toppings.indexOf("Strawberries"));
				}
			}
		});
		JCheckBox chckbxOreos = new JCheckBox("Oreos");
		chckbxOreos.setBounds(125, 29, 113, 21);
		panel.add(chckbxOreos);
		chckbxOreos.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxOreos.setSelected(false);
				}
				if(chckbxOreos.isSelected()==true) {
					toppings.add("Oreos");
				} else {
					if(toppings.contains("Oreos"))
						toppings.remove(toppings.indexOf("Oreos"));
				}	
			}
		});
		JCheckBox chckbxSprinkles = new JCheckBox("Sprinkles");
		chckbxSprinkles.setBounds(240, 29, 113, 21);
		panel.add(chckbxSprinkles);
		chckbxSprinkles.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxSprinkles.setSelected(false);
				}
				if(chckbxSprinkles.isSelected()==true) {
					toppings.add("Sprinkles");
				} else {
					if(toppings.contains("Sprinkles"))
						toppings.remove(toppings.indexOf("Sprinkles"));
				}
			}
		});
		JCheckBox chckbxGlitter = new JCheckBox("Glitter");
		chckbxGlitter.setBounds(10, 52, 113, 21);
		panel.add(chckbxGlitter);
		chckbxGlitter.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxGlitter.setSelected(false);
				}
				if(chckbxGlitter.isSelected()==true) {
					toppings.add("Glitter");
				} else {
					if(toppings.contains("Glitter"))
						toppings.remove(toppings.indexOf("Glitter"));
				}
			}
		});
		JCheckBox chckbxCherries = new JCheckBox("Cherries");
		chckbxCherries.setBounds(125, 52, 113, 21);
		panel.add(chckbxCherries);
		chckbxCherries.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxCherries.setSelected(false);
				}
				if(chckbxCherries.isSelected()==true) {
					toppings.add("Cherries");
				} else {
					if(toppings.contains("Cherries"))
						toppings.remove(toppings.indexOf("Cherries"));
				}
			}
		});
		JCheckBox chckbxChocolateSyrup = new JCheckBox("Chocolate Syrup");
		chckbxChocolateSyrup.setBounds(240, 52, 125, 21);
		panel.add(chckbxChocolateSyrup);
		chckbxChocolateSyrup.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxChocolateSyrup.setSelected(false);
				}
				if(chckbxChocolateSyrup.isSelected()==true) {
					toppings.add("Chocolate Syrup");
				} else {
					if(toppings.contains("Chocolate Syrup"))
						toppings.remove(toppings.indexOf("Chocolate Syrup"));
				}
			}
		});
		JCheckBox chckbxCookieCrumbs = new JCheckBox("Cookie Crumbs");
		chckbxCookieCrumbs.setBounds(10, 75, 118, 21);
		panel.add(chckbxCookieCrumbs);
		chckbxCookieCrumbs.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxCookieCrumbs.setSelected(false);
				}
				if(chckbxCookieCrumbs.isSelected()==true) {
					toppings.add("Cookie Crumbs");
				} else {
					if(toppings.contains("Cookie Crumbs"))
						toppings.remove(toppings.indexOf("Cookie Crumbs"));
				}
			}
		});
		JCheckBox chckbxChocolate = new JCheckBox("Chocolate");
		chckbxChocolate.setBounds(125, 75, 113, 21);
		panel.add(chckbxChocolate);
		chckbxChocolate.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxChocolate.setSelected(false);
				}
				if(chckbxChocolate.isSelected()==true) {
					toppings.add("Chocolate");
				} else {
					if(toppings.contains("Chocolate"))
						toppings.remove(toppings.indexOf("Chocolate"));
				}
			}
		});
		JCheckBox chckbxCaramelSyrup = new JCheckBox("Caramel Syrup");
		chckbxCaramelSyrup.setBounds(240, 75, 125, 21);
		panel.add(chckbxCaramelSyrup);
		chckbxCaramelSyrup.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxCaramelSyrup.setSelected(false);
				}
				if(chckbxCaramelSyrup.isSelected()==true) {
					toppings.add("Caramel Syrup");
				} else {
					if(toppings.contains("Caramel Syrup"))
						toppings.remove(toppings.indexOf("Caramel Syrup"));
				}
			}
		});
		if(topping1.equals("Strawberries") || topping2.equals("Strawberries") || topping3.equals("Strawberries")) {
			chckbxStrawberries.setSelected(true);
		}
		if(topping1.equals("Oreos") || topping2.equals("Oreos") || topping3.equals("Oreos")) {
			chckbxOreos.setSelected(true);
		}
		if(topping1.equals("Sprinkles") || topping2.equals("Sprinkles") || topping3.equals("Sprinkles")) {
			chckbxSprinkles.setSelected(true);
		}
		if(topping1.equals("Glitter") || topping2.equals("Glitter") || topping3.equals("Glitter")) {
			chckbxGlitter.setSelected(true);
		}
		if(topping1.equals("Cherries") || topping2.equals("Cherries") || topping3.equals("Cherries")) {
			chckbxCherries.setSelected(true);
		}
		if(topping1.equals("Chocolate Syrup") || topping2.equals("Chocolate Syrup") || topping3.equals("Chocolate Syrup")) {
			chckbxChocolateSyrup.setSelected(true);
		}
		if(topping1.equals("Cookie Crumbs") || topping2.equals("Cookie Crumbs") || topping3.equals("Cookie Crumbs")) {
			chckbxCookieCrumbs.setSelected(true);
		}
		if(topping1.equals("Chocolate") || topping2.equals("Chocolate") || topping3.equals("Chocolate")) {
			chckbxChocolate.setSelected(true);
		}
		if(topping1.equals("Caramel Syrup") || topping2.equals("Caramel Syrup") || topping3.equals("Caramel Syrup")) {
			chckbxCaramelSyrup.setSelected(true);
		}
	}
	public CakeToppingsTab(JPanel panel) {
		
		JLabel lblToppings = new JLabel("Toppings (Select up to three)");
		lblToppings.setBounds(10, 10, 250, 13);
		panel.add(lblToppings);
		JCheckBox chckbxStrawberries = new JCheckBox("Strawberries");
		chckbxStrawberries.setBounds(10, 29, 113, 21);
		panel.add(chckbxStrawberries);
		chckbxStrawberries.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size()== 3) {
					chckbxStrawberries.setSelected(false);
				}
				if(chckbxStrawberries.isSelected()==true) {
					toppings.add("Strawberries");
				} else {
					if(toppings.contains("Strawberries"))
						toppings.remove(toppings.indexOf("Strawberries"));
				}
			}
		});
		JCheckBox chckbxOreos = new JCheckBox("Oreos");
		chckbxOreos.setBounds(125, 29, 113, 21);
		panel.add(chckbxOreos);
		chckbxOreos.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxOreos.setSelected(false);
				}
				if(chckbxOreos.isSelected()==true) {
					toppings.add("Oreos");
				} else {
					if(toppings.contains("Oreos"))
						toppings.remove(toppings.indexOf("Oreos"));
				}	
			}
		});
		JCheckBox chckbxSprinkles = new JCheckBox("Sprinkles");
		chckbxSprinkles.setBounds(240, 29, 113, 21);
		panel.add(chckbxSprinkles);
		chckbxSprinkles.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxSprinkles.setSelected(false);
				}
				if(chckbxSprinkles.isSelected()==true) {
					toppings.add("Sprinkles");
				} else {
					if(toppings.contains("Sprinkles"))
						toppings.remove(toppings.indexOf("Sprinkles"));
				}
			}
		});
		JCheckBox chckbxGlitter = new JCheckBox("Glitter");
		chckbxGlitter.setBounds(10, 52, 113, 21);
		panel.add(chckbxGlitter);
		chckbxGlitter.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxGlitter.setSelected(false);
				}
				if(chckbxGlitter.isSelected()==true) {
					toppings.add("Glitter");
				} else {
					if(toppings.contains("Glitter"))
						toppings.remove(toppings.indexOf("Glitter"));
				}
			}
		});
		JCheckBox chckbxCherries = new JCheckBox("Cherries");
		chckbxCherries.setBounds(125, 52, 113, 21);
		panel.add(chckbxCherries);
		chckbxCherries.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxCherries.setSelected(false);
				}
				if(chckbxCherries.isSelected()==true) {
					toppings.add("Cherries");
				} else {
					if(toppings.contains("Cherries"))
						toppings.remove(toppings.indexOf("Cherries"));
				}
			}
		});
		JCheckBox chckbxChocolateSyrup = new JCheckBox("Chocolate Syrup");
		chckbxChocolateSyrup.setBounds(240, 52, 125, 21);
		panel.add(chckbxChocolateSyrup);
		chckbxChocolateSyrup.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxChocolateSyrup.setSelected(false);
				}
				if(chckbxChocolateSyrup.isSelected()==true) {
					toppings.add("Chocolate Syrup");
				} else {
					if(toppings.contains("ChocolateSyrup"))
						toppings.remove(toppings.indexOf("Chocolate Syrup"));
				}
			}
		});
		JCheckBox chckbxCookieCrumbs = new JCheckBox("Cookie Crumbs");
		chckbxCookieCrumbs.setBounds(10, 75, 118, 21);
		panel.add(chckbxCookieCrumbs);
		chckbxCookieCrumbs.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxCookieCrumbs.setSelected(false);
				}
				if(chckbxCookieCrumbs.isSelected()==true) {
					toppings.add("Cookie Crumbs");
				} else {
					if(toppings.contains("CookieCrumbs"))
						toppings.remove(toppings.indexOf("Cookie Crumbs"));
				}
			}
		});
		JCheckBox chckbxChocolate = new JCheckBox("Chocolate");
		chckbxChocolate.setBounds(125, 75, 113, 21);
		panel.add(chckbxChocolate);
		chckbxChocolate.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxChocolate.setSelected(false);
				}
				if(chckbxChocolate.isSelected()==true) {
					toppings.add("Chocolate");
				} else {
					if(toppings.contains("Chocolate"))
						toppings.remove(toppings.indexOf("Chocolate"));
				}
			}
		});
		JCheckBox chckbxCaramelSyrup = new JCheckBox("Caramel Syrup");
		chckbxCaramelSyrup.setBounds(240, 75, 125, 21);
		panel.add(chckbxCaramelSyrup);
		chckbxCaramelSyrup.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxCaramelSyrup.setSelected(false);
				}
				if(chckbxCaramelSyrup.isSelected()==true) {
					toppings.add("Caramel Syrup");
				} else {
					if(toppings.contains("CaramelSyrup"))
						toppings.remove(toppings.indexOf("Caramel Syrup"));
				}
			}
		});
	}
	public String toppingsList() {
		String list = "";
		for(int i = 0; i < toppings.size(); i++) {
			list += toppings.get(i) + " ";
		}
		return list;
	}
	public int getPrice() {
		toppingsPrice = toppings.size() * 3;
		return toppingsPrice;
	}
}
