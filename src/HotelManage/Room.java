/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Mahmuda_Munny
 */
public class Room extends JFrame implements ActionListener{
      JButton b1,b2; 
    JFrame f1 = new JFrame();
JPanel panel = new JPanel ();
JTable t1 = new JTable();
     Room(){
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManage/icons/app.jpg"));
    JLabel l1 = new  JLabel(i1);
    l1.setBounds(620,10,490,490);
    add(l1);
      
//JTable t1 = new JTable(rec,header);
//panel.add(new JScrollPane(t1));
//f1.add(panel);
t1.setBounds(0,40,600,400);
t1.setVisible(true);
add(panel);
add(t1);
JLabel l2 = new JLabel("Room No");
 l2.setFont(new Font("Tahoma",Font.PLAIN,14));
l2.setBounds(35,10,70,30);
add(l2);
JLabel l3 = new JLabel("Availability");
 l3.setFont(new Font("Tahoma",Font.PLAIN,14));
l3.setBounds(150,10,70,30);
add(l3);
JLabel l4 = new JLabel("Status");
 l4.setFont(new Font("Tahoma",Font.PLAIN,14));
l4.setBounds(280,10,70,30);
add(l4);
JLabel l5 = new JLabel("Price");
 l5.setFont(new Font("Tahoma",Font.PLAIN,14));
l5.setBounds(400,10,70,30);
add(l5);
JLabel l6 = new JLabel("Bed Type");
 l6.setFont(new Font("Tahoma",Font.PLAIN,14));
l6.setBounds(500,10,70,30);
add(l6);
 b1= new JButton("Load Data");
        b1.setBounds(100,460,120,30);
          b1.setForeground(Color.white);
        b1.setBackground(Color.BLACK);
      b1.addActionListener(this);
    add(b1);
    
     b2= new JButton("Back");
         b2.setForeground(Color.white);
       b2.setBackground(Color.BLACK);
         b2.setBounds(250,460,120,30);
     b2.addActionListener(this);
   add(b2);
       getContentPane().setBackground(Color.WHITE);           
 setLayout(null);
 setBounds(450,200,1120,550);
 setVisible(true);  
     }
     public static void main(String[] args) {
         new   Room().setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
          if(ae.getSource()== b1){
          new JTable().setVisible(true);
          //this.setVisible(false);
            try{
          conn c = new conn();
          String str = "select * from room";
  ResultSet rs = c.s.executeQuery(str);
t1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
          
          }
          catch(Exception e){
          
          }
          
}
           else if(ae.getSource()== b2){
       new Reciption (). setVisible(true);
       this.setVisible(false);
      }
    }
            
}
