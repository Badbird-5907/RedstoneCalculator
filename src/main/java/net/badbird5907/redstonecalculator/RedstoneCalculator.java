package net.badbird5907.redstonecalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RedstoneCalculator implements ActionListener {
    //TODO remember to change version every time
    public static String version = "2.0";
    JTextField input;
    JComboBox<String> comboBox;
    public RedstoneCalculator(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        input = new JTextField(10);
        input.setText("Amount");
        JButton button = new JButton("Submit");
        String[] choices = {"Repeater", "Observer", "Hopper", "Minecart","Stick","Rails"};
        comboBox = new JComboBox<>(choices);
        comboBox.setMaximumSize(comboBox.preferredSize());
        comboBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,10,100));
       // panel.setLayout(new GridLayout(0,1));
        button.addActionListener(this);
        panel.add(input);
        panel.add(comboBox);
        panel.add(button);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Redstone Calculator");
        //JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

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
        if(s.equalsIgnoreCase("submit")){
            String i = input.getText();
            String b = comboBox.getSelectedItem().toString();
            System.out.println(i);
            System.out.println(b);
            Calculate.process(i.replace("Amount", ""), b);
        }
    }

}
