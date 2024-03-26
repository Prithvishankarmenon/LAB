#include <stdio.h>
int TRUE=0;
int FALSE=-1;
int tbt[30],bt[30],t_tat=0,wt[30],n=0,t_wt=0,qt=0,tat[30],tqt=0,time=0,lmore;
float awt,avg_tat,avg_wt;

void main()
{
	int i,j;
	printf("\n Enter the no of processes \n");
	scanf("%d",&n);
	printf("\n Enter Quantom time \n");
	scanf("%d",&qt);
	printf("Enter burst time  for each process\n");
	for(i=0;i<n;i++)
	{
		printf("Enter burst time of process[%d]:",i+1);
		scanf("%d",&bt[i]);
		tbt[i]=bt[i];
		wt[i]=tat[i]=0;
	}
	lmore =TRUE;
	while(lmore == TRUE)
	{
		lmore = FALSE;
		for(i=0;i<n;i++)
		{
			if(bt[i]!=0)
			wt[i]=wt[i]+(time - tat[i]);
			tqt =1;
			while(tqt <= qt && bt[i]!=0)
			{
				lmore=TRUE;
				bt[i]=bt[i]-1;
				tqt++;
				time++;
				tat[i]=time;
			}
		}
	}
	printf("\nPROCESS ID\tBURST TIME\tTURN AROUND TIME\tWAITING TIME");
	for(i=0;i<n;i++)
	{
	printf("\nprocess[%d]\t\t%d\t\t%d\t\t%d",i+1,tbt[i],tat[i],wt[i]);
	t_tat=t_tat+tat[i];
	t_wt=t_wt+wt[i];
	}
	printf("\n\nTotal Turn Around Time : %d",t_tat);
	printf("\n Avarage Turn Around Time : %d",t_tat/n);
	printf("\n Total Waiting Time : %d",t_wt);
	printf("\nTotal avg. Waiting Time : %d\n",t_wt/n);
	
}


