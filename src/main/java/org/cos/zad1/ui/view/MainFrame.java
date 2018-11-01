package org.cos.zad1.ui.view;

import javax.swing.*;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JButton button1;
    private JTextArea textArea1;

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public MainFrame() {
        setSize(800, 600);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
    }

    public JButton getButton1() {
        return button1;
    }
}
