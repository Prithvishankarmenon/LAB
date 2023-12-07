import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3;
	JButton b1,b2,b3,b4;
	Calculator()
	{
		tf1=new JTextField();
		tf1.setBounds(50,50,150,20);
		tf2=new JTextField();
		tf2.setBounds(50,100,150,20);
		tf3=new JTextField();
		tf3.setBounds(50,150,150,20);
		tf3.setEditable(false);
		b1=new JButton("+");
		b1.setBounds(50,200,50,20);
		b2=new JButton("-");
		b2.setBounds(100,200,50,20);
		b3=new JButton("*");
		b3.setBounds(150,200,50,20);
		b4=new JButton("/");
		b4.setBounds(200,200,50,20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		add(tf1);add(tf2);add(tf3);add(b1);add(b2);add(b3);add(b4);
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
		int c=0;
		if(e.getActionCommand()=="+")
			{
				c=a+b;
			}
		if(e.getActionCommand()=="-")
			{
				c=a-b;
			}
		if(e.getActionCommand()=="*")
			{
				c=a*b;
			}
		if(e.getActionCommand()=="/")
			{
				try
				{
					c=a/b;					
				}
				catch(ArithmeticException a1)
				{
				   d="DIVISION BY 0 IS NOT ALLOWED";
				}
				
			}
		String result = "" +c;
		tf3.setText(result+d);			
	}
	public static void main(String ar[])
	{
		Calculator aa = new Calculator();
	}	
}
