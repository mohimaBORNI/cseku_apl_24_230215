#include <iostream>
#include <cstring>

using namespace std;

int main() {
    char str[100];
    cin >> str;
    int x = strlen(str);

    for (int i = 0; i < x; i++) {
        if (str[i] == '?') {
            if (i > 0 && i < x - 1) {
                if ((str[i - 1] == 'b' || str[i - 1] == 'c') && (str[i + 1] == 'b' || str[i + 1] == 'c')) {
                    str[i] = 'a';
                } else if ((str[i - 1] == 'a' || str[i - 1] == 'c') && (str[i + 1] == 'a' || str[i + 1] == 'c')) {
                    str[i] = 'b';
                } else {
                    str[i] = 'c';
                }
            } else if (i > 0) {
                str[i] = (str[i - 1] == 'b' || str[i - 1] == 'c') ? 'a' : 'c';
            } else if (i < x - 1) {
                str[i] = (str[i + 1] == 'b' || str[i + 1] == 'c') ? 'a' : 'c';
            } else {
                str[i] = 'c';
            }
        }
    }

    for (int i = 0; i < x; i++) {
        cout << str[i];
    }
    cout << endl;

    return 0;
}
