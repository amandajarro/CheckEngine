package hcc.checkengine.search;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow extends JFrame 
{

	public MainWindow()
	{
		super ("Search Engine");
			
		JTextArea textArea = new JTextArea("Search Terms");
		JButton abtBtn = new JButton("About");
		JButton mtnBtn = new JButton("Maintenance");
		JLabel lab1 = new JLabel("<html><font size=8><b>Search Engine</b></html>");
		
		
		lab1.setBounds(180,-5,350,50); 
		
		// abtBtn holds information about the program
		abtBtn.setBounds(484,0,100,30); //x axis, y axis, width, height
		abtBtn.addActionListener(new ActionListener ()
			{
				public void actionPerformed(ActionEvent argO) 
				{
					
					JFrame aboutWindow = new JFrame("About");
					JLabel abtLab = new JLabel("<html><font size=4><p style=\"text-align:center\">Created for COP 2805C<br> </p></html>");
					
					aboutWindow.setSize(400,300);  
					aboutWindow.setLayout(null);  
					aboutWindow.setVisible(true);
					aboutWindow.setResizable(false);
					aboutWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
					abtLab.setBounds(0,0,400,300);
					
					aboutWindow.add(abtLab);
				}
			});
		
		mtnBtn.setBounds(0,0,130,30); //x axis, y axis, width, height
		mtnBtn.addActionListener(new ActionListener ()
			{
				public void actionPerformed(ActionEvent argO) 
				{
					
					JFrame addWindow = new JFrame("Maintenance View");    
					addWindow.setSize(600,400);  
					addWindow.setLayout(null);  
					addWindow.setVisible(true);
					addWindow.setResizable(false);
					addWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
					
				}
			});
		
		textArea.setBounds(125,50,350,20);
		
		add(abtBtn); add(textArea); add(mtnBtn); add(lab1);
		setLayout(null);
		setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
	}
	
}
