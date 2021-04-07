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
import javax.swing.*;

/**
 *
 * @author Mahmuda_Munny
 */
public class AddEmployee extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5, t6;
    JRadioButton r1, r2;
    JComboBox c1;
    JButton b1;
    private String phone;

    AddEmployee() {
        JLabel name = new JLabel("NAME");
        name.setFont(new Font("Tahoma", Font.PLAIN, 17));
        name.setBounds(60, 30, 120, 30);
        add(name);
        t1 = new JTextField();
        t1.setBounds(200, 30, 150, 30);
        add(t1);

        JLabel age = new JLabel("AGE");
        age.setFont(new Font("Tahoma", Font.PLAIN, 17));
        age.setBounds(60, 80, 120, 30);
        add(age);
        t2 = new JTextField();
        t2.setBounds(200, 80, 150, 30);
        add(t2);

        JLabel gender = new JLabel("GENDER");
        gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        gender.setBounds(60, 130, 120, 30);

        add(gender);
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        r1.setBounds(200, 130, 70, 30);
        r1.setBackground(Color.white);
        add(r1);
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        r2.setBounds(267, 130, 90, 30);
        r2.setBackground(Color.white);
        add(r2);
        JLabel job = new JLabel("JOB");
        job.setFont(new Font("Tahoma", Font.PLAIN, 17));
        job.setBounds(60, 180, 150, 30);
        add(job);
        String str[] = {"Front Desk Clerks", "Porters", "HouseKeeping", "Kitchen Staff", "Room Service", "Waiter", "Manager", "Accountant", "Chef"};

        c1 = new JComboBox(str);
        c1.setBounds(200, 180, 150, 30);
        c1.setBackground(Color.white);
        add(c1);

        JLabel salary = new JLabel("SALARY");
        salary.setFont(new Font("Tahoma", Font.PLAIN, 17));
        salary.setBounds(60, 230, 150, 30);
        add(salary);
        t3 = new JTextField();
        t3.setBounds(200, 230, 150, 30);
        add(t3);

        JLabel phone = new JLabel("PHONE");
        phone.setFont(new Font("Tahoma", Font.PLAIN, 17));
        phone.setBounds(60, 280, 150, 30);
        add(phone);
        t4 = new JTextField();
        t4.setBounds(200, 280, 150, 30);
        add(t4);
        
        JLabel email = new JLabel("EMAIL");
        email.setFont(new Font("Tahoma", Font.PLAIN, 17));
        email.setBounds(60, 380, 150, 30);
        add(email);
        t6 = new JTextField();
        t6.setBounds(200, 380, 150, 30);
        add(t6);
        
        b1 = new JButton("Submit");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(200, 430, 150, 30);
        b1.addActionListener(this);
        add(b1);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManage/icons/ee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(300, 10, 500, 540);
        add(l1);
        JLabel l2 = new JLabel("ADD EMPLOYEE DETAILS");
        l2.setForeground(Color.BLUE);
        l2.setBounds(390, 30, 400, 30);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 32));
        add(l2);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(500, 200, 800, 550);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        String name = t1.getText();
//        String age = t2.getText();
//        String job = (String) c1.getSelectedItem();
//        String salary = t3.getText();
        String gender = null;
//        String phone = t4.getText();
//        String email = t6.getText();
        
        if (r1.isSelected()) {
            gender = "Male";

        } else if (r2.isSelected()) {
            gender = "Female";
        }
        
        
        try {
            FileWriter filewriter = new FileWriter("Employee.txt", true);
            PrintWriter printwriter = new PrintWriter(filewriter);
            printwriter.printf("%19s%28s%49s%17s", t1.getText(),
                        t2.getText(),(String) c1.getSelectedItem(), t3.getText());
            printwriter.printf("                                   " + gender + "                       ");
            printwriter.printf("%25s%25s%n", t4.getText(), t6.getText());
            printwriter.printf(" ---------------------------------------------------------------------------------------------------"
                        + "---------------------------------------------------------------------------------------------------------------------------------%n");
            printwriter.close();
            JOptionPane.showMessageDialog(null, "New Employee Added");
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println("e");
        }

    }

    public static void main(String[] args) {
        new AddEmployee().setVisible(true);
    }
    
}
