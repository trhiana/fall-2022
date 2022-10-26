//
// Created by trhiana on 21/10/22.
//

#include <iostream>
using namespace std;

int main() {
    string lastName;
    double balance;
    cout << "Enter students last name: ";
    cin >> lastName;
    cout << "Enter students balance: ";
    cin >> balance;

    if (balance == 0) {
        switch (lastName[0]) {
            case 'A' ... 'E':
                cout << "Got to Hall 3.\n";
                break;
            case 'F' ... 'J':
                cout << "Got to Hall 2.\n";
                break;
            case 'K' ... 'O':
                cout << "Got to Hall 8.\n";
                break;
            case 'P' ... 'R':
                cout << "Got to Hall 10.\n";
                break;
            case 'S' ... 'Z':
                cout << "Got to Hall 12.\n";
                break;
        }
    } else {
        cout << "Got to Hall 18.\n";
    }

    return 0;
}

