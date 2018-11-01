package org.cos.zad1.ui.controller;

import org.cos.zad1.ui.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameController {

    private MainFrame mainFrame;
    private JButton button1;
    private JTextArea textArea1;

    public MainFrameController() {
        initComponents();
        initListeners();
    }

    public void showMainFrameWindow(){
        mainFrame.setVisible(true);
    }

    private void initListeners() {
        button1.addActionListener(new Button1Listener());
    }

    private void initComponents() {
        mainFrame = new MainFrame();

        button1 = mainFrame.getButton1();
        textArea1 = mainFrame.getTextArea1();
    }

    private class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textArea1.append("dupa");
        }
    }
}
