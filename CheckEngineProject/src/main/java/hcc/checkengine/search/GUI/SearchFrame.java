package hcc.checkengine.search.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.BitSet;

import static java.awt.EventQueue.*;

public class SearchFrame {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Create the application.
	 */
	public SearchFrame() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 714, 540);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(68, 222, 552, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnAllSearchTerms = new JRadioButton("All of the Search Terms");
		rdbtnAllSearchTerms.setBounds(103, 255, 167, 23);
		frame.getContentPane().add(rdbtnAllSearchTerms);
		
		JRadioButton rdbtnAnySearchTerms = new JRadioButton("Any of the Search Terms");
		rdbtnAnySearchTerms.setBounds(282, 255, 176, 23);
		frame.getContentPane().add(rdbtnAnySearchTerms);
		
		JRadioButton rdbtnExactSearchTerms = new JRadioButton("Exact Phrase");
		rdbtnExactSearchTerms.setBounds(467, 255, 109, 23);
		frame.getContentPane().add(rdbtnExactSearchTerms);

		ButtonGroup rdbtnGroup = new ButtonGroup();
		rdbtnGroup.add(rdbtnAllSearchTerms);
		rdbtnGroup.add(rdbtnAnySearchTerms);
		rdbtnGroup.add(rdbtnExactSearchTerms);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.setBounds(262, 286, 156, 36);
		frame.getContentPane().add(btnCheck);
		
		JLabel lblNewLabel = new JLabel("Check Engine");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lblNewLabel.setBounds(178, 118, 337, 66);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem administratorMenuItem = new JMenuItem("Administrator View");
		mnNewMenu.add(administratorMenuItem);
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		mnNewMenu.add(exitMenuItem);
		
		JMenu helpMenuItem = new JMenu("Help");
		menuBar.add(helpMenuItem);
		
		JMenuItem aboutMenuItem = new JMenuItem("About");
		helpMenuItem.add(aboutMenuItem);

		//Action listeners
		exitMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				frame.dispose();
			}
		});

		administratorMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				AdministratorFrame administratorFrame = new AdministratorFrame();
			}
		});

		rdbtnAllSearchTerms.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("Searching for all terms...");
			}
		});

		rdbtnAnySearchTerms.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("Searching for any terms...");
			}
		});

		rdbtnExactSearchTerms.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("Searching for exact terms...");
			}
		});

		btnCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("Checking...");
			}
		});

		aboutMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("Displaying information about application...");
			}
		});
	}
}
