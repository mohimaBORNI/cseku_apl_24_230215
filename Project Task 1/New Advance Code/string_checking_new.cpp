#include <iostream>
using namespace std;

int main() {
    int testCases;
    cin >> testCases; // Number of test cases
    while (testCases--) {
        int stringLength;
        cin >> stringLength; // Length of the strings
        string firstString, secondString;
        cin >> firstString >> secondString; // Read the two strings

        bool isEqual = true; // Flag to track equality
        for (int i = 0; i < stringLength; i++) {
            // Check if characters are equal or if both are 'B' or 'G'
            if (!(firstString[i] == secondString[i] || 
                  (firstString[i] == 'B' || firstString[i] == 'G') && 
                  (secondString[i] == 'B' || secondString[i] == 'G'))) {
                isEqual = false; // Set flag to false if condition fails
                break; // Exit the loop early
            }
        }

        // Output result based on the flag
        cout << (isEqual ? "yes" : "no") << endl;
    }
    return 0;
}
