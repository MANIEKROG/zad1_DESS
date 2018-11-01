package org.cos.zad1.ui.view;

import javax.swing.*;

public class MainFrame extends JFrame {


    private JPanel mainPanel;
    private JButton fileButton;
    private JButton encryptButton;
    private JButton decryptButton;
    private JProgressBar progressBar1;


    private JList progressList;
    private JTextArea textArea1;

    public MainFrame() {
        setSize(800, 600);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
    }

    public JList getProgressList() {
        return progressList;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JButton getFileButton() {
        return fileButton;
    }

    public JButton getEncryptButton() {
        return encryptButton;
    }

    public JButton getDecryptButton() {
        return decryptButton;
    }

    public JProgressBar getProgressBar1() {
        return progressBar1;
    }
}
