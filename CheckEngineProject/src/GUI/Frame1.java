package GUI;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;



public class Frame1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 714, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(68, 222, 552, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnAllSearchTerms = new JRadioButton("All of the Search Terms");
		rdbtnAllSearchTerms.setBounds(143, 255, 137, 23);
		frame.getContentPane().add(rdbtnAllSearchTerms);
		
		JRadioButton rdbtnNewAnySearchTerms = new JRadioButton("Any of the Search Terms");
		rdbtnNewAnySearchTerms.setBounds(282, 255, 156, 23);
		frame.getContentPane().add(rdbtnNewAnySearchTerms);
		
		JRadioButton rdbtnNewExactSearchTerms = new JRadioButton("Exact Phrase");
		rdbtnNewExactSearchTerms.setBounds(437, 255, 109, 23);
		frame.getContentPane().add(rdbtnNewExactSearchTerms);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.setBounds(262, 286, 156, 36);
		frame.getContentPane().add(btnCheck);
		
		JLabel lblNewLabel = new JLabel("Check Engine");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lblNewLabel.setBounds(178, 118, 337, 66);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Administer View");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_2 = new JMenu("Help");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("About");
		mnNewMenu_2.add(mntmNewMenuItem_2);
	}
}
