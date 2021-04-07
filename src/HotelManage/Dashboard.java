/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManage;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Mahmuda_Munny
 */
public class Dashboard extends JFrame implements ActionListener{
   JMenuBar mb;
   JMenu m1,m2;
   JMenuItem i1,i2,i3;
   
    Dashboard(){
        mb = new JMenuBar();
        add(mb);
        m1 = new JMenu("Hotel Management");
        m1.setFont(new Font("serif",Font.PLAIN,28));
        m1.setForeground(Color.black);
    
        mb.add(m1);
        m2 = new JMenu("Admin");
       
         m2.setFont(new Font("serif",Font.PLAIN,28));
        m2.setForeground(Color.black);
        mb.add(m2);
        i1 = new JMenuItem ("Reciption");
        i1.addActionListener(this);
        m1.add(i1);
        i2 = new JMenuItem ("Add Employeee");
         i2.addActionListener(this);
        m2.add(i2);
        i3 = new JMenuItem ("Add Room");
         i3.addActionListener(this);
        m2.add(i3);
       
        mb.setBounds(0,0,1950,50);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManage/icons/rep.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3)  ;
        l1.setBounds(0,0,1950,1000);
        add(l1);
        JLabel l2 = new JLabel("The MS Group Welcomes You");
        l2.setBounds(650,40,1000,200);
        l2.setFont(new Font("Tahoma",Font.PLAIN,39));
        l2.setForeground(Color.WHITE);
        l1.add(l2);
        setLayout(null);
        setBounds(0,0,1950,1020);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getActionCommand().equals("Reciption")){
           new Reciption ().setVisible(true);
       }
       else if(ae.getActionCommand().equals("Add Employeee"))
       {
       new AddEmployee().setVisible(true);
       }
        else if(ae.getActionCommand().equals("Add Room"))
       {
       new AddRoom().setVisible(true);
       }
       }
    }

