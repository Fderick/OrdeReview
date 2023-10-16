package ordereView;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;

public class TestMainApp {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TestMainApp window = new TestMainApp();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(880, 547);
		shell.setText("SWT Application");
		
		Composite composite1 = new Composite(shell, SWT.NO_BACKGROUND);
		composite1.setBounds(0, 0, 880, 547);
		TabFolder tabFolder = new TabFolder(composite1, 0);
		tabFolder.setBounds(0, 0, 880, 547);
		TabItem tbtmCakeSize = new TabItem(tabFolder, SWT.NONE);
		tbtmCakeSize.setText("Cake Size");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NO_BACKGROUND);
		tbtmCakeSize.setControl(composite_1);
		
		Button button = new Button(composite_1, SWT.RADIO);
		button.setBounds(10, 37, 111, 20);
		button.setText("8\"");
		
		Button button_1 = new Button(composite_1, SWT.RADIO);
		button_1.setBounds(127, 37, 111, 20);
		button_1.setText("10\"");
		
		Button button_2 = new Button(composite_1, SWT.RADIO);
		button_2.setBounds(243, 37, 111, 20);
		button_2.setText("12\"");
		
		Label lblCakeDiameter = new Label(composite_1, SWT.NONE);
		lblCakeDiameter.setBounds(10, 10, 344, 20);
		lblCakeDiameter.setText("Cake Diameter");
		
		Composite composite_3 = new Composite(composite_1, SWT.NO_BACKGROUND);
		composite_3.setBounds(0, 129, 354, 108);
		
		Button button_3 = new Button(composite_3, SWT.RADIO);
		button_3.setBounds(9, 35, 111, 20);
		button_3.setText("1");
		
		Button button_4 = new Button(composite_3, SWT.RADIO);
		button_4.setBounds(126, 35, 111, 20);
		button_4.setText("2");
		
		Button button_5 = new Button(composite_3, SWT.RADIO);
		button_5.setBounds(243, 35, 111, 20);
		button_5.setText("3");
		
		Label lblNumberOfLayers = new Label(composite_3, SWT.NONE);
		lblNumberOfLayers.setBounds(10, 10, 344, 20);
		lblNumberOfLayers.setText("Number of Layers");
		
		Button btnJelly = new Button(composite_1, SWT.CHECK);
		btnJelly.setBounds(10, 274, 111, 20);
		btnJelly.setText("Jelly?");
		
		TabItem tbtmCakeFlavor = new TabItem(tabFolder, SWT.NONE);
		tbtmCakeFlavor.setText("Cake Flavor");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NO_BACKGROUND);
		tbtmCakeFlavor.setControl(composite_2);
		
		Button btnVanilla = new Button(composite_2, SWT.RADIO);
		btnVanilla.setBounds(10, 36, 111, 20);
		btnVanilla.setText("Vanilla");
		
		Button btnChocolate = new Button(composite_2, SWT.RADIO);
		btnChocolate.setBounds(127, 36, 111, 20);
		btnChocolate.setText("Chocolate");
		
		Button btnRedVelet = new Button(composite_2, SWT.RADIO);
		btnRedVelet.setBounds(244, 36, 111, 20);
		btnRedVelet.setText("Red Velvet");
		
		Button btnRadioButton = new Button(composite_2, SWT.RADIO);
		btnRadioButton.setBounds(361, 36, 111, 20);
		btnRadioButton.setText("Strawberry");
		
		Label lblTypeOfCake = new Label(composite_2, SWT.NONE);
		lblTypeOfCake.setBounds(10, 10, 462, 20);
		lblTypeOfCake.setText("Type of Cake");
		
		Button btnRadioButton_6 = new Button(composite_2, SWT.RADIO);
		btnRadioButton_6.setBounds(10, 62, 111, 20);
		btnRadioButton_6.setText("Coffee");
		
		Button btnPeanutButter = new Button(composite_2, SWT.RADIO);
		btnPeanutButter.setBounds(127, 62, 111, 20);
		btnPeanutButter.setText("Peanut Butter");
		
		Button btnYellow = new Button(composite_2, SWT.RADIO);
		btnYellow.setBounds(244, 62, 111, 20);
		btnYellow.setText("Yellow");
		
		Button btnCarrot = new Button(composite_2, SWT.RADIO);
		btnCarrot.setBounds(361, 62, 111, 20);
		btnCarrot.setText("Carrot");
		
		Composite composite_6 = new Composite(composite_2, SWT.NO_BACKGROUND);
		composite_6.setBounds(10, 228, 462, 183);
		
		Button btnJelly_1 = new Button(composite_6, SWT.RADIO);
		btnJelly_1.setBounds(0, 28, 111, 20);
		btnJelly_1.setText("Jelly1");
		
		Button btnJelly_5 = new Button(composite_6, SWT.RADIO);
		btnJelly_5.setBounds(0, 54, 111, 20);
		btnJelly_5.setText("Jelly5");
		
		Button btnJelly_6 = new Button(composite_6, SWT.RADIO);
		btnJelly_6.setBounds(117, 54, 111, 20);
		btnJelly_6.setText("Jelly6");
		
		Button btnJelly_2 = new Button(composite_6, SWT.RADIO);
		btnJelly_2.setBounds(117, 28, 111, 20);
		btnJelly_2.setText("Jelly2");
		
		Button btnJelly_3 = new Button(composite_6, SWT.RADIO);
		btnJelly_3.setBounds(234, 28, 111, 20);
		btnJelly_3.setText("Jelly3");
		
		Button btnJelly_7 = new Button(composite_6, SWT.RADIO);
		btnJelly_7.setBounds(234, 54, 111, 20);
		btnJelly_7.setText("Jelly7");
		
		Button btnJelly_8 = new Button(composite_6, SWT.RADIO);
		btnJelly_8.setBounds(351, 54, 111, 20);
		btnJelly_8.setText("Jelly8");
		
		Button btnJelly_4 = new Button(composite_6, SWT.RADIO);
		btnJelly_4.setBounds(351, 28, 111, 20);
		btnJelly_4.setText("Jelly4");
		
		Label lblJelly = new Label(composite_6, SWT.NONE);
		lblJelly.setBounds(0, 2, 70, 20);
		lblJelly.setText("Jelly");
		
		TabItem tbtmFrosting = new TabItem(tabFolder, SWT.NONE);
		tbtmFrosting.setText("Frosting");
		
		Composite composite = new Composite(tabFolder, SWT.NO_BACKGROUND);
		tbtmFrosting.setControl(composite);
		
		Label lblFrosting = new Label(composite, SWT.NONE);
		lblFrosting.setBounds(10, 10, 70, 20);
		lblFrosting.setText("Frosting");
		
		Button btnWhippedFRadio = new Button(composite, SWT.RADIO);
		btnWhippedFRadio.setText("Whipped");
		btnWhippedFRadio.setBounds(133, 88, 117, 20);
		
		Button btnPeanutButterFRadio = new Button(composite, SWT.RADIO);
		btnPeanutButterFRadio.setText("Peanut Butter");
		btnPeanutButterFRadio.setBounds(10, 88, 117, 20);
		
		Button btnCoffeeFRadio = new Button(composite, SWT.RADIO);
		btnCoffeeFRadio.setText("Coffee");
		btnCoffeeFRadio.setBounds(10, 62, 117, 20);
		
		Button btnStrawberryFRadio = new Button(composite, SWT.RADIO);
		btnStrawberryFRadio.setText("Strawberry");
		btnStrawberryFRadio.setBounds(10, 36, 117, 20);
		
		Button btnChocolateFRadio = new Button(composite, SWT.RADIO);
		btnChocolateFRadio.setText("Chocolate");
		btnChocolateFRadio.setBounds(133, 36, 117, 20);
		
		Button btnVanillaFRadio = new Button(composite, SWT.RADIO);
		btnVanillaFRadio.setText("Vanilla");
		btnVanillaFRadio.setBounds(133, 62, 117, 20);
		
		Button btnCreamCheeseFRadio = new Button(composite, SWT.RADIO);
		btnCreamCheeseFRadio.setText("Cream Cheese");
		btnCreamCheeseFRadio.setBounds(256, 62, 117, 20);
		
		Button btnButterCreamFRadio = new Button(composite, SWT.RADIO);
		btnButterCreamFRadio.setText("Buttercream");
		btnButterCreamFRadio.setBounds(256, 36, 117, 20);
		
		TabItem tbtmToppings = new TabItem(tabFolder, SWT.NONE);
		tbtmToppings.setText("Toppings");
		
		Composite composite_4 = new Composite(tabFolder, SWT.NO_BACKGROUND);
		tbtmToppings.setControl(composite_4);
		
		Label lblToppings = new Label(composite_4, SWT.NONE);
		lblToppings.setBounds(10, 10, 70, 20);
		lblToppings.setText("Toppings");
		
		Button btnTopping = new Button(composite_4, SWT.CHECK);
		btnTopping.setBounds(10, 36, 111, 20);
		btnTopping.setText("Topping1");
		
		Button btnTopping_1 = new Button(composite_4, SWT.CHECK);
		btnTopping_1.setBounds(127, 36, 111, 20);
		btnTopping_1.setText("Topping2");
		
		Button btnTopping_2 = new Button(composite_4, SWT.CHECK);
		btnTopping_2.setBounds(244, 36, 111, 20);
		btnTopping_2.setText("Topping3");
		
		Button btnTopping_3 = new Button(composite_4, SWT.CHECK);
		btnTopping_3.setBounds(361, 36, 111, 20);
		btnTopping_3.setText("Topping4");
		
		Button btnTopping_4 = new Button(composite_4, SWT.CHECK);
		btnTopping_4.setBounds(10, 62, 111, 20);
		btnTopping_4.setText("Topping5");
		
		Button btnTopping_5 = new Button(composite_4, SWT.CHECK);
		btnTopping_5.setBounds(127, 62, 111, 20);
		btnTopping_5.setText("Topping6");
		
		Button btnTopping_6 = new Button(composite_4, SWT.CHECK);
		btnTopping_6.setBounds(244, 62, 111, 20);
		btnTopping_6.setText("Topping7");
		
		Button btnTopping_7 = new Button(composite_4, SWT.CHECK);
		btnTopping_7.setBounds(361, 62, 111, 20);
		btnTopping_7.setText("Topping8");
		
		TabItem tbtmReviewOrder = new TabItem(tabFolder, SWT.NONE);
		tbtmReviewOrder.setText("Review Order");
		
		Composite composite_5 = new Composite(tabFolder, SWT.NO_BACKGROUND);
		tbtmReviewOrder.setControl(composite_5);
		
		Button btnSubmit = new Button(composite_5, SWT.NONE);
		btnSubmit.setBounds(0, 361, 852, 102);
		btnSubmit.setText("Submit");
		
		Label lblNewLabel = new Label(composite_5, SWT.NONE);
		lblNewLabel.setBounds(0, 0, 872, 406);
		lblNewLabel.setText("Put possible review of selected items?");
	}

}
