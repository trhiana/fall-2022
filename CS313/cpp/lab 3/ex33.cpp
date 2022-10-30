#include<iostream>
#include <cmath>
using namespace std;

int main() {
    double x1, x2, a, b, c;
    cout << "Enter a, b, and c. Press <Enter> after each value: ";
    cin >> a >> b >> c;

    x1 = (-b + sqrt(fabs(pow(b, 2) - 4 * a * c))) / (2 * a);
    x2 = (-b - sqrt(fabs(pow(b, 2) - 4 * a * c))) / (2 * a);

    cout << "x1 : " << x1 << endl;
    cout << "x2 : " << x2 << endl;
}