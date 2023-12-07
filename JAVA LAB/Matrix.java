import java.io.*;
import java.util.Scanner;
class Calc
 {
	Scanner s=new Scanner(System.in);
	 int m, n, p, q, i, j, k,flag=0;
	int[][] a = new int[10][10];
	int[][] b = new int[10][10];
	int[][] d = new int[10][10];
	void ReadMatrix()
	{
		System.out.println("Enter no of rows in Matrix A ");
		m=s.nextInt();
		System.out.println("Enter no of columns in matrix A  ");
		n=s.nextInt();
		System.out.println("Enter elements in matrix A ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter no of rows in matrix B ");
		p=s.nextInt();
		System.out.println("Enter no of columns in matrix B ");
		q=s.nextInt();
		System.out.println("Enter elements in matrix B ");
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
	}
	int Calculation()
	{
	 if (n != p) 
	 {
        System.out.println("Matrix is incompatible for multiplication");
     }
     else   
	 {	flag=1;
	 	 for (i = 0; i < m; i++)
	 	  {
             for (j = 0; j < q; j++) 
              {
                d[i][j] = 0;
                 for (k = 0; k < p; k++) 
                 {
                    d[i][j] += a[i][k] * b[k][j];
                 }
              }
          }
	 }
	 return(flag);
   }
	void display()
	{		
		System.out.println("MATRIX A x MATRIX B =");
		 for (i=0;i<m;i++)
		 {
			 for(j=0;j<q;j++)
			 {
				 System.out.print(d[i][j]+"  ");
			 }
			 System.out.println();
		 }	    
	}
 }	


class Matrix
{
	public static void main (String [] args) 
  {
	  int z;
	  Calc a =new Calc();
	  a.ReadMatrix();
	  z=a.Calculation();
	  if (z==1)
	   { 
		   a.display();
	   }
  }
}
