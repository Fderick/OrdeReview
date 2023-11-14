package Tabs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CakeInfoTab extends JPanel {

	private JRadioButton rdbtnEightInch, rdbtnTenInch, rdbtnTwelveInch, rdbtnOneLayer, rdbtnTwoLayer, rdbtnThreeLayer;
	private JPanel panel;
	private int cakeDiam;
	private int cakeLayer;
	private boolean jelly;
	private ButtonGroup cakeSize = new ButtonGroup();
	private ButtonGroup layerNum = new ButtonGroup();
	public CakeInfoTab(JPanel panel, int diam, int layer) {
		JLabel lblCakeDiam = new JLabel("Cake Diameter");
		lblCakeDiam.setBounds(10, 10, 111, 13);
		panel.add(lblCakeDiam);
		
		rdbtnEightInch = new JRadioButton("8\"");
		cakeSize.add(rdbtnEightInch);
		rdbtnEightInch.setBounds(6, 29, 84, 21);
		panel.add(rdbtnEightInch);
		rdbtnEightInch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeDiam = 8;
			}
		});
		rdbtnTenInch = new JRadioButton("10\"");
		cakeSize.add(rdbtnTenInch);
		rdbtnTenInch.setBounds(92, 29, 84, 21);
		panel.add(rdbtnTenInch);
		rdbtnTenInch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeDiam = 10;
			}
		});
		rdbtnTwelveInch = new JRadioButton("12\"");
		cakeSize.add(rdbtnTwelveInch);
		rdbtnTwelveInch.setBounds(178, 29, 84, 21);
		panel.add(rdbtnTwelveInch);
		rdbtnTwelveInch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeDiam = 12;
			}
		});
		JLabel lblNumLayers = new JLabel("Number of Layers");
		lblNumLayers.setBounds(10, 115, 111, 13);
		panel.add(lblNumLayers);
		
		rdbtnOneLayer = new JRadioButton("1");
		layerNum.add(rdbtnOneLayer);
		rdbtnOneLayer.setBounds(6, 134, 84, 21);
		panel.add(rdbtnOneLayer);
		rdbtnOneLayer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeLayer = 1;
			}
		});
		rdbtnTwoLayer = new JRadioButton("2");
		layerNum.add(rdbtnTwoLayer);
		rdbtnTwoLayer.setBounds(92, 134, 84, 21);
		panel.add(rdbtnTwoLayer);
		rdbtnTwoLayer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeLayer = 2;
			}
		});
		rdbtnThreeLayer = new JRadioButton("3");
		layerNum.add(rdbtnThreeLayer);
		rdbtnThreeLayer.setBounds(178, 134, 84, 21);
		panel.add(rdbtnThreeLayer);
		rdbtnThreeLayer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeLayer = 3;
			}
		});
		if(diam == 8) {
			cakeDiam = 8;
			rdbtnEightInch.setSelected(true);
		}else if(diam == 10) {
			cakeDiam = 10;
			rdbtnTenInch.setSelected(true);
		}else if(diam == 12){
			cakeDiam = 12;
			rdbtnTwelveInch.setSelected(true);
		}
		
		if(layer == 1) {
			cakeLayer = 1;
			rdbtnOneLayer.setSelected(true);
		}else if(layer == 2) {
			cakeLayer = 2;
			rdbtnTwoLayer.setSelected(true);
		}else if(layer == 3){
			cakeLayer = 3;
			rdbtnThreeLayer.setSelected(true);
		}
//		submit = new JButton("Submit");
//		submit.setBounds(417,328, 84, 21);
//		panel.add(submit);
//		submit.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println(cakeDiam + " " + cakeLayer);
//			}
//			
//		});
		
//		JCheckBox chckbxJelly = new JCheckBox("Jelly?");
//		chckbxJelly.setBounds(6, 226, 84, 21);
//		panel.add(chckbxJelly);
//		chckbxJelly.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if(chckbxJelly.isSelected()) {
//					jelly = true;
//				} else {
//					jelly = false;
//				}
//				
//			}
//			
//		});
	}
	public CakeInfoTab(JPanel panel) {
		JLabel lblCakeDiam = new JLabel("Cake Diameter");
		lblCakeDiam.setBounds(10, 10, 111, 13);
		panel.add(lblCakeDiam);
		
		rdbtnEightInch = new JRadioButton("8\"");
		cakeSize.add(rdbtnEightInch);
		rdbtnEightInch.setBounds(6, 29, 84, 21);
		panel.add(rdbtnEightInch);
		rdbtnEightInch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeDiam = 8;
			}
		});
		rdbtnTenInch = new JRadioButton("10\"");
		cakeSize.add(rdbtnTenInch);
		rdbtnTenInch.setBounds(92, 29, 84, 21);
		panel.add(rdbtnTenInch);
		rdbtnTenInch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeDiam = 10;
			}
		});
		rdbtnTwelveInch = new JRadioButton("12\"");
		cakeSize.add(rdbtnTwelveInch);
		rdbtnTwelveInch.setBounds(178, 29, 84, 21);
		panel.add(rdbtnTwelveInch);
		rdbtnTwelveInch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeDiam = 12;
			}
		});
		JLabel lblNumLayers = new JLabel("Number of Layers");
		lblNumLayers.setBounds(10, 115, 111, 13);
		panel.add(lblNumLayers);
		
		rdbtnOneLayer = new JRadioButton("1");
		layerNum.add(rdbtnOneLayer);
		rdbtnOneLayer.setBounds(6, 134, 84, 21);
		panel.add(rdbtnOneLayer);
		rdbtnOneLayer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeLayer = 1;
			}
		});
		rdbtnTwoLayer = new JRadioButton("2");
		layerNum.add(rdbtnTwoLayer);
		rdbtnTwoLayer.setBounds(92, 134, 84, 21);
		panel.add(rdbtnTwoLayer);
		rdbtnTwoLayer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeLayer = 2;
			}
		});
		rdbtnThreeLayer = new JRadioButton("3");
		layerNum.add(rdbtnThreeLayer);
		rdbtnThreeLayer.setBounds(178, 134, 84, 21);
		panel.add(rdbtnThreeLayer);
		rdbtnThreeLayer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cakeLayer = 3;
			}
		});
	}

	public int getCakeLayer() {
		return cakeLayer;
	}

	public int getCakeSize() {
		return cakeDiam;
	}
	public boolean getJellyVis() {
		return jelly;
	}

}