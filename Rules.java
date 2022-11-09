import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener {
    String username;
    JButton start,back;
    Rules(String name){

        this.username=name;
        getContentPane().setBackground(Color.black); 
        setLayout(null);
        setSize(1800,1800);
        setLocation(0,0);
        setVisible(true);

        JLabel heading = new JLabel("Welcome "+name+" to PICT quiz platform!");
        heading.setBounds(520,20,600,40);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,28));
        heading.setForeground(Color.white);
        add(heading);

        JLabel rules = new JLabel(); 
        rules.setBounds(20,90,1500,350);
        rules.setFont(new Font("Calibri",Font.PLAIN,20));
        rules.setForeground(Color.white);
        rules.setText("RULES");
        add(rules);

        start = new JButton("Start");
        start.setBounds(795,630,125,25);
        start.setBackground(Color.white);
        start.setForeground(new Color(92,169,4));
        start.addActionListener(this);
        add(start);
        // 620,630,125,25

         back = new JButton("Back");
        back.setBounds(620,630,125,25);
        back.setBackground( Color.white);
        back.setForeground(new Color(255,10,10));
        back.addActionListener(this);
        add(back);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(username);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Rules("User");
}
}