/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mahmuda_Munny
 */
public class AddRoom extends JFrame implements ActionListener {

    JTextField t1, t2;
    JComboBox c1, c2, c3;
    JButton b1, b2;

    AddRoom() {
        JLabel l1 = new JLabel("Add Rooms");
        l1.setBounds(150, 20, 100, 20);
        l1.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l1);
        JLabel room = new JLabel("Room Number");
        room.setBounds(60, 80, 120, 30);
        room.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(room);
        t1 = new JTextField();
        t1.setBounds(200, 80, 150, 30);
        add(t1);

        JLabel Available = new JLabel("Available");
        Available.setBounds(60, 130, 120, 30);
        Available.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(Available);

        c1 = new JComboBox(new String[]{"Available", "Occupiad"});
        c1.setBounds(200, 130, 150, 30);
        c1.setBackground(Color.WHITE);
        add(c1);

        JLabel Status = new JLabel("Cleaning Status");
        Status.setBounds(60, 180, 120, 30);
        Status.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(Status);
        c2 = new JComboBox(new String[]{"Cleaned", "Dirty"});
        c2.setBounds(200, 180, 150, 30);
        c2.setBackground(Color.WHITE);
        add(c2);
        JLabel Price = new JLabel("Price");
        Price.setBounds(60, 230, 120, 30);
        Price.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(Price);
        t2 = new JTextField();
        t2.setBounds(200, 230, 150, 30);
        add(t2);

        JLabel Type = new JLabel("Bed Type");
        Type.setBounds(60, 280, 120, 30);
        Type.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(Type);
        c3 = new JComboBox(new String[]{"Single Bed", "Double Bed"});
        c3.setBounds(200, 280, 150, 30);
        c3.setBackground(Color.WHITE);
        add(c3);
        b1 = new JButton("AddRoom");
        b1.setBounds(60, 350, 130, 30);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        add(b1);
        b2 = new JButton("Cancle");
        b2.setBounds(220, 350, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManage/icons/bed.jpg"));
        JLabel l5 = new JLabel(i1);
        l5.setBounds(400, 30, 500, 350);
        add(l5);

        getContentPane().setBackground(Color.WHITE);
        setBounds(450, 200, 950, 470);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                FileWriter filewriter = new FileWriter("Rooms.txt", true);
                PrintWriter printwriter = new PrintWriter(filewriter);
                printwriter.printf("%17s%37s%31s%31s%28s%n", t1.getText(),
               (String) c1.getSelectedItem(), (String) c2.getSelectedItem(), t2.getText(), (String) c3.getSelectedItem());
                printwriter.printf(" ---------------------------------------------------------------------------------------------------"
                        + "------------------------------------------%n");
                printwriter.close();
                JOptionPane.showMessageDialog(null, "New Room Added");
                this.setVisible(false);
            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddRoom().setVisible(true);
    }
}
