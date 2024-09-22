#include <iostream>
#include <vector>
using namespace std;

int main() {
    int rows, columns;
    cin >> rows >> columns;

    // Using vector for dynamic array allocation
    vector<vector<char>> matrix(rows, vector<char>(columns));

    // Read the matrix
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            cin >> matrix[i][j];
        }
    }

    // Check for allowed characters
    bool isBlackAndWhite = true;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            if (matrix[i][j] != 'W' && matrix[i][j] != 'B' && matrix[i][j] != 'G') {
                isBlackAndWhite = false;
                break; // Exit inner loop
            }
        }
        if (!isBlackAndWhite) {
            break; // Exit outer loop if not black and white
        }
    }

    // Output result based on flag
    if (isBlackAndWhite) {
        cout << "#Black&White" << endl;
    } else {
        cout << "#Color" << endl;
    }

    return 0;
}
