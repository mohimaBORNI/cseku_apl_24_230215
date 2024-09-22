#include <iostream>
#include <cstring>
#include <cctype>
using namespace std;

int main() {
    char firstString[100], secondString[100];
    cin >> firstString >> secondString;

    // Convert both strings to lowercase for case-insensitive comparison
    for (int i = 0; i < strlen(firstString); i++) {
        firstString[i] = tolower(firstString[i]);
    }
    
    for (int i = 0; i < strlen(secondString); i++) {
        secondString[i] = tolower(secondString[i]);
    }

    // Compare the strings
    int comparisonResult = strcmp(firstString, secondString);
    
    if (comparisonResult < 0) {
        cout << "-1" << endl; // firstString is less than secondString
    } else if (comparisonResult > 0) {
        cout << "1" << endl; // firstString is greater than secondString
    } else {
        cout << "0" << endl; // strings are equal
    }

    return 0;
}
