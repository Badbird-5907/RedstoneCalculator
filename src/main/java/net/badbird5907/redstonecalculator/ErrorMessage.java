package net.badbird5907.redstonecalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class ErrorMessage extends RuntimeException implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton button;
    JLabel label;
    public ErrorMessage(String message){
        try{
            /*
            frame = new JFrame();
            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(100,100,10,100));
            panel.setLayout(new GridLayout(0,1));
            button.addActionListener(this);
            button.setText("Close");
            label.setText(message);
            panel.add(label);
            panel.add(button);
            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Error");
            frame.setDefaultLookAndFeelDecorated(true);
            frame.pack();
            frame.setVisible(true);
             */
            JOptionPane.showMessageDialog(null, message);
        } catch (HeadlessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        System.out.println(s);
        if(s.equals("Close")){
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }
    }
}
