package org.cos.zad1.ui.controller;

import org.cos.zad1.ui.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainFrameController {

    DefaultListModel<String> listModel;
    File selectedFile;
    byte[] fileData;

    private MainFrame mainFrame;
    private JButton fileButton;
    private JButton encryptButton;
    private JButton decryptButton;
    private JProgressBar progressBar1;
    private JList progressList;
    private JPanel mainPanel;

    public MainFrameController() {
        listModel = new DefaultListModel<>();
        initComponents();
        initListeners();
    }

    public void showMainFrameWindow(){
        mainFrame.setVisible(true);
    }

    private void initListeners() {
        encryptButton.addActionListener(new EncryptButton());
        decryptButton.addActionListener(new DencryptButton());
        fileButton.addActionListener(new FileButton());
    }

    private void initComponents() {
        mainFrame = new MainFrame();

        mainPanel = mainFrame.getMainPanel();
        fileButton = mainFrame.getFileButton();
        encryptButton = mainFrame.getEncryptButton();
        decryptButton = mainFrame.getDecryptButton();
        progressBar1 = mainFrame.getProgressBar1();

//        progressList = new JList();
//
//        mainPanel.add(new JScrollPane(progressList));
    }

    String getBits(byte b)
    {
        String result = "";
        for(int i = 0; i < 8; i++)
            result += (b & (1 << i)) == 0 ? "0" : "1";
        return result;
    }

    private class EncryptButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            progressBar1.setValue(progressBar1.getValue() + 1);
            for (Integer i = 0; i < 10; ++i) {
                listModel.addElement("Magic!!!!");
            }
            //progressList.setModel(listModel);
        }
    }

    private class DencryptButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            progressBar1.setValue(progressBar1.getValue() - 1);
        }
    }

    private class FileButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = fileChooser.getSelectedFile();
                System.out.println(selectedFile.getPath());
                fileData = new byte[(int) selectedFile.length()];
                try {
                    FileInputStream in = new FileInputStream(selectedFile);
                    in.read(fileData);
                    in.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            String tmp = "";
            for (byte b : fileData) {
                tmp += getBits(b);
            }

            System.out.println(tmp);
        }
    }
}
