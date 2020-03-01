package hcc.checkengine.search.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdministratorFrame {

	private JFrame frame;
	private static boolean isOpen = false;

	/**
	 * Create the application.
	 */
	public AdministratorFrame() {
		if (!isOpen) {
			initialize();
			this.frame.setVisible(true);
			isOpen = true;
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 714, 540);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				isOpen = false;
			}
		});

		JMenuBar menuBar_1 = new JMenuBar();
		frame.setJMenuBar(menuBar_1);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar_1.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Regenerate Index");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar_1.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Add File");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Remove File");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("File Maintenance ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(255, 11, 156, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Indexed Files: 888");
		lblNewLabel_1.setBounds(10, 454, 103, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
