package ordereView;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class TestJSwing {

	private JFrame frame;
	private final ButtonGroup cakeSize = new ButtonGroup();
	private final ButtonGroup layerNum = new ButtonGroup();
	private final ButtonGroup cakeType = new ButtonGroup();
	private final ButtonGroup jellyType = new ButtonGroup();
	private final ButtonGroup frostingType = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestJSwing window = new TestJSwing();
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
	public TestJSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 711, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("OrdeReview");
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 697, 438);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Cake Size", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblCakeDiam = new JLabel("Cake Diameter");
		lblCakeDiam.setBounds(10, 10, 111, 13);
		panel.add(lblCakeDiam);
		
		JRadioButton rdbtnEightInch = new JRadioButton("8\"");
		cakeSize.add(rdbtnEightInch);
		rdbtnEightInch.setBounds(6, 29, 84, 21);
		panel.add(rdbtnEightInch);
		
		JRadioButton rdbtnTenInch = new JRadioButton("10\"");
		cakeSize.add(rdbtnTenInch);
		rdbtnTenInch.setBounds(92, 29, 84, 21);
		panel.add(rdbtnTenInch);
		
		JRadioButton rdbtnTwelveInch = new JRadioButton("12\"");
		cakeSize.add(rdbtnTwelveInch);
		rdbtnTwelveInch.setBounds(178, 29, 84, 21);
		panel.add(rdbtnTwelveInch);
		
		JLabel lblNumLayers = new JLabel("Number of Layers");
		lblNumLayers.setBounds(10, 115, 111, 13);
		panel.add(lblNumLayers);
		
		JRadioButton rdbtnOneLayer = new JRadioButton("1");
		layerNum.add(rdbtnOneLayer);
		rdbtnOneLayer.setBounds(6, 134, 84, 21);
		panel.add(rdbtnOneLayer);
		
		JRadioButton rdbtnTwoLayer = new JRadioButton("2");
		layerNum.add(rdbtnTwoLayer);
		rdbtnTwoLayer.setBounds(92, 134, 84, 21);
		panel.add(rdbtnTwoLayer);
		
		JRadioButton rdbtnThreeLayer = new JRadioButton("3");
		layerNum.add(rdbtnThreeLayer);
		rdbtnThreeLayer.setBounds(178, 134, 84, 21);
		panel.add(rdbtnThreeLayer);
		
		JCheckBox chckbxJelly = new JCheckBox("Jelly?");
		chckbxJelly.setBounds(6, 226, 84, 21);
		panel.add(chckbxJelly);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Cake Flavor", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblCakeType = new JLabel("Type of Cake");
		lblCakeType.setBounds(10, 10, 120, 13);
		panel_1.add(lblCakeType);
		
		JRadioButton rdbtnVanillaCake = new JRadioButton("Vanilla");
		cakeType.add(rdbtnVanillaCake);
		rdbtnVanillaCake.setBounds(10, 29, 113, 21);
		panel_1.add(rdbtnVanillaCake);
		
		JRadioButton rdbtnChocolateCake = new JRadioButton("Chocolate");
		cakeType.add(rdbtnChocolateCake);
		rdbtnChocolateCake.setBounds(125, 29, 113, 21);
		panel_1.add(rdbtnChocolateCake);
		
		JRadioButton rdbtnRedVelvet = new JRadioButton("Red Velvet");
		cakeType.add(rdbtnRedVelvet);
		rdbtnRedVelvet.setBounds(240, 29, 113, 21);
		panel_1.add(rdbtnRedVelvet);
		
		JRadioButton rdbtnStrawberryCake = new JRadioButton("Strawberry");
		cakeType.add(rdbtnStrawberryCake);
		rdbtnStrawberryCake.setBounds(355, 29, 113, 21);
		panel_1.add(rdbtnStrawberryCake);
		
		JRadioButton rdbtnCoffeeCake = new JRadioButton("Coffee");
		cakeType.add(rdbtnCoffeeCake);
		rdbtnCoffeeCake.setBounds(10, 52, 113, 21);
		panel_1.add(rdbtnCoffeeCake);
		
		JRadioButton rdbtnPeanutButterCake = new JRadioButton("Peanut Butter");
		cakeType.add(rdbtnPeanutButterCake);
		rdbtnPeanutButterCake.setBounds(125, 52, 113, 21);
		panel_1.add(rdbtnPeanutButterCake);
		
		JRadioButton rdbtnYellowCake = new JRadioButton("Yellow");
		cakeType.add(rdbtnYellowCake);
		rdbtnYellowCake.setBounds(240, 52, 113, 21);
		panel_1.add(rdbtnYellowCake);
		
		JRadioButton rdbtnCarrotCake = new JRadioButton("Carrot");
		cakeType.add(rdbtnCarrotCake);
		rdbtnCarrotCake.setBounds(355, 52, 113, 21);
		panel_1.add(rdbtnCarrotCake);
		
		JLabel lblJellies = new JLabel("Jellies");
		lblJellies.setBounds(10, 149, 45, 13);
		panel_1.add(lblJellies);
		
		JRadioButton rdbtnJelly1 = new JRadioButton("Jelly 1");
		jellyType.add(rdbtnJelly1);
		rdbtnJelly1.setBounds(6, 168, 84, 21);
		panel_1.add(rdbtnJelly1);
		
		JRadioButton rdbtnJelly2 = new JRadioButton("Jelly 2");
		jellyType.add(rdbtnJelly2);
		rdbtnJelly2.setBounds(92, 168, 84, 21);
		panel_1.add(rdbtnJelly2);
		
		JRadioButton rdbtnJelly3 = new JRadioButton("Jelly 3");
		jellyType.add(rdbtnJelly3);
		rdbtnJelly3.setBounds(178, 168, 84, 21);
		panel_1.add(rdbtnJelly3);
		
		JRadioButton rdbtnJelly4 = new JRadioButton("Jelly 4");
		jellyType.add(rdbtnJelly4);
		rdbtnJelly4.setBounds(264, 168, 84, 21);
		panel_1.add(rdbtnJelly4);
		
		JRadioButton rdbtnJelly5 = new JRadioButton("Jelly 5");
		jellyType.add(rdbtnJelly5);
		rdbtnJelly5.setBounds(6, 191, 84, 21);
		panel_1.add(rdbtnJelly5);
		
		JRadioButton rdbtnJelly6 = new JRadioButton("Jelly 6");
		jellyType.add(rdbtnJelly6);
		rdbtnJelly6.setBounds(92, 191, 84, 21);
		panel_1.add(rdbtnJelly6);
		
		JRadioButton rdbtnJelly7 = new JRadioButton("Jelly 7");
		jellyType.add(rdbtnJelly7);
		rdbtnJelly7.setBounds(178, 191, 84, 21);
		panel_1.add(rdbtnJelly7);
		
		JRadioButton rdbtnJelly8 = new JRadioButton("Jelly 8");
		jellyType.add(rdbtnJelly8);
		rdbtnJelly8.setBounds(264, 191, 84, 21);
		panel_1.add(rdbtnJelly8);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Frosting", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblFrosting = new JLabel("Frosting");
		lblFrosting.setBounds(10, 10, 81, 13);
		panel_2.add(lblFrosting);
		
		JRadioButton rdbtnStrawberryFrost = new JRadioButton("Strawberry");
		frostingType.add(rdbtnStrawberryFrost);
		rdbtnStrawberryFrost.setBounds(10, 29, 113, 21);
		panel_2.add(rdbtnStrawberryFrost);
		
		JRadioButton rdbtnChocolateFrost = new JRadioButton("Chocolate");
		frostingType.add(rdbtnChocolateFrost);
		rdbtnChocolateFrost.setBounds(125, 29, 113, 21);
		panel_2.add(rdbtnChocolateFrost);
		
		JRadioButton rdbtnButtercreamFrost = new JRadioButton("Buttercream");
		frostingType.add(rdbtnButtercreamFrost);
		rdbtnButtercreamFrost.setBounds(240, 29, 113, 21);
		panel_2.add(rdbtnButtercreamFrost);
		
		JRadioButton rdbtnCoffeeFrost = new JRadioButton("Coffee");
		frostingType.add(rdbtnCoffeeFrost);
		rdbtnCoffeeFrost.setBounds(10, 52, 113, 21);
		panel_2.add(rdbtnCoffeeFrost);
		
		JRadioButton rdbtnVanillaFrost = new JRadioButton("Vanilla");
		frostingType.add(rdbtnVanillaFrost);
		rdbtnVanillaFrost.setBounds(125, 52, 113, 21);
		panel_2.add(rdbtnVanillaFrost);
		
		JRadioButton rdbtnCreamCheeseFrost = new JRadioButton("Cream Cheese");
		frostingType.add(rdbtnCreamCheeseFrost);
		rdbtnCreamCheeseFrost.setBounds(240, 52, 103, 21);
		panel_2.add(rdbtnCreamCheeseFrost);
		
		JRadioButton rdbtnPeanutButterFrost = new JRadioButton("Peanut Butter");
		frostingType.add(rdbtnPeanutButterFrost);
		rdbtnPeanutButterFrost.setBounds(10, 75, 113, 21);
		panel_2.add(rdbtnPeanutButterFrost);
		
		JRadioButton rdbtnWhippedFrost = new JRadioButton("Whipped");
		frostingType.add(rdbtnWhippedFrost);
		rdbtnWhippedFrost.setBounds(125, 75, 103, 21);
		panel_2.add(rdbtnWhippedFrost);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Toppings", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblToppings = new JLabel("Toppings");
		lblToppings.setBounds(10, 10, 88, 13);
		panel_3.add(lblToppings);
		
		JCheckBox chckbxTopping1 = new JCheckBox("Topping 1");
		chckbxTopping1.setBounds(10, 29, 113, 21);
		panel_3.add(chckbxTopping1);
		
		JCheckBox chckbxTopping2 = new JCheckBox("Topping 2");
		chckbxTopping2.setBounds(125, 29, 113, 21);
		panel_3.add(chckbxTopping2);
		
		JCheckBox chckbxTopping3 = new JCheckBox("Topping 3");
		chckbxTopping3.setBounds(240, 29, 113, 21);
		panel_3.add(chckbxTopping3);
		
		JCheckBox chckbxTopping4 = new JCheckBox("Topping 4");
		chckbxTopping4.setBounds(10, 52, 113, 21);
		panel_3.add(chckbxTopping4);
		
		JCheckBox chckbxTopping5 = new JCheckBox("Topping 5");
		chckbxTopping5.setBounds(125, 52, 113, 21);
		panel_3.add(chckbxTopping5);
		
		JCheckBox chckbxTopping6 = new JCheckBox("Topping 6");
		chckbxTopping6.setBounds(240, 52, 113, 21);
		panel_3.add(chckbxTopping6);
		
		JCheckBox chckbxTopping7 = new JCheckBox("Topping 7");
		chckbxTopping7.setBounds(10, 75, 113, 21);
		panel_3.add(chckbxTopping7);
		
		JCheckBox chckbxTopping8 = new JCheckBox("Topping 8");
		chckbxTopping8.setBounds(125, 75, 113, 21);
		panel_3.add(chckbxTopping8);
		
		JCheckBox chckbxTopping9 = new JCheckBox("Topping 9");
		chckbxTopping9.setBounds(240, 75, 113, 21);
		panel_3.add(chckbxTopping9);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Review Order", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblReview = new JLabel("Possible order review here");
		lblReview.setBounds(0, 10, 682, 308);
		panel_4.add(lblReview);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(0, 328, 692, 83);
		panel_4.add(btnSubmit);
	}
}
