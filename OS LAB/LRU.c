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
				for(k=0;k<n-1;k++)
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
	}
}
