# include <stdio.h>
struct process
{
 int ps;
 int flag;
}p[50];
struct sizes
{
int size;
int alloc;
}s[5];

int main()
{
int i=0,np=0,n=0,j=0;
printf("\nFirst Fit\n");
printf("Enter the no of blocks:\t");
scanf("%d",&n);
printf("\t\t\nEnter the size for %d blocks\n",n);
for(i=0;i<n;i++)
{
	printf("Enter the size for %d block\t",i);
	scanf("%d",&s[i].size);
}
printf("\n\t\tEnter the no of process\t",i);
scanf("%d",&np);
printf("Enter the size of %d processors!\t",np);
printf("\n");
for(i=0;i<n;i++)
{
	printf("Enter the size of process%d\t",i);
	scanf("%d",&p[i].ps);
}
printf("\n\n\tAllocation of blocks using First Fit is as follows\n");
printf("\n\n\tProcess\tProcess size\tBlocks\n");
for(i=0;i<np;i++)
{
	for(j=0;j<n;j++)
	{
		if(p[i].flag!=1)
		{
			if(p[i].ps<=s[j].size)
			{
				if(!s[j].alloc)
				{
				p[i].flag=1;
				s[j].alloc=1;
				printf("\n\t\t%d\t\t\t%d\t%d\t",i,p[i].ps,s[j].size);
				}
			}
		}
	}
}
for(i=0;i<n;i++)
{
	if(p[i].flag!=1)
	printf("\nsorrry!!!!!!!process %d must wait as there is no sufficient memory\n",i);
}
}