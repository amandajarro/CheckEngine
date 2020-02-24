package hcc.checkengine.search;
import javax.swing.*;
/**
 * 
 * @author Tyler Whitehouse
 *
 */

public class CheckEngine
{
    public static void main(String[] args) 
    {
        
        // makes Swing data thread safe
        SwingUtilities.invokeLater(new Runnable()
            {
                public void run()
                {
                	new MainWindow();
                }
            });
    }
}

