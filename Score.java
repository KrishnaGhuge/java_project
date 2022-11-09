import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener{
    JButton pa;
    JButton quit;

    Score(String username,int score){


        setBounds(0,0,1800,850);
        getContentPane().setBackground(Color.black);
        
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("mks.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(50,20,1440,390);
        add(image);

        JLabel heading = new JLabel("Thank you "+username+" for playing PICT Quiz");
        heading.setBounds(520,20,600,40);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,28));
        heading.setForeground(Color.white);
        add(heading);

        JLabel sc = new JLabel("Your Score is...");
        sc.setBounds(590,420,600,60);
        sc.setFont(new Font("Mongolian Baiti",Font.BOLD,58));
        sc.setForeground(Color.white);
        add(sc);

        JLabel marks = new JLabel(""+score);
        marks.setBounds(750,500,600,80);
        marks.setFont(new Font("Mongolian Baiti",Font.BOLD,75));
        marks.setForeground(Color.white);
        add(marks);

         pa = new JButton("Play Again");
        pa.setBounds(630,600,125,25);
        // pa.setBackground(Color.gray);
        pa.setFont(new Font("Tahoma",Font.BOLD,13));
        pa.setBackground(Color.white);
        pa.setForeground(Color.black);
        pa.addActionListener(this);
        add(pa);

         quit = new JButton("Quit");
        quit.setBounds(790,600,125,25);
        // quit.setBackground(Color.gray);
        quit.setFont(new Font("Tahoma",Font.BOLD,13));
        quit.setBackground(Color.white);
        quit.setForeground(Color.RED);
        quit.addActionListener(this);
        add(quit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==pa){
            new Login();
        }
        else if(ae.getSource()==quit){
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Score("User",0);
    }
}
