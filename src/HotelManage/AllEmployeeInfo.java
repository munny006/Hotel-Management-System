/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Mahmuda_Munny
 */
public class AllEmployeeInfo extends JFrame implements ActionListener {

    JButton b1, b2;

    JTextArea screen;
    JScrollPane scroll;

   AllEmployeeInfo() {
        setTitle("Employee details");
        setSize(1000, 640);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container objContainer = getContentPane();
        objContainer.setLayout(null);
        objContainer.setBackground(Color.WHITE);
        
        screen = new JTextArea();
        scroll = new JScrollPane(screen, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(0, 40, 1000, 500);
        screen.setEditable(false);
        objContainer.add(scroll);
        
        JLabel l1 = new JLabel("Name");
        l1.setFont(new Font("Tahoma", Font.BOLD, 16));
        l1.setBounds(40, 10, 70, 20);
        objContainer.add(l1);

        JLabel l2 = new JLabel("Age");
        l2.setFont(new Font("Tahoma", Font.BOLD, 16));
        l2.setBounds(160, 10, 70, 20);
        
        objContainer.add(l2);

        JLabel l3 = new JLabel("Job");
        l3.setFont(new Font("Tahoma", Font.BOLD, 16));
       l3.setBounds(290, 10, 70, 20);
          
        objContainer.add(l3);

        JLabel l4 = new JLabel("Salary");
        l4.setFont(new Font("Tahoma", Font.BOLD, 16));
        l4.setBounds(400, 10, 70, 20);
        objContainer.add(l4);
        
        JLabel l5 = new JLabel("Gender");
        l5.setFont(new Font("Tahoma", Font.BOLD, 16));
       l5.setBounds(520, 10, 70, 20);
        
        objContainer.add(l5);
        
        JLabel l6 = new JLabel("Phone");
        l6.setFont(new Font("Tahoma", Font.BOLD, 16));
        l6.setBounds(663, 10, 70, 20);
       
        objContainer.add(l6);
        
        JLabel l8 = new JLabel("Email");
        l8.setFont(new Font("Tahoma", Font.BOLD, 16));
       l8.setBounds(850, 10, 70, 20);
       
        
        objContainer.add(l8);
        
        b1 = new JButton("Load Data");
        b1.setBounds(350, 560, 120, 30);
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        objContainer.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(530, 560, 120, 30);
        b2.setForeground(Color.white);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                FileReader reader = new FileReader("Employee.txt");
                BufferedReader br = new BufferedReader(reader);
                screen.read(br, null);
                br.close();
                screen.requestFocus();
            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {
            new Reciption().setVisible(true);
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new AllEmployeeInfo().setVisible(true);

    }
}
