#include<iostream>
#include <cmath>
using namespace std;

int main() {
    int i = 0, p = 1, a, b;

    while (i < 3) {
        cout << "Enter a and b as integers: ";
        cin >> a >> b;
        p = pow(a, b);
        cout << a << " to the power " << b << " is " << p << endl;
        i++;
    }
    return 0;
}