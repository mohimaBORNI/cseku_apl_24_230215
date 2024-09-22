#include <iostream>
#include <vector>
using namespace std;
int main()
{
    int n, m;
    cin >> n >> m;
    char a[n][m];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
            cin >> a[i][j];
    }
    bool flag = true;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (a[i][j] != 'W' && a[i][j] != 'B' && a[i][j] != 'G')
            {
                flag = false;
                break;
            }
            if (flag == false)
                break;
        }
    }
    if (flag == true)
        cout << "#Black&White";
    else
        cout << "#Color";
    return 0;
}