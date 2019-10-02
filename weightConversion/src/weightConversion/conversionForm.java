package weightConversion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class conversionForm {

	private JFrame frame;
	private JTextField txtKGS;
	private JTextField txtLBS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conversionForm window = new conversionForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	private void doConversion() {
		int kg = Integer.parseInt(txtKGS.getText());
		double pounds;
		pounds = kg * 2.2;
		//problem with decimal
		pounds = Math.round(pounds * 1e2) / 1e2;
		txtLBS.setText("" + pounds);
	}
	/**
	 * Create the application.
	 */
	public conversionForm() {
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
		
		JLabel lblTitle = new JLabel("Weight Conversion");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitle.setBounds(100, 38, 151, 16);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblKG = new JLabel("KG");
		lblKG.setBounds(33, 125, 31, 16);
		frame.getContentPane().add(lblKG);
		
		JButton btnConvert = new JButton("Convert >>");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doConversion();
			}
		});
		btnConvert.setBounds(146, 121, 107, 25);
		frame.getContentPane().add(btnConvert);
		
		JLabel lblLBS = new JLabel("LBS");
		lblLBS.setBounds(265, 125, 56, 16);
		frame.getContentPane().add(lblLBS);
		
		txtKGS = new JTextField();
		txtKGS.setHorizontalAlignment(SwingConstants.CENTER);
		txtKGS.setBounds(73, 112, 61, 32);
		frame.getContentPane().add(txtKGS);
		txtKGS.setColumns(10);
		
		txtLBS = new JTextField();
		txtLBS.setHorizontalAlignment(SwingConstants.CENTER);
		txtLBS.setColumns(10);
		txtLBS.setBounds(306, 112, 61, 32);
		frame.getContentPane().add(txtLBS);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(308, 200, 97, 25);
		frame.getContentPane().add(btnClose);
	}
}
