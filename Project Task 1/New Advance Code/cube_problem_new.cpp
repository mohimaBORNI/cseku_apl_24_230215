#include <iostream>
#include <cstring> // for strlen
using namespace std;

int main() {
    char inputString[100];
    
    // Read input string
    cin >> inputString;
    int stringLength = strlen(inputString); // Length of the string

    // Process the string to replace '?' with appropriate characters
    for (int i = 0; i < stringLength; i++) {
        if (inputString[i] == '?') {
            // Replace '?' based on adjacent characters
            if ((i > 0 && (inputString[i - 1] == 'b' || inputString[i - 1] == 'c')) &&
                (i < stringLength - 1 && (inputString[i + 1] == 'b' || inputString[i + 1] == 'c'))) {
                inputString[i] = 'a';
            } else if ((i > 0 && (inputString[i - 1] == 'a' || inputString[i - 1] == 'c')) &&
                       (i < stringLength - 1 && (inputString[i + 1] == 'a' || inputString[i + 1] == 'c'))) {
                inputString[i] = 'b';
            } else {
                inputString[i] = 'c';
            }
        }
    }

    // Output the modified string
    cout << inputString << endl;

    return 0;
}
