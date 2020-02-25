package hcc.checkengine.search;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow extends JFrame 
{
	private JTextArea textArea;
	private JButton abtBtn;
	
	public MainWindow()
	{
		super ("Search Engine");
		
//		setLayout(new BorderLayout());
		
		textArea = new JTextArea("search");
		
		// abtBtn holds information about the program
		abtBtn = new JButton("About");
		abtBtn.setBounds(50,50,50,50);
		
		
		abtBtn.addActionListener(new ActionListener ()
			{
				public void actionPerformed(ActionEvent argO) 
				{
					
					JFrame about = new JFrame("About");    
					about.setSize(400,400);  
					about.setLayout(null);  
					about.setVisible(true);
					about.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
			});
		
//		add(textArea, BorderLayout.NORTH);
		add(abtBtn);

		setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
