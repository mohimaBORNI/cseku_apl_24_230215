#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        string str, str1;
        cin >> str >> str1;
        int count=0;
        for (int i = 0; i < n; i++)
        {
            if (str[i] == str1[i] || (str[i] == 'B' || str[i] == 'G') && (str1[i] == 'B' || str1[i] == 'G'))
            {
                count++;
            }
        }
        if (count != n)
        {
            printf("no");
        }
        else
        {
            printf("yes");
        }
    }
    return 0;
}

