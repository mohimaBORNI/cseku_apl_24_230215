#include<stdio.h>
int main()
{
    int arr[3][3];
    int i,j;
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    int max=arr[0][0];
     for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
           if(max<arr[i][j])
           {
               max=arr[i][j];
           }
        }
    }printf("%d",max);
}
