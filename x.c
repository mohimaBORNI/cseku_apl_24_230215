#include<stdio.h>
int main()

{

int n;
scanf("%d",&n);
   for(int i=0;i<n;i++)
   {
    char x;
    scanf("%c", &x);
    char str[10]="codeforces";
    int i;
    int flag=0;
    for(i=0;i<10;i++)
    {
        if(x==str[i])
        {
            flag=1;
        }
    }
    if(flag==0)
    {
        printf("NO");
    }else
    {
        printf("YES");
    }
   }

}
