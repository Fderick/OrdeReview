package Tabs;


import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CakeToppingsTab extends JPanel {

	private ArrayList<String> toppings = new ArrayList<String>(3);
	public CakeToppingsTab(JPanel panel, String topping1, String topping2, String topping3) {
		
		JLabel lblToppings = new JLabel("Toppings (Select up to three)");
		lblToppings.setBounds(10, 10, 250, 13);
		panel.add(lblToppings);
		JCheckBox chckbxTopping1 = new JCheckBox("Topping 1");
		chckbxTopping1.setBounds(10, 29, 113, 21);
		panel.add(chckbxTopping1);
		chckbxTopping1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size()== 3) {
					chckbxTopping1.setSelected(false);
				}
				if(chckbxTopping1.isSelected()==true) {
					toppings.add("Topping1");
				} else {
					if(toppings.contains("Topping1"))
						toppings.remove(toppings.indexOf("Topping1"));
				}
			}
		});
		JCheckBox chckbxTopping2 = new JCheckBox("Topping 2");
		chckbxTopping2.setBounds(125, 29, 113, 21);
		panel.add(chckbxTopping2);
		chckbxTopping2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping2.setSelected(false);
				}
				if(chckbxTopping2.isSelected()==true) {
					toppings.add("Topping2");
				} else {
					if(toppings.contains("Topping2"))
						toppings.remove(toppings.indexOf("Topping2"));
				}	
			}
		});
		JCheckBox chckbxTopping3 = new JCheckBox("Topping 3");
		chckbxTopping3.setBounds(240, 29, 113, 21);
		panel.add(chckbxTopping3);
		chckbxTopping3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping3.setSelected(false);
				}
				if(chckbxTopping3.isSelected()==true) {
					toppings.add("Topping3");
				} else {
					if(toppings.contains("Topping3"))
						toppings.remove(toppings.indexOf("Topping3"));
				}
			}
		});
		JCheckBox chckbxTopping4 = new JCheckBox("Topping 4");
		chckbxTopping4.setBounds(10, 52, 113, 21);
		panel.add(chckbxTopping4);
		chckbxTopping4.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping4.setSelected(false);
				}
				if(chckbxTopping4.isSelected()==true) {
					toppings.add("Topping4");
				} else {
					if(toppings.contains("Topping4"))
						toppings.remove(toppings.indexOf("Topping4"));
				}
			}
		});
		JCheckBox chckbxTopping5 = new JCheckBox("Topping 5");
		chckbxTopping5.setBounds(125, 52, 113, 21);
		panel.add(chckbxTopping5);
		chckbxTopping5.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping5.setSelected(false);
				}
				if(chckbxTopping5.isSelected()==true) {
					toppings.add("Topping5");
				} else {
					if(toppings.contains("Topping5"))
						toppings.remove(toppings.indexOf("Topping5"));
				}
			}
		});
		JCheckBox chckbxTopping6 = new JCheckBox("Topping 6");
		chckbxTopping6.setBounds(240, 52, 113, 21);
		panel.add(chckbxTopping6);
		chckbxTopping6.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping6.setSelected(false);
				}
				if(chckbxTopping6.isSelected()==true) {
					toppings.add("Topping6");
				} else {
					if(toppings.contains("Topping6"))
						toppings.remove(toppings.indexOf("Topping6"));
				}
			}
		});
		JCheckBox chckbxTopping7 = new JCheckBox("Topping 7");
		chckbxTopping7.setBounds(10, 75, 113, 21);
		panel.add(chckbxTopping7);
		chckbxTopping7.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping7.setSelected(false);
				}
				if(chckbxTopping7.isSelected()==true) {
					toppings.add("Topping7");
				} else {
					if(toppings.contains("Topping7"))
						toppings.remove(toppings.indexOf("Topping7"));
				}
			}
		});
		JCheckBox chckbxTopping8 = new JCheckBox("Topping 8");
		chckbxTopping8.setBounds(125, 75, 113, 21);
		panel.add(chckbxTopping8);
		chckbxTopping8.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping8.setSelected(false);
				}
				if(chckbxTopping8.isSelected()==true) {
					toppings.add("Topping8");
				} else {
					if(toppings.contains("Topping8"))
						toppings.remove(toppings.indexOf("Topping8"));
				}
			}
		});
		JCheckBox chckbxTopping9 = new JCheckBox("Topping 9");
		chckbxTopping9.setBounds(240, 75, 113, 21);
		panel.add(chckbxTopping9);
		chckbxTopping9.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping9.setSelected(false);
				}
				if(chckbxTopping9.isSelected()==true) {
					toppings.add("Topping9");
				} else {
					if(toppings.contains("Topping9"))
						toppings.remove(toppings.indexOf("Topping9"));
				}
			}
		});
		if(topping1.equals("Topping1") || topping2.equals("Topping1") || topping3.equals("Topping1")) {
			chckbxTopping1.setSelected(true);
		}
		if(topping1.equals("Topping2") || topping2.equals("Topping2") || topping3.equals("Topping2")) {
			chckbxTopping2.setSelected(true);
		}
		if(topping1.equals("Topping3") || topping2.equals("Topping3") || topping3.equals("Topping3")) {
			chckbxTopping3.setSelected(true);
		}
		if(topping1.equals("Topping4") || topping2.equals("Topping4") || topping3.equals("Topping4")) {
			chckbxTopping4.setSelected(true);
		}
		if(topping1.equals("Topping5") || topping2.equals("Topping5") || topping3.equals("Topping5")) {
			chckbxTopping5.setSelected(true);
		}
		if(topping1.equals("Topping6") || topping2.equals("Topping6") || topping3.equals("Topping6")) {
			chckbxTopping6.setSelected(true);
		}
		if(topping1.equals("Topping7") || topping2.equals("Topping7") || topping3.equals("Topping7")) {
			chckbxTopping7.setSelected(true);
		}
		if(topping1.equals("Topping8") || topping2.equals("Topping8") || topping3.equals("Topping8")) {
			chckbxTopping8.setSelected(true);
		}
		if(topping1.equals("Topping9") || topping2.equals("Topping9") || topping3.equals("Topping9")) {
			chckbxTopping9.setSelected(true);
		}
	}
	public CakeToppingsTab(JPanel panel) {
		
		JLabel lblToppings = new JLabel("Toppings (Select up to three)");
		lblToppings.setBounds(10, 10, 250, 13);
		panel.add(lblToppings);
		JCheckBox chckbxTopping1 = new JCheckBox("Topping 1");
		chckbxTopping1.setBounds(10, 29, 113, 21);
		panel.add(chckbxTopping1);
		chckbxTopping1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size()== 3) {
					chckbxTopping1.setSelected(false);
				}
				if(chckbxTopping1.isSelected()==true) {
					toppings.add("Topping1");
				} else {
					if(toppings.contains("Topping1"))
						toppings.remove(toppings.indexOf("Topping1"));
				}
			}
		});
		JCheckBox chckbxTopping2 = new JCheckBox("Topping 2");
		chckbxTopping2.setBounds(125, 29, 113, 21);
		panel.add(chckbxTopping2);
		chckbxTopping2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping2.setSelected(false);
				}
				if(chckbxTopping2.isSelected()==true) {
					toppings.add("Topping2");
				} else {
					if(toppings.contains("Topping2"))
						toppings.remove(toppings.indexOf("Topping2"));
				}	
			}
		});
		JCheckBox chckbxTopping3 = new JCheckBox("Topping 3");
		chckbxTopping3.setBounds(240, 29, 113, 21);
		panel.add(chckbxTopping3);
		chckbxTopping3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping3.setSelected(false);
				}
				if(chckbxTopping3.isSelected()==true) {
					toppings.add("Topping3");
				} else {
					if(toppings.contains("Topping3"))
						toppings.remove(toppings.indexOf("Topping3"));
				}
			}
		});
		JCheckBox chckbxTopping4 = new JCheckBox("Topping 4");
		chckbxTopping4.setBounds(10, 52, 113, 21);
		panel.add(chckbxTopping4);
		chckbxTopping4.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping4.setSelected(false);
				}
				if(chckbxTopping4.isSelected()==true) {
					toppings.add("Topping4");
				} else {
					if(toppings.contains("Topping4"))
						toppings.remove(toppings.indexOf("Topping4"));
				}
			}
		});
		JCheckBox chckbxTopping5 = new JCheckBox("Topping 5");
		chckbxTopping5.setBounds(125, 52, 113, 21);
		panel.add(chckbxTopping5);
		chckbxTopping5.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping5.setSelected(false);
				}
				if(chckbxTopping5.isSelected()==true) {
					toppings.add("Topping5");
				} else {
					if(toppings.contains("Topping5"))
						toppings.remove(toppings.indexOf("Topping5"));
				}
			}
		});
		JCheckBox chckbxTopping6 = new JCheckBox("Topping 6");
		chckbxTopping6.setBounds(240, 52, 113, 21);
		panel.add(chckbxTopping6);
		chckbxTopping6.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping6.setSelected(false);
				}
				if(chckbxTopping6.isSelected()==true) {
					toppings.add("Topping6");
				} else {
					if(toppings.contains("Topping6"))
						toppings.remove(toppings.indexOf("Topping6"));
				}
			}
		});
		JCheckBox chckbxTopping7 = new JCheckBox("Topping 7");
		chckbxTopping7.setBounds(10, 75, 113, 21);
		panel.add(chckbxTopping7);
		chckbxTopping7.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping7.setSelected(false);
				}
				if(chckbxTopping7.isSelected()==true) {
					toppings.add("Topping7");
				} else {
					if(toppings.contains("Topping7"))
						toppings.remove(toppings.indexOf("Topping7"));
				}
			}
		});
		JCheckBox chckbxTopping8 = new JCheckBox("Topping 8");
		chckbxTopping8.setBounds(125, 75, 113, 21);
		panel.add(chckbxTopping8);
		chckbxTopping8.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping8.setSelected(false);
				}
				if(chckbxTopping8.isSelected()==true) {
					toppings.add("Topping8");
				} else {
					if(toppings.contains("Topping8"))
						toppings.remove(toppings.indexOf("Topping8"));
				}
			}
		});
		JCheckBox chckbxTopping9 = new JCheckBox("Topping 9");
		chckbxTopping9.setBounds(240, 75, 113, 21);
		panel.add(chckbxTopping9);
		chckbxTopping9.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(toppings.size() == 3) {
					chckbxTopping9.setSelected(false);
				}
				if(chckbxTopping9.isSelected()==true) {
					toppings.add("Topping9");
				} else {
					if(toppings.contains("Topping9"))
						toppings.remove(toppings.indexOf("Topping9"));
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
//		return toppings;
	}
}