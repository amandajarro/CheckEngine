package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class addFileFrame extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addFileFrame frame = new addFileFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addFileFrame() {
		setTitle("Add New File");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 144);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JFileChooser openFileChooser = new JFileChooser();
		
		
		final JLabel lblFileName = new JLabel("...");
		lblFileName.setBounds(126, 15, 210, 14);
		contentPane.add(lblFileName);
		
		JButton btnChooseFile = new JButton("Choose File");
		
		btnChooseFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   int returnVal = openFileChooser.showOpenDialog(addFileFrame.this);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = openFileChooser.getSelectedFile();
					String fileName = file.getName();
					lblFileName.setText(fileName);
					
					
				}
				else {
					lblFileName.setText("No File Chosen!");
				}
				
			}
		});
		
		
		btnChooseFile.setBounds(10, 11, 106, 23);
		contentPane.add(btnChooseFile);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBounds(136, 47, 89, 23);
		contentPane.add(btnUpload);
		
		
	}

	
	}
	

