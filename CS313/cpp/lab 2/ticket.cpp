//
// Created by trhiana on 23/10/22.
//

#include <iostream>
using namespace std;

int main( )
{
    double age, ticket = 12;

    cout << "Please enter the age \n";
    cin >> age;
    if(age <= 8 || age >= 65)
        ticket = 6;

    cout << "Your ticket costs " << ticket << endl;

    return 0;
}