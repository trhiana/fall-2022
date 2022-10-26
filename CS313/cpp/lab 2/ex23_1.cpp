//
// Created by trhiana on 23/10/22.
//

#include <iostream>
using namespace std;

int main(void)
{
    int x;
    int count = 0;   // (1) initialize a counter to 0 to count number of grades
    double sum = 0; // initialize the sum to 0 to make sure the sum at the beginning is 0
    double average;

    // prompt the user:
    cout << "Enter 100 grades separated by a single space, then press <Enter>: ";
    while( count < 100) // (2) read six grades and compute their sum, count ensures 6 entries
    {
        // read each number and compute the sum:
        cin >> x;
        sum = sum + x;
        count++;  // (3) update the count
    }
    cout << endl;

    average = sum/100;  // compute the average, total divided by the number of grades
    cout << "The average is " << average << endl;

    return 0;
}