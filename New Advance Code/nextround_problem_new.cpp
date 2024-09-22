#include <iostream>
using namespace std;

int main() {
    int numElements, kthIndex; // Renamed for clarity
    cin >> numElements >> kthIndex;

    // Validate input for kthIndex
    if (kthIndex < 1 || kthIndex > numElements) {
        cout << "Invalid value for k." << endl;
        return 1; // Exit with error if k is out of bounds
    }

    int count = 0;
    int elements[100]; // Renamed for clarity

    // Read array elements
    for (int i = 0; i < numElements; i++) {
        cin >> elements[i];
    }

    // Determine the reference value from the kth index
    int referenceValue = elements[kthIndex - 1];

    // Count elements that are greater than or equal to the reference value and positive
    for (int i = 0; i < numElements; i++) {
        if (elements[i] >= referenceValue && elements[i] > 0) {
            count++;
        }
    }

    // Output the count
    cout << count << endl;

    return 0;
}
