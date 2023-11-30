package ordeReview;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class FailOrderNum {

	private JFrame frmImportFail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FailOrderNum window = new FailOrderNum();
					window.frmImportFail.setLocationRelativeTo(null);
					window.frmImportFail.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FailOrderNum() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmImportFail = new JFrame();
		frmImportFail.setLocationRelativeTo(null);
		frmImportFail.setTitle("Import Fail");
		frmImportFail.setBounds(100, 100, 450, 194);
		frmImportFail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmImportFail.getContentPane().setLayout(null);
		frmImportFail.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Order does not exist or name is incorrect");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(84, 47, 257, 27);
		frmImportFail.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setBounds(170, 84, 85, 21);
		frmImportFail.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frmImportFail.dispose();
				
			}
		});
		frmImportFail.setVisible(true);
	}
}
