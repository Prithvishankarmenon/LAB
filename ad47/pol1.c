# include<stdio.h>
int main()
{
  int i,n,m,a[100],b[100],c[100];
  printf("Enter the degree of the 1st polynomial");
  scanf("%d",&n);
  for(i=0;i<=n;i++)
   {
     printf("Enter the coefficient of x^%d\n",i);
     scanf("%d",&a[i]);
   }
  
  printf("Enter the degree of the 2nd polynomial");
  scanf("%d",&m);
  for(i=0;i<=m;i++)
   {
     printf("Enter the coefficient of x^%d\n",i);
      scanf("%d",&b[i]);
   }
 
  printf("SUM is ");
  if(m>n)
    {
        for(i=n+1;i<=m;i++)
		{
		a[i]=0;
		}
	for(i=0;i<=m;i++)
 		{
		c[i]=a[i]+b[i];
 		}
        for(i=0;i<=m;i++)
          {
               printf("%dX^%d+",c[i],i);
          }
    }
  else
    {
	for(i=m+1;i<=n;i++)
	{
	b[i]=0;
	}
	for(i=0;i<=n;i++)
	{
	c[i]=a[i]+b[i];
 	}
        for(i=0;i<=n;i++)
          {
               printf("%dX^%d+",c[i],i);
          }
    }

return (0);
}
