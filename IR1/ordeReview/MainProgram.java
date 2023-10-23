package ordeReview;

import java.awt.EventQueue;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import javax.swing.JPanel;

import Tabs.CakeFrostingTab;
import Tabs.CakeInfoTab;
import Tabs.CakeReviewTab;
import Tabs.CakeToppingsTab;
import Tabs.CakeTypeTab;

import javax.swing.ButtonGroup;


public class MainProgram {

	private JFrame frame;
//	private final ButtonGroup cakeSize = new ButtonGroup();
//	private final ButtonGroup layerNum = new ButtonGroup();
//	private final ButtonGroup cakeType = new ButtonGroup();
//	private final ButtonGroup jellyType = new ButtonGroup();
//	private final ButtonGroup frostingType = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainProgram window = new MainProgram();
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
	public MainProgram() {
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
		CakeInfoTab infoTab = new CakeInfoTab(panel);
		panel.add(infoTab);
		tabbedPane.addTab("Cake Size", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		CakeTypeTab cakeTab = new CakeTypeTab(panel_1);
		panel_1.add(cakeTab);
		tabbedPane.addTab("Cake Flavor", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		CakeFrostingTab frostingTab = new CakeFrostingTab(panel_2);
		panel_2.add(frostingTab);
		tabbedPane.addTab("Frosting", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		CakeToppingsTab toppingsTab = new CakeToppingsTab(panel_3);
		panel_3.add(toppingsTab);
		tabbedPane.addTab("Toppings", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		CakeReviewTab reviewTab = new CakeReviewTab(panel_4, infoTab, cakeTab, frostingTab, toppingsTab, frame);
		panel_4.add(reviewTab);
		tabbedPane.addTab("Review Order", null, panel_4, null);
		panel_4.setLayout(null);

	}
}