#include<stdio.h>
#include<stdlib.h>
int main()
{
	int RQ[100],i,n,THM=0,initial;
	printf("Enter the no of Request\n");
	scanf("%d",&n);
	printf("Enter the resource sequence");
	for(i=0;i<n;i++)
	{
		scanf("%d",&RQ[i]);
	}
	printf("Enter the initial head position\n");
	scanf("%d",&initial);
	
	for(i=0;i<n;i++)
	{
		THM=THM+abs(RQ[i]-initial);
		initial=RQ[i];
	}
	printf("Total Head Movement %d",THM);
	return (0);
}
