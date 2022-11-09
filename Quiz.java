import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Quiz extends JFrame implements ActionListener{
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String userans[][] = new String[10][1];
    JLabel qno,que;
    ButtonGroup groupoption;
    JRadioButton opt1,opt2,opt3,opt4;
    JButton next,submit,Lifeline;
    
    public static int timer = 15,flag = 0,p,score=0;
    String username;
    Quiz(String username){
        this.username = username;
            setBounds(0,0,1800,850);
            getContentPane().setBackground(Color.black);
            
            setLayout(null);

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizp.jpg"));
            JLabel image = new JLabel(i1);
            image.setBounds(50,0,1440,390);
            add(image);

            qno = new JLabel();
            qno.setBounds(100,450,50,30);
            qno.setFont(new Font("Tahoma",Font.PLAIN,24));
            qno.setForeground(Color.white);
            add(qno);

            que = new JLabel();
            que.setBounds(150,450,1000,30);
            que.setFont(new Font("Tahoma",Font.PLAIN,24));
            que.setForeground(Color.white);
            add(que);

       




	    questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

	
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        


        
        opt1 = new JRadioButton();
        opt1.setBounds(150,530,700,30);
        opt1.setBackground(Color.black);
        opt1.setForeground(Color.white);
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(150,560,700,30);
        opt2.setBackground(Color.black);
        opt2.setForeground(Color.white);
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(150,590,700,30);
        opt3.setBackground(Color.black);
        opt3.setForeground(Color.white);
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(150,620,700,30);
        opt4.setBackground(Color.black);
        opt4.setForeground(Color.white);
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt4);

        groupoption = new ButtonGroup();
        groupoption.add(opt1);
        groupoption.add(opt2);
        groupoption.add(opt3);
        groupoption.add(opt4);

        Lifeline = new JButton("Life Line");
        Lifeline.setBounds(1100,560,170,35);
        Lifeline.setFont(new Font("Tahoma",Font.PLAIN,20));
        Lifeline.setBackground(Color.green);
        Lifeline.addActionListener(this);
        add(Lifeline);

        next = new JButton("Next");
        next.setBounds(1100,500,170,35);
        next.setFont(new Font("Tahoma",Font.PLAIN,20));
        next.setBackground(Color.white);
        next.addActionListener(this);
        add(next);
 
        submit = new JButton("Submit");
        submit.setBounds(1100,620,170,35);
        submit.setFont(new Font("Tahoma",Font.PLAIN,20));
        submit.setBackground(Color.white);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);


        start(p);



            setVisible(true);

    
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
            repaint();
            opt1.setEnabled(true); 
            opt2.setEnabled(true); 
            opt3.setEnabled(true); 
            opt4.setEnabled(true); 
           
            flag=1;
            if(groupoption.getSelection()==null){
                userans[p][0]="";
            }
            else{
                userans[p][0]=groupoption.getSelection().getActionCommand();
    
            } 

            if(p==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            p++;
            start(p);
        }
        else if(ae.getSource()==Lifeline){
            if(p==2||p==4||p==6||p==8||p==9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }
            else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            Lifeline.setEnabled(false);
        }
        
        else{
            flag=1;
            if(groupoption.getSelection()==null){
                userans[p][0]="";
            }
            else{
                userans[p][0]=groupoption.getSelection().getActionCommand();
    
            }

            for(int i=0;i<userans.length;i++){
                if(userans[i][1].equals(answers[i][1]));
                score+=10;
            }
            setVisible(false);
            new Score(username,score);
        }


    }
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - "+ timer + " seconds";
       
        if(timer<=5 && timer>=0){
            g.setColor(Color.RED);
            g.setFont(new Font("Tahoma",Font.BOLD,20));
            g.drawString(time,1100,480);
        }
        else if(timer>5){
            g.setColor(Color.white);
            g.setFont(new Font("tahoma",Font.BOLD,20));
            g.drawString(time,1100,480);
        }
        else if(timer<=0){
            g.setColor(Color.RED);
            g.setFont(new Font("tahoma",Font.BOLD,30));
            g.drawString("Times up",1115,480);
            
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    if(flag==1){
        flag=0;
        timer = 15;
    }
    else if(timer<0){
        timer = 15;

        opt1.setEnabled(true); 
        opt2.setEnabled(true); 
        opt3.setEnabled(true); 
        opt4.setEnabled(true); 

        if(p==8){
            next.setEnabled(false);
            submit.setEnabled(true);
        }
        if(p==9){
            if(groupoption.getSelection()==null){
                userans[p][0]="";
            }
            else{
                userans[p][0]=groupoption.getSelection().getActionCommand();
    
            }

            for(int i=0;i<userans.length;i++){
                if(userans[i][0].equals(answers[i][1])){
                    score+=10;
                }
                
            }
            setVisible(false);
            new Score(username,score);
        }
        else{
        if(groupoption.getSelection()==null){
            userans[p][0]="";
        }
        else{
            userans[p][0]=groupoption.getSelection().getActionCommand();

        }
        p++;
        start(p);
    }
    }

        
        
    }

    public void start(int count){
        qno.setText(""+(count+1)+". ");
        que.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]); 
        opt4.setActionCommand(questions[count][4]);

        groupoption.clearSelection(); 
        
    }


    public static void main(String[] args){
        new Quiz("User");
    }
}
