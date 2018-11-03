package org.cos.zad1.ui.controller;

import org.cos.zad1.ui.crypt.Encrypt;
import org.cos.zad1.ui.crypt.PermuteTable;
import org.cos.zad1.ui.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainFrameController {

    private DefaultListModel<String> listModel;
    private File selectedFile;
    private byte[] fileData;
    private static List<Boolean> bitsArray = new ArrayList<>();

    private MainFrame mainFrame;
    private JButton fileButton;
    private JButton encryptButton;
    private JButton decryptButton;
    private JProgressBar progressBar1;
    private JList progressList;
    private JTextArea keyInput;
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
        progressList = mainFrame.getProgressList();
        keyInput = mainFrame.getKeyInput();
    }

    void getBits(byte b, List list) {
        for(int i = 0; i < 8; i++)
            list.add((b & (1 << i)) == 0 ? "0" : "1");
    }

    private class EncryptButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//            progressBar1.setValue(progressBar1.getValue() + 1);

            PermuteTable permutationTables = new PermuteTable();
            Encrypt encrypt = new Encrypt(bitsArray);
            encrypt.get64bites();
            encrypt.doAPermutation(encrypt.getSixtyFourBites(), encrypt.getPermutedSixtyFourBites() , permutationTables.getFirstPermutationArray());
//            encrypt.devPrintBits(encrypt.getSixtyFourBites(), encrypt.getPermutedSixtyFourBites());
            encrypt.doAPermutation(encrypt.getUserKey(), encrypt.getPermutedUserKey(), permutationTables.getKeyPermutationArray());
//            encrypt.devPrintBits(encrypt.getUserKey(), encrypt.getPermutedUserKey());
            encrypt.splitSixtyFourBitesIntoTwoParts();
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

            List<Boolean> tmp2 = new ArrayList<>();

            for(byte b : fileData) {
                getBits(b, bitsArray);
            }

//            for(Integer i = 0; i < 64; i++) {
//                System.out.println(bitsArray.get(i));
//            }

//            System.out.println(tmp2);
//            PermuteTable permuteTable = new PermuteTable();
//            System.out.println(permuteTable.getFirstPermutationArray()[0]);
//            System.out.println(keyInput.getText());
        }
    }
}
