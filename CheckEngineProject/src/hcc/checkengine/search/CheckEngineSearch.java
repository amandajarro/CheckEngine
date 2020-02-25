package hcc.checkengine.search;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class CheckEngineSearch extends JFrame {
    private JLabel searchLabel;
    private JTextField searchField;
    private JButton searchButton;
    private JButton maintenanceButton;
    private JButton aboutButton;



    public static void main(String[] args) {
        CheckEngineSearch searchWindow = new CheckEngineSearch();
        searchWindow.setVisible(true);

    }

    CheckEngineSearch() {
        this.setTitle("Check Engine Search");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);

        JLabel title = new JLabel("Check Engine Search");
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setBounds(250, 20, 450, 50);
        mainPanel.add(title);

        JLabel searchLabel = new JLabel("Search:");
        searchLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        searchLabel.setBounds(30, 100, 100, 30);
        mainPanel.add(searchLabel);

        JTextField searchText = new JTextField();
        searchText.setBounds(100, 100, 550, 30);
        mainPanel.add(searchText);

        JButton searchButton = new JButton("GO!");
        searchButton.setBounds(655, 100, 100, 30);
        mainPanel.add(searchButton);

        ButtonGroup searchRadioButtons = new ButtonGroup();
        JRadioButton allRadioButton = new JRadioButton("All Terms");
        JRadioButton anyRadioButton = new JRadioButton("Any Terms");
        JRadioButton exactRadioButton = new JRadioButton("Exact Phrase");

        allRadioButton.setBounds(200, 130, 100, 30);
        anyRadioButton.setBounds(300, 130, 100, 30);
        exactRadioButton.setBounds(400, 130, 200, 30);

        searchRadioButtons.add(allRadioButton);
        searchRadioButtons.add(anyRadioButton);
        searchRadioButtons.add(exactRadioButton);
        mainPanel.add(allRadioButton);
        mainPanel.add(anyRadioButton);
        mainPanel.add(exactRadioButton);

        ScrollPane scrollPane = new ScrollPane();
        JTable resultsTable = new JTable();
        scrollPane.setBounds(100, 175, 550, 200);
        scrollPane.add(resultsTable);
        mainPanel.add(scrollPane);

        JButton maintenanceButton = new JButton("Maintenance");
        maintenanceButton.setBounds(20, 420, 120, 30);
        mainPanel.add(maintenanceButton);

        JButton aboutButton = new JButton("About");
        aboutButton.setBounds(640, 420, 120, 30);
        mainPanel.add(aboutButton);

        //Action listeners
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Searching...");
            }
        });

        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Display About information...");
            }
        });

        allRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Searching for all terms...");
            }
        });

        anyRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Searching for any of the terms...");
            }
        });

        exactRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Searching for exact phrase...");
            }
        });

        this.add(mainPanel);
    }
}
