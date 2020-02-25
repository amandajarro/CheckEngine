package hcc.checkengine.search;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckEngineMaintenance extends JFrame {

    private static boolean _isOpen = false;

    public static boolean isOpen() {
        return _isOpen;
    }

    public static void showFrame() {
        _isOpen = true;
        CheckEngineMaintenance maintenanceWindow = new CheckEngineMaintenance();

        maintenanceWindow.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                _isOpen = false;
            }
        });

        maintenanceWindow.setVisible(true);
    }

    CheckEngineMaintenance() {

        this.setTitle("Check Engine - Maintenance");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(800, 500);
        this.setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);

        JLabel title = new JLabel("Check Engine Maintenance");
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setBounds(250, 20, 450, 50);
        mainPanel.add(title);

        String data[][] = { { "Row1/1", "Row1/2" },
                { "Row2/1", "Row2/2" },
                { "Row3/1", "Row3/2" },
                { "Row4/1", "Row4/2" }, };
        String[] columns = new String[]{"File Name", "Status"};

        JTable indexTable = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(indexTable);
        scrollPane.setBounds(50, 75, 670, 300);
        mainPanel.add(scrollPane);

        JButton addFileButton = new JButton("Add File");
        addFileButton.setBounds(100, 390, 120, 30);
        mainPanel.add(addFileButton);

        JButton regenerateIndexButton = new JButton("Regenerate Index");
        regenerateIndexButton.setBounds(305, 390, 150, 30);
        mainPanel.add(regenerateIndexButton);

        JButton removeFileButton = new JButton("Remove File(s)");
        removeFileButton.setBounds(540, 390, 120, 30);
        mainPanel.add(removeFileButton);

        //Action listeners
        addFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Adding file to index...");
            }
        });

        regenerateIndexButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Regenerating index...");
            }
        });

        removeFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Removing file(s) from index...");
            }
        });

        this.add(mainPanel);
    }
}
