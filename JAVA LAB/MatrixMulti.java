import java.io.*;
import java.util.Scanner;
class Calc
 {
	Scanner s=new Scanner(System.in);
	int i,j,k,r,c;
	int[][] a = new int[10][10];
	int[][] b = new int[10][10];
	int[][] d = new int[10][10];
	void ReadMatrix()
	{
		System.out.println("Enter no of rows in Matrix A and Matrix b ");
		r=s.nextInt();
		System.out.println("Enter no of columns in matrix A and Matrix b ");
		c=s.nextInt();
		System.out.println("Enter elements in matrix A ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		//System.out.println("Enter no of rows in matrix B ");
		//p=s.nextInt();
		//System.out.println("Enter no of columns in matrix B ");
		//q=s.nextInt();
		System.out.println("Enter elements in matrix B ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
	}
	void calculation()
	{	
		for(i=0;i<r;i++)    
            {    
                for(j=0;j<c;j++)    
					{    
						d[i][j]=0;    
						for(k=0;k<c;k++)    
							{    
								d[i][j]+=a[i][k]*b[k][j];    
							}    
					}    
			}
	}
	void display()
	{		
		System.out.println("MATRIX A x MATRIX B =");
		 for (i=0;i<r;i++)
		 {
			 for(j=0;j<c;j++)
			 {
				 System.out.print(d[i][j]+"  ");
			 }
			 System.out.println();
		 }	    
	}
 }	


class MatrixMulti
{
	public static void main (String [] args) 
  {
	  Calc a =new Calc();
	  a.ReadMatrix();
	  a.calculation();
	  a.display();
	  
  }
}
