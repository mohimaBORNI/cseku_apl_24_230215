#include <iostream>
#include<cstring>
#include<cctype>
using namespace std;
int main()
{
    char str1[100],str2[100];
    cin>>str1>>str2;
    int result;
    for (int i = 0; i < strlen(str1); i++)
    {
        str1[i]=tolower(str1[i]);
        str2[i]=tolower(str2[i]);
        if (str1[i]<str2[i])
        {
            cout<<"-1"<<endl;
            exit(0);
        }
        
        else if (str1[i]>str2[i])
        {
            cout<<"1"<<endl;
            exit(0);
        }
        
        else result=0;
    }
    cout<<result<<endl;
return 0;
}