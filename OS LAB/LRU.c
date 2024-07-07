#include <stdio.h>
#include <stdlib.h>
# define max 100
#define min 10
int ref[max],count,frame[min],n;
void input()
{
	int i,temp;
	count=0;
	printf("\n\n\tEnter the no of  page frames: ");
	scanf("%d",&n);
	printf("\n\n\tEnter the reference string ( -1 for end): ");
	scanf("%d",&temp);
	while(temp !=-1)
	{
		ref[count++]=temp;
		scanf("%d",&temp);
	}
}

void LRU()
{
	int i,j,k,stack[min],top=0,fault=0;
	system("CLS");
	for(i=0;i<count;i++)
	{
		if(top<n)
		{
			stack[top++]=ref[i],fault++;
		}
		else
		{
			for(j=0;j<n;j++)
			{
				if(stack[j]==ref[i])
				{
				break;
				}
			}
			if(j<n)
			{
				for(k=j;k<n-1;k++)
				{
					stack[k]=stack[k+1];
				}
				stack[k]=ref[i];
			}
			else
			{
				for(k=0;k<n-1;k++)
				{
					stack[k]=stack[k+1];
				}
				stack[k]=ref[i];
				fault++;
			}
		}
		printf("\n\nAfter inserting %d the stack status is:",ref[i]);
		for(j=0;j<top;j++)
		{
			printf("%d",stack[j]);
		}
	}
	printf("\n\nEnd to inserting the reference string.");
	printf("\n\nTotal page fault is %d",fault);
	printf("\n\nPress any key to continue.");
}

void main()
{
	int x;
	//freoper("in.cpp","r",stdin);
	while(1)
	{
		printf("\n\n\t------MENU-----");
		printf("\n\t1.Input");
		printf("\n\t2.LRU Algorithm");
		printf("\n\t3.Exit");
		printf("\n\n\tEnter your choice.");
		scanf("%d",&x);
		switch(x)
		{
			case 1 : input();
			 	 break;
			case 2 : LRU();
				 break;
			case 3 : exit(0);	 	 
		}
	}
}
