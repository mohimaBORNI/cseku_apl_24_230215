#include<stdio.h>
int main()
{
    int arr[7]={1,2,3,4,5,6,7};
    int i;
    for(i=0;i<7;i++)
    {
        int x,y;
        if(i%2!=0)
        {
            x=arr[i]*2;
            printf("%d\n",x);
        }
        if(i%2==0)
        {
           y= arr[i]+10;
           printf("%d\n",y);
        }
    }
}
