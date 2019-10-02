package myHeight;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class myHeight {

	private JFrame frame;
	private JTextField txtCM;
	private JTextField txtINCH;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myHeight window = new myHeight();
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
	private void doConversion() {
		int cm = Integer.parseInt(txtCM.getText());
		//trouble with decimal
		Double inch = (cm * 0.394) * 0.0833;
		//decimal place of 2
				DecimalFormat df = new DecimalFormat("#.00");
				String feet = df.format(inch);
		txtINCH.setText(feet);
		
	}
	public myHeight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Height Conversion");
		lblTitle.setBounds(140, 27, 126, 16);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblCM = new JLabel("CM");
		lblCM.setBounds(26, 113, 56, 16);
		frame.getContentPane().add(lblCM);
		
		JLabel lblINCH = new JLabel("Feet.inches");
		lblINCH.setBounds(278, 113, 81, 16);
		frame.getContentPane().add(lblINCH);
		
		txtCM = new JTextField();
		txtCM.setBounds(64, 110, 56, 22);
		frame.getContentPane().add(txtCM);
		txtCM.setColumns(10);
		
		txtINCH = new JTextField();
		txtINCH.setBounds(355, 110, 65, 22);
		frame.getContentPane().add(txtINCH);
		txtINCH.setColumns(10);
		
		JButton btnConvert = new JButton("Convert >>");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doConversion();
			}
		});
		btnConvert.setBounds(152, 109, 114, 25);
		frame.getContentPane().add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnClose.setBounds(262, 190, 97, 25);
		frame.getContentPane().add(btnClose);
	}
}
