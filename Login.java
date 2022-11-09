
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton Proceed,back;
    JTextField tfname;
        Login(){
            getContentPane().setBackground(Color.black);
            setLayout(null);
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("new.jpg"));
            JLabel image = new JLabel(i1);
            image.setBounds(270,30,1000,370);
            add(image);

            JLabel heading = new JLabel("PICT QUIZ APP");
            heading.setBounds(620,450,300,40);
            heading.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
            heading.setForeground(Color.white);
            add(heading);

            JLabel name = new JLabel("Enter your name");
            name.setBounds(685,520,300,40);
            name.setFont(new Font("Times New Roman",Font.BOLD,25));
            name.setForeground(Color.white);
            add(name);

            tfname = new JTextField();
            
            tfname.setBounds(620,570,300,25);
            tfname.setFont(new Font("Calibri",Font.BOLD,18));
            add(tfname);

             Proceed = new JButton("Proceed");
            Proceed.setBounds(795,630,125,25);
            Proceed.setBackground(Color.white);
            Proceed.setForeground(new Color(92,169,4));
            Proceed.addActionListener(this);
            add(Proceed);
            // 620,630,125,25

             back = new JButton("Back");
            back.setBounds(620,630,125,25);
            back.setBackground(Color.white);
            back.setForeground(new Color(255,10,10));
            back.addActionListener(this);
            add(back);

            setSize(1800,1800);
            setLocation(0,0);

            setVisible(true);
        }
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==Proceed){
                String name = tfname.getText();
                setVisible(false);
                new Rules(name);
            }
            else if(ae.getSource()==back){
                setVisible(false);
            }
        }
    public static void main(String[] args) {
        new Login();
        
    }
} 
