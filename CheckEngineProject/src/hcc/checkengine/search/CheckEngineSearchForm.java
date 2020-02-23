package hcc.checkengine.search;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckEngineSearchForm {
    private JButton searchButton;
    private JPanel checkEngineSearchPanel;
    private JTextField searchTextField;
    private JLabel searchLabel;
    private JRadioButton allTermsRadioButton;
    private JRadioButton anyTermsRadioButton;
    private JRadioButton exactRadioButton;
    private JLabel searchEngineLabel;
    private JButton maintenanceButton;
    private JButton aboutButton;
    private JTextPane resultsPane;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckEngineSearchForm");
        frame.setTitle("Check Engine Search");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setResizable(false);
        frame.setContentPane(new CheckEngineSearchForm().checkEngineSearchPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public CheckEngineSearchForm() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Search code here...
            }
        });
        maintenanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Show maintenance form...
            }
        });
        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Display about information...
            }
        });
    }
}
