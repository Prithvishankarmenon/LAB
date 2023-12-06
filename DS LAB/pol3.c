#include <stdio.h>
 struct Polynomial
 {
    int coeff1;
    int exp1;
    int coeff2;
    int exp2;
    int coeff3;
    int exp3;
 };

struct Polynomial first[15];
int main ()
{
  int i,n,j,m;
  printf("Enter the of the 1st polynomial");
  scanf("%d",&n);
 
 for(i=0;i<=n;i++)
   {
     printf("Enter the coefficient of and power of X%d",i);
     scanf("%d%d",&first[i].coeff1,&first[i].exp1);
   }
  printf("Enter the  of the 2nd polynomial");
  scanf("%d",&m);
 
 for(i=0;i<=m;i++)
   {
      printf("Enter the coefficient of and power of X%d",i);
     scanf("%d%d",&first[i].coeff2,&first[i].exp2);
   }
 if(m>n)
    {
      //  for(i=n+1;i<=m;i++)
//{
// first[i].coeff1=0;
//}
	for(i=0;i<=m;i++)
 	{
   		for(j=0;j<=m;j++)
			{
				if (first[i].exp1==first[j].exp2)
					{
                                        first[i].exp3=first[i].exp1;
					  first[i].coeff3=first[i].coeff1+first[j].coeff2;
					}
			}
   		for(i=0;i<=m;i++)
           		{
                     	printf("%dX^%d+",first[i].coeff3,first[i].exp3);
         		}
 	}
       
    }
 else
    {
//for(i=m+1;i<=n;i++)
//{
// first[i].coeff1=0;
// }
       for(i=0;i<=m;i++)
 	{
		for(j=0;j<=n;j++)
			{
			if (first[i].exp1==first[j].exp2)
				{
                                         first[i].exp3=first[i].exp1;
					  first[i].coeff3=first[i].coeff1+first[j].coeff2;
				}
			}
        }	
        for(i=0;i<=n;i++)
          {
               printf("%dX^%d+",first[i].coeff3,first[i].exp3);
          }
     }
return(0);
}
