package hcc.checkengine.search;
import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame 
{
	private JTextArea textArea;
	private JButton btn;

	public MainWindow()
	{
		super ("Search Engine");
		
		setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		btn = new JButton("button test");

		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.NORTH);

		setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
