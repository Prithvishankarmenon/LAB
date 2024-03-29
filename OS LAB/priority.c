#include <stdio.h>
//#include <conio.h>
int p[30],bt[30],tot_tat=0,pr[30],wt[30],n,tot_wt=0,PR_wt=0,PR_tat=0,tat[30];
float awt,avg_tat,avg_wt;

void main()
{
	int i;
	printf("\n Enter the no of processes \n");
	scanf("%d",&n);
	printf("Enter burst time and priority for each process\n");
	for(i=0;i<n;i++)
	{
		printf("Enter burst time and priority of process[%d]:",i+1);
		scanf("%d%d",&bt[i],&pr[i]);
		p[i]=i;
	}
	sort();
	printf("\n Priority Algorithm \n");
	WT_TAT(&PR_tat,&PR_wt);
	printf("\n\nTotal Turn Around Time : %d",PR_tat);
	printf("\n Avarage Turn Around Time : %d",PR_tat/n);
	printf("\n Total Waiting Time : %d",PR_wt);
	printf("\nTotal avg. Waiting Time : %d\n",PR_wt/n);
}

int sort()
{
	int t,i,j,t2,t1;
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(pr[i]>pr[j])
			{
				swap(&bt[j],&bt[i]);
				swap(&p[j],&p[i]);
				swap(&pr[j],&pr[i]);
			}
		}
	}
	return(0);
}

int swap(int *a,int *b)
{
	int t;
	t=*a;
	*a=*b;
	*b=t;
	return(0);
}

int WT_TAT(int *a, int *b)
{
	int i;
	for(i=0;i<n;i++)
	{
		if(i==0)
		{
			tat[i]=bt[i];
			tot_tat=tot_tat+tat[i];
		}
		else
		{
			tat[i]=tat[i-1]+bt[i];
			tot_tat=tot_tat+tat[i];
		}
		
	}
	*a=tot_tat;
	wt[0]=0;
	for(i=1;i<n;i++)
	{
		wt[i]=wt[i-1]+bt[i-1];
		tot_wt=tot_wt+wt[i];
	}
	*b=tot_wt;
	printf("\nPROCESS\t\tBURST TIME\tPriority\tTURN AROUND TIME\tWAITING TIME");
	for(i=0;i<n;i++)
	printf("\nprocess[%d]\t\t%d\t\t%d\t\t%d\t\t%d",p[i]+1,bt[i],pr[i],tat[i],wt[i]);
	return(0);
	
}