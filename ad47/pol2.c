#include <stdio.h>
 struct Polynomial
 {
    int coeff;
    int exp;
 };

struct Polynomial first[15], second[15], result[15];
int main ()
{
  int i,n,j,m,flag;
  printf("Enter the no of terms in 1st polynomial");
  scanf("%d",&n);
 for(i=0;i<n;i++)
   {
     printf("Enter the coefficient of and power of %d term",i+1);
     scanf("%d%d",&first[i].coeff,&first[i].exp);
   }
  
  printf("Enter the no of terms in 2nd polynomial");
  scanf("%d",&m);
 
 for(i=0;i<m;i++)
   {
      printf("Enter the coefficient of and power of %d term",i+1);
      scanf("%d%d",&second[i].coeff,&second[i].exp);
   }

if(m>n)
  {
   
	for(i=0;i<m;i++)
 	  {
   		for(j=0;j<m;j++)
			{     flag=0;
				if (first[i].exp==second[j].exp)
					{
                                         result[i].exp=first[i].exp;
					   result[i].coeff=first[i].coeff+second[j].coeff;
					   flag=1;
					}
			}
			if(flag==0)
				{
				  result[i].exp=first[i].exp;
					   result[i].coeff=first[i].coeff;
				}	
	 }	
   		for(i=0;i<m;i++)
           		{
                     		printf("%dX^%d+",result[i].coeff,result[i].exp);
         		}
         
    }
 else
    {
	
	for(i=0;i<n;i++)
	 {
       	for(j=0;j<n;j++)
		{ flag=0;
			if (first[i].exp==second[j].exp)
				{
                                         result[i].exp=first[i].exp;
					   result[i].coeff=first[i].coeff+second[j].coeff;
					   flag=1;
				}
		}
		if(flag==0)
				{
				  result[i].exp=first[i].exp;
					   result[i].coeff=first[i].coeff;
				}	
	}	
        for(i=0;i<n;i++)
          	{
               printf("%dX^%d+",result[i].coeff,result[i].exp);
          	}
     }


return(0);
 }
