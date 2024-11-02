import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class gui_currency {

    public static void convertor() {

        //Title of the app
        JFrame f = new JFrame("Currency Convertor");

        //creating labels
        JLabel l1 = new JLabel("Rupees");
        l1.setBounds(20, 40, 60, 30);
        JLabel l2 = new JLabel("Dollars");
        l2.setBounds(170, 40, 60, 30);


        //creating text feilds
        JTextField t1 = new JTextField("0");
        t1.setBounds(80, 40, 50, 30);
        JTextField t2 = new JTextField("0");
        t2.setBounds(240, 40, 50, 30);


        //creating buttons
        JButton b1 = new JButton("INR to USD");
        b1.setBounds(50, 80, 100, 25);
        JButton b2 = new JButton("USD to INR");
        b2.setBounds(190, 80, 100, 25);
        JButton b3 = new JButton("CLOSE");
        b3.setBounds(150, 150, 80, 30);


        //Listners action function for INR to USD
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try {
                    double Rupee = Double.parseDouble(t1.getText());
                    double Dollar = Rupee/80;
                    t2.setText(String.format("%.2f", Dollar));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Enter a valid number");
                }
            }
        });


        //Listner actions for USD to INR
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                try {
                    double Dollar = Double.parseDouble(t2.getText());
                    double Rupee = Dollar*80;
                    t1.setText(String.format("%.2f", Rupee));
                } catch  (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Enter a valid number");
                }
            }
        });


        //Listner for closeing the app
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }

        });

        //closing app from window key
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        //adding components to frame
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);


        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    
    }

    //calling the function
    public static void main(String args[]){
        convertor();
    }
    
}
