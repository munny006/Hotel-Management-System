package HotelManage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

class Rooms extends JFrame implements ActionListener {

    //declarations
    JButton b1, b2;
    JScrollPane scroll;

    //Info showing text area's declaration
    JTextArea screen;

    Rooms() {
        setTitle("Room details");
        setSize(1120, 640);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container objContainer = getContentPane();
        objContainer.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManage/icons/app.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(620, 10, 490, 490);
        objContainer.add(l1);

        screen = new JTextArea();
        scroll = new JScrollPane(screen, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(10, 40, 570, 450);
        screen.setEditable(false);
        objContainer.add(scroll);

        JLabel l2 = new JLabel("Room No");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l2.setBounds(35, 10, 70, 30);
        objContainer.add(l2);

        JLabel l3 = new JLabel("Availability");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l3.setBounds(150, 10, 70, 30);
        objContainer.add(l3);

        JLabel l4 = new JLabel("Status");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l4.setBounds(280, 10, 70, 30);
        objContainer.add(l4);

        JLabel l5 = new JLabel("Price");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l5.setBounds(400, 10, 70, 30);
        objContainer.add(l5);

        JLabel l6 = new JLabel("Bed Type");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l6.setBounds(500, 10, 70, 30);
        objContainer.add(l6);

        b1 = new JButton("Load Data");
        b1.setBounds(100, 500, 120, 30);
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        objContainer.add(b1);

        b2 = new JButton("Back");
        b2.setForeground(Color.white);
        b2.setBackground(Color.BLACK);
        b2.setBounds(250, 500, 120, 30);
        b2.addActionListener(this);
        objContainer.add(b2);

        setVisible(true);
    }

    public void readTextFile() {
        try {
            FileReader reader = new FileReader("Rooms.txt");
            BufferedReader br = new BufferedReader(reader);
            screen.read(br, null);
            br.close();
            screen.requestFocus();
        } catch (Exception e2) {

            System.out.println(e2);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand() == "Load Data") {
            readTextFile();
        } else if (e.getActionCommand() == "Back") {
            new Reciption().setVisible(true);
            this.setVisible(false);

        }
    }

    public static void main(String[] args) {

         new Rooms().setVisible(true);

    }
}
