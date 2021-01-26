package net.badbird5907.redstonecalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RedstoneCalculator implements ActionListener {
    public static String version = "1";
    JTextField input;
    JComboBox<String> comboBox;
    public RedstoneCalculator(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        input = new JTextField(16);
        input.setText("Amount");
        JButton button = new JButton("submit");
        String[] choices = {"Repeater", "Observer", "Hopper", "Minecart"};
        comboBox = new JComboBox<>(choices);
        comboBox.setMaximumSize(comboBox.preferredSize());
        comboBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,10,100));
        panel.setLayout(new GridLayout(0,1));
        button.addActionListener(this);
        panel.add(input);
        panel.add(comboBox);
        panel.add(button);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Redstone Calcuator");
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        System.out.println("Starting");
        Type.init();
        new RedstoneCalculator();
        String ghversion = UpdateChecker.updateCheck();
        if(!ghversion.equalsIgnoreCase(version)){
            System.out.println("Update avaliable!");
            JOptionPane.showMessageDialog(null, "Update Avaliable! Version:" + ghversion +" \nChangelog: " + UpdateChecker.changeLog() + "\ndownload at: https://badbird5907.xyz/calculator");
        }
        else System.out.println("Up to date!");
    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if(s.equals("submit")){
            String i = input.getText();
            String b = comboBox.getSelectedItem().toString();
            System.out.println(i);
            System.out.println(b);
            Calculate.process(i, b);
        }
    }

}
