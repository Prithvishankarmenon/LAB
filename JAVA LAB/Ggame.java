import java.security.SecureRandom;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class Ggame extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3;
		JButton b1;
	Ggame()
	{
		
		tf1=new JTextField();
		tf1.setBounds(50,50,150,20);
		tf2=new JTextField();
		tf2.setBounds(50,100,300,20);
		tf3=new JTextField();
		tf3.setBounds(50,150,300,20);
		tf3.setEditable(false);
		b1=new JButton("ok");
		b1.setBounds(50,200,50,20);
		b1.addActionListener(this);
		add(tf1);add(tf2);add(b1);add(tf3);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
	}	
	
	public void actionPerformed(ActionEvent e)
	{
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		int a =  Integer.parseInt(s1);
		int b =  Integer.parseInt(s2);
		String d="";
		int limit,i=0,j=1,guess;
        SecureRandom rand = new SecureRandom();
		limit = a	;
        int upperbound = limit;
        int random1 = rand.nextInt(upperbound);
       
			if(e.getActionCommand()=="ok")
			{
			 //System.out.println("ENTER GUESS NO "+j);
			 guess = b;
			   if (random1 == guess)
			   {
			     d="CORRECT GUESS";
			    
			   }
			   else if (random1 < guess)
			   { 
			       d="ENTER A LOWER NUMBER";
			   }
			   else 
			   {
				   d="ENTER A HIGHER NUMBER";
			   }
		
	}
		tf3.setText(d);
    }
    public static void main(String ar[])
	{
		Ggame aa = new Ggame();
	}	
}

