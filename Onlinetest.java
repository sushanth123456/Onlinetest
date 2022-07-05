import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import java.util.Timer;
import java.util.TimerTask; 

class Login extends JFrame implements ActionListener  
{  
    JButton button;   
    JLabel user, pass, login;  
    JTextField  usert, passt;  
     
    Login()  
    {     
		 Color orange = new Color(255,153,0);	
		 Color grey = new Color(102,102,102);
		 Font font1 = new Font("SansSerif", Font.BOLD, 25);

		 login = new JLabel("LOGIN");
		 login.setBounds(450,250,600,70); 
		 login.setFont( new Font("Serif",Font.BOLD,40));
         login.setBackground(orange);
		 login.setOpaque(true);add(login);

         user = new JLabel("Username");
		 user.setBounds(450,320,600,70); 
		 user.setFont( new Font("Serif",Font.BOLD,40));
         user.setBackground(grey);
         user.setForeground(Color.WHITE);
		 user.setOpaque(true);add(user);
  
         pass = new JLabel("Password");
		 pass.setBounds(450,390,600,70); 
		 pass.setFont( new Font("Serif",Font.BOLD,40));
         pass.setBackground(grey);
		 pass.setForeground(Color.WHITE);
		 pass.setOpaque(true);add(pass);

		 usert = new JTextField(20); 
		 usert.setBounds(640,330,400,50);
		 usert.setFont(font1);add(usert);
        passt = new JPasswordField(20); 
		 passt.setBounds(640,400,400,50);
		 passt.setFont(font1);add(passt);   
          
         button = new JButton("SUBMIT"); 
         button.addActionListener(this); 
		 button.setBounds(750,465,300,50);
		 button.setFont( new Font("Serif",Font.BOLD,30));
		 button.setBackground(orange);add(button); 

		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         setLayout(null);  
         setLocation(0,0);  
         setVisible(true);  
         setSize(1650,1080);  
    
    }  
    public void actionPerformed(ActionEvent ae)    
    {  
        String userValue = usert.getText();          
        String passValue = passt.getText();        
         
        if(!passValue.equals("") && !userValue.equals(""))
            new profile(userValue,passValue); 
        
    }       
} 
class profile extends JFrame implements ActionListener  
{
	 JLabel profile,email,usern,pas;  
	 JTextField emailt,usernt,past;
	 JButton u1,u2,u3,logout,proceed;
     profile(String userValue, String passValue)
	 {
		 Color orange = new Color(255,153,0);	
		 Color grey = new Color(102,102,102);
		 Font font1 = new Font("SansSerif", Font.BOLD, 25);
    	
		 profile = new JLabel("PROFILE");
		 profile.setBounds(350,180,600,70); 
		 profile.setFont( new Font("Serif",Font.BOLD,40));
         profile.setBackground(orange);
		 profile.setOpaque(true);add(profile);

         email = new JLabel("Email");
		 email.setBounds(350,250,600,70); 
		 email.setFont( new Font("Serif",Font.BOLD,40));
         email.setBackground(grey);
         email.setForeground(Color.WHITE);
		 email.setOpaque(true);add(email);
  
         usern = new JLabel("Username");
		 usern.setBounds(350,320,600,70); 
		 usern.setFont( new Font("Serif",Font.BOLD,40));
         usern.setBackground(grey);
		 usern.setForeground(Color.WHITE);
		 usern.setOpaque(true);add(usern);
		 
		 pas = new JLabel("Password");
		 pas.setBounds(350,390,600,70); 
		 pas.setFont( new Font("Serif",Font.BOLD,40));
         pas.setBackground(grey);
		 pas.setForeground(Color.WHITE);
		 pas.setOpaque(true);add(pas);

		 emailt = new JTextField(20); 
		 emailt.setBounds(540,260,400,50);
		 emailt.setFont(font1);add(emailt);
         usernt = new JTextField(20); 
		 usernt.setBounds(540,330,400,50);
		 usernt.setFont(font1);add(usernt); 
		 usernt.setText(userValue); 
		 past = new JTextField(20); 
		 past.setBounds(540,400,400,50);
		 past.setFont(font1);add(past);
		 past.setText(passValue);  

		 proceed = new JButton("PROCEED"); 
         proceed.addActionListener(this); 
		 proceed.setBounds(540,465,400,50);
		 proceed.setFont( new Font("Serif",Font.BOLD,30));
		 proceed.setBackground(orange);add(proceed); 
			
		 logout = new JButton("LOGOUT"); 
         logout.addActionListener(this); 
		 logout.setBounds(540,520,400,50);
		 logout.setFont( new Font("Serif",Font.BOLD,30));
		 logout.setBackground(orange);add(logout);

		 u1 = new JButton("UPDATE"); 
         u1.addActionListener(this); 
		 u1.setBounds(960,260,200,50);
		 u1.setFont( new Font("Serif",Font.BOLD,30));
		 u1.setBackground(orange);add(u1);

		 u2 = new JButton("UPDATE"); 
         u2.addActionListener(this); 
		 u2.setBounds(960,330,200,50);
		 u2.setFont( new Font("Serif",Font.BOLD,30));
		 u2.setBackground(orange);add(u2);
			
		 u3 = new JButton("UPDATE"); 
         u3.addActionListener(this); 
		 u3.setBounds(960,400,200,50);
		 u3.setFont( new Font("Serif",Font.BOLD,30));
		 u3.setBackground(orange);add(u3);

	  	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         setLayout(null);  
         setLocation(0,0);  
         setVisible(true);  
         setSize(1650,1080);  

     }
	  public void actionPerformed(ActionEvent ae)
	  {
		 if(ae.getSource() == u1)
    		emailt.setText("");
		 else if(ae.getSource() == u2)
			usernt.setText("");
		 else if(ae.getSource() == u3)
			past.setText("");
		 else if(ae.getSource() == proceed)
			new Onlinetest("Online_Examination_java@oasisinfobyte");  
		 else if(ae.getSource() == logout)
			System.exit(0);
      }   
}

  
class Onlinetest extends JFrame implements ActionListener  
{  
    JLabel l,timerr;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0; 
    Onlinetest(String s)  
    {  
        super(s);  
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
         b1=new JButton("Next");  
         b1.addActionListener(this);  
         add(b1);
		 b2=new JButton("Result");  
		 b2.addActionListener(this);  
		 add(b2); 
		 b2.setEnabled(false);     
         set(); 

		 Color orange = new Color(255,153,0);	
		 Color grey = new Color(102,102,102);

         l.setBounds(70,180,1400,70); 
		 l.setFont( new Font("Serif",Font.BOLD,40));
         l.setBackground(orange);
		 l.setOpaque(true);
 
         jb[0].setBounds(70,252,1400,70);
		 jb[0].setFont( new Font("Serif",Font.BOLD,40));
		 jb[0].setBackground(grey);
		 jb[0].setOpaque(true);
		 jb[0].setForeground(Color.WHITE);

		 jb[1].setBounds(70,324,1400,70);
		 jb[1].setFont( new Font("Serif",Font.BOLD,40));
		 jb[1].setBackground(grey);
		 jb[1].setOpaque(true);
		 jb[1].setForeground(Color.WHITE);
    
         jb[2].setBounds(70,396,1400,70);
		 jb[2].setFont( new Font("Serif",Font.BOLD,40));
		 jb[2].setBackground(grey);
		 jb[2].setOpaque(true);
		 jb[2].setForeground(Color.WHITE);
   
         jb[3].setBounds(70,468,1400,70);
		 jb[3].setFont( new Font("Serif",Font.BOLD,40));
		 jb[3].setBackground(grey);
		 jb[3].setOpaque(true);
		 jb[3].setForeground(Color.WHITE);
     
         b1.setBounds(70,545,695,50);
		 b1.setFont( new Font("Serif",Font.BOLD,40));
		 b1.setBackground(orange);
 
		 b2.setBounds(775,545,695,50);
		 b2.setFont( new Font("Serif",Font.BOLD,40));

         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         setLayout(null);  
         setLocation(0,0);  
         setVisible(true);  
         setSize(1650,1080);  

		 Timer timer = new Timer();    
		 timerr = new JLabel();  
		 timerr.setFont( new Font("Serif",Font.BOLD,40));
		 timerr.setBounds(1250,145,200,30);
	     timer.scheduleAtFixedRate(new TimerTask() {
            int i = 60;
            public void run() {
    
                timerr.setText("Timer: " + i);
                i--;
    
                if (i < 0) {
                    timer.cancel();
                    timerr.setText("Time Over");
					b1.setBackground(null);
                    b1.setEnabled(false);   
				    b2.setEnabled(true);
				    b2.setBackground(orange);
                }
            }
        },0, 1000);    
        add(timerr);

    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==10)  
            {  	
				  Color orange = new Color(255,153,0);
				  b1.setBackground(null);
                  b1.setEnabled(false);   
				  b2.setEnabled(true);
				  b2.setBackground(orange);
            }  
        }        
        if(e.getActionCommand().equals("Result"))  
        {  	
			if(timerr.getText().equals("Time Over"))
				JOptionPane.showMessageDialog(this,"Your Score is : "+count);
            else
				JOptionPane.showMessageDialog(this,"Your Score is : "+count);  
            System.exit(0);  
        }  
    }  
    void set()  
    {  
        jb[4].setSelected(true);  
        if(current==0)  
        { 
            l.setText(" 1: Java is a");  
            jb[0].setText("High-level programming language");
			  jb[1].setText("Object oriented programming language");
			  jb[2].setText("Functional, imperative and reflective programming language");
			  jb[3].setText("All the above");   
        }  
        if(current==1)  
        { 
            l.setText(" 2: Which data type is used to create a variable that should store text?");  
            jb[0].setText("String");jb[1].setText("myString");jb[2].setText("string");jb[3].setText("Txt");  
        }  
        if(current==2)  
        {  
            l.setText(" 3: How do you create a variable with the numeric value 5?");  
            jb[0].setText("num x = 5");jb[1].setText("x = 5;");jb[2].setText("float x = 5;");jb[3].setText("int x = 5;");  
        }  
        if(current==3)  
        {  
            l.setText(" 4: Which operator can be used to compare two values?");  
            jb[0].setText("< >");jb[1].setText("=");jb[2].setText("> <");jb[3].setText("= =");  
        }  
        if(current==4)  
        {  
            l.setText(" 5: How do you call a method in Java?");  
            jb[0].setText("(methodName);");jb[1].setText("methodName();");jb[2].setText("methodName[];");jb[3].setText("methodName;");  
        }  
        if(current==5)  
        {  
            l.setText(" 6: Which method can be used to find the highest value of x and y?");  
            jb[0].setText("Math.largest(x,y)");jb[1].setText("Math.maxNum(x,y)");jb[2].setText("Math.max(x,y)");jb[3].setText("Math.maximum(x,y)");  
        }  
        if(current==6)  
        {  
            l.setText(" 7: Which one among these is not a class? ");  
            jb[0].setText("Swing");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");  
                        jb[3].setText("Button");  
        }  
        if(current==7)  
        {  
            l.setText(" 8: Which keyword is used to import a package from the Java API library?");  
            jb[0].setText("lib");jb[1].setText("getlib");jb[2].setText("import");  
                        jb[3].setText("package");         
        }  
        if(current==8)  
        {  
            l.setText(" 9: Which method must be implemented by all threads?");  
            jb[0].setText("wait()");jb[1].setText("start()");jb[2].setText("stop()");jb[3].setText("run()");  
        }  
        if(current==9)  
        {  
            l.setText(" 10: The last value in an array arr can be found at index?");  
            jb[0].setText("0");jb[1].setText("1");jb[2].setText("arr.length");  
                        jb[3].setText("arr.length-1");  
        }    
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[3].isSelected());  
        if(current==1)  
            return(jb[0].isSelected());  
        if(current==2)  
            return(jb[3].isSelected());  
        if(current==3)  
            return(jb[3].isSelected());  
        if(current==4)  
            return(jb[1].isSelected());  
        if(current==5)  
            return(jb[2].isSelected());  
        if(current==6)  
            return(jb[0].isSelected());  
        if(current==7)  
            return(jb[2].isSelected());  
        if(current==8)  
            return(jb[3].isSelected());  
        if(current==9)  
            return(jb[3].isSelected());  
        return false;  
    }  
    public static void main(String[] args)  
    {  
        Login log = new Login();
    }  
}