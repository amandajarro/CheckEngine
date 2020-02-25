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
		JButton srchBtn = new JButton("Search");
		JButton mtnBtn = new JButton("Maintenance");
		JLabel lab1 = new JLabel("<html><font size=8><b>Search Engine</b></html>");
		
		
		lab1.setBounds(180,-5,350,50); 

		srchBtn.setBounds(410,50,80,30);
		
		// abtBtn holds information about the program
		abtBtn.setBounds(474,0,100,30); //x axis, y axis, width, height
		abtBtn.addActionListener(new ActionListener ()
			{
				public void actionPerformed(ActionEvent argO) 
				{
					
					JFrame aboutWindow = new JFrame("About");
					//need to fix formatting
					JLabel abtLab = new JLabel("<html><font size=4>Created for COP 2805C<br>by the Check Engine team.</html>");
					abtLab.setHorizontalAlignment(JLabel.CENTER);
					aboutWindow.setSize(400,300);  
					aboutWindow.setLayout(null);  
					aboutWindow.setVisible(true);
					aboutWindow.setResizable(false);
					aboutWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
					abtLab.setBounds(0,0,400,300);
					
					aboutWindow.add(abtLab);
				}
			});
		
		mtnBtn.setBounds(10,0,130,30); //x axis, y axis, width, height
		mtnBtn.addActionListener(new ActionListener ()
			{
				public void actionPerformed(ActionEvent argO) 
				{
					JFrame addWindow = new JFrame("Maintenance View"); 

					JLabel indxLab = new JLabel("<html><font size=6>Index Maintenence</html>");

					JButton addBtn = new JButton("Add File");
					JButton rbldBtn = new JButton("Rebuild Out-of-date");
					JButton rstBtn = new JButton("Reset Windows");
					JButton rmvBtn = new JButton("Remove Selected Files");

					addWindow.setSize(600,400);  
					addWindow.setLayout(null);  
					addWindow.setVisible(true);
					addWindow.setResizable(false);
					addWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
					indxLab.setBounds(0,0,600,50);
					indxLab.setHorizontalAlignment(JLabel.CENTER);

					//add file button
					addBtn.setBounds(10,320,130,30);

					//rebuild index button 
					rbldBtn.setBounds(10,280,180,30);

					//reset windows button
					rstBtn.setBounds(450,320,130,30);

					//remove file button
					rmvBtn.setBounds(400,280,180,30);

					addWindow.add(indxLab); addWindow.add(addBtn); addWindow.add(rbldBtn); addWindow.add(rstBtn); addWindow.add(rmvBtn);
				}
			});
		
		textArea.setBounds(125,50,280,30);
		
		add(abtBtn); add(textArea); add(mtnBtn); add(lab1); add(srchBtn);
		setLayout(null);
		setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	
}
