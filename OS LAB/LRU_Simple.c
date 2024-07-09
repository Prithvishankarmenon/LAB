#include <stdio.h>

void main()
{

    int i, j = 0, k, n, a[20], no, avail = 0, stack[10], top = 0, fault = 0, flag = 0;
    printf("ENTER THE NUMBER OF pages :");
    scanf("%d", &n);
    printf("Enter the page numbers :");
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);
    printf("Enter the frame size:");
    scanf("%d", &no);

    // MAIN
    printf("\n_________________________\n");
    printf("PAGES\tPAGE FRAME");
    printf("\n_________________________\n");

    for (i = 0; i < no; i++)
        stack[i] = -1;

    for (i = 0; i < n; i++)
    {
        flag = 0;
        if (top < no)
        {
            for (j = 0; j < no; j++)
                if (stack[j] == a[i])
                {
                    flag = 1;
                }
            if (flag == 0)
            {
                stack[top++] = a[i];
                fault++;
            }
        }
        else
        {
            for (j = 0; j < no; j++)
                if (stack[j] == a[i])
                    break;
            if (j < no)
            {
                for (k = j; k < no - 1; k++)
                    stack[k] = stack[k + 1];
                stack[k] = a[i];
            }
            else
            {
                for (k = 0; k < no - 1; k++)
                    stack[k] = stack[k + 1];
                stack[k] = a[i];
                fault++;
            }
        }
        printf(" %d ", a[i]);
        for (k = 0; k < top; k++)
            printf(" | %d ", stack[k]);
        printf("\n");
    }
    printf("\n\n PAGE FAULT : %d", fault);
}