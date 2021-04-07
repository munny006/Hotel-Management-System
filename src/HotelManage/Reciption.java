/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Mahmuda_Munny
 */
public class Reciption extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    Reciption(){
   /*b1 = new JButton("New Customer Form");
   b1.setBackground(Color.BLACK);
   b1.setForeground(Color.white);
   b1.setBounds(10,30,200,30);
   //b1.setBounds(10,100,200,30);
   b1.addActionListener(this);
   add(b1);*/
      
   b2 = new JButton("Room");
   b2.setBackground(Color.BLACK);
   b2.setForeground(Color.white);
  b2.setBounds(10,90,200,30);
   //b2.setBounds(10,150,200,30);
     b2.addActionListener(this);
   add(b2);
      
   b3 = new JButton("All Employee Info");
   b3.setBackground(Color.BLACK);
   b3.setForeground(Color.white);
   b3.setBounds(10,160,200,30);
      //b3.setBounds(10,190,200,30);

     b3.addActionListener(this);
   add(b3);
      
  /* b4 = new JButton("Customer Info");
   b4.setBackground(Color.BLACK);
   b4.setForeground(Color.white);
  b4.setBounds(10,210,200,30);
    //b4.setBounds(10,230,200,30);
     b4.addActionListener(this);
   add(b4);*/

   b7 = new JButton("Close");
   b7.setBackground(Color.BLACK);
   b7.setForeground(Color.white);
   b7.setBounds(10,230,200,30);
     b7.addActionListener(this);
   add(b7);
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManage/icons/rec.jpg"));
    JLabel l1 = new  JLabel(i1);
    l1.setBounds(250,10,500,320);
    add(l1);
   getContentPane().setBackground(Color.WHITE);           
 setLayout(null);
 setBounds(500,200,800,400);
 setVisible(true);
   
    }
    
    
    
 

    @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()== b1){
//          new NewCustomer().setVisible(true);
           this.setVisible(false);  
      }
      else if(ae.getSource()== b2){
           new   Rooms().setVisible(true);
           this.setVisible(false);
      }
       else if(ae.getSource()== b3){
          new  AllEmployeeInfo(). setVisible(true);
          this.setVisible(false);
      }
        else if(ae.getSource()== b4){
//          new  CustomerInfo().setVisible(true);
      }
      
        else if(ae.getSource()== b7){
           setVisible(false);
      }
      }
    
   public static void main(String[] args) {
       new Reciption().setVisible(true);
    }
}