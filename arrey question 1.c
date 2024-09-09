#include<stdio.h>
void uni(int *arr,int n) ;
int main()
{
    int arr[100];
    int i;
    for(i=0;i<4;i++)
    {
        scanf("%d",&arr[i]);
    }
    uni(arr,4);
    return 0;
}
void uni(int *arr,int n)
{
    int i,j;
    int count=0;
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                count=1;
                break;
            }
        }
    }
    if(count==0)
    {
        printf("%d",arr[i]);
    }
}

