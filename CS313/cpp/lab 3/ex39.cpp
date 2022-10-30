//
// Created by trhiana on 30/10/22.
//

// This program computes the area and volume of a cylinder and sphere depending on the users choice.
#include<iostream>
#include<cmath>
using namespace std;

const double PI = 3.14159;  // This variable is defined globally, known to all functions in this program as PI
const double conversion = 0.3937; // This is the Cm to inch conversion factor

double side_area(double r, double h); // Function declaration for function that computes side area of a cylinder
double area(double r, double sideArea); // Function declaration for the function that computes  the total area of a cylinder
double volume(double r, double h); // Function declaration for the function that computes the volume of a cylinder
double area(double r); // Function declaration for the function that computes the surface area of a sphere
double volume(double r); // Function declaration for the function that computes the volume of a sphere

int main(void)
{
    double h, r, sideArea;  //variables local to the main function
    int choice; // users choice on the shape whose area and volume is to be computed

    cout << "Enter your choice. 1 = cylinder, 2 = sphere <Enter>: ";;
    cin >> choice;

    cout << "Enter the radius and the height in Cm <Enter> ";
    cin >> r >> h;
    cout << endl;
    cout << "Before I do any computation or call any function, I want to let you know that \n";
    cout << "you have entered r = " << r << " and h = " << h << "." << endl;
    cout << "I am planning to use inch, thus in the first function, I will convert r, and " << endl;
    cout << "in the second one I will convert h \n";

    sideArea = side_area(r, h);

    if (choice == 1) {
        cout << "The side area of the cylinder is " << sideArea << " inch-sqr. \n";
        cout <<  "The total area of the cylinder is " << area(r, sideArea) << " inch-sqr. \n";
        cout << "The volume of the cylinder is " << volume(r, h) << " inch-sqr. \n";
    } else if (choice == 2) {
        cout << "The surface area of the sphere is " << area(r) << " inch-sqr. \n";
        cout << "The volume of the sphere is " << volume(r) << " inch-sqr. \n";
    } else {
        cout << "Invalid choice error.";
    }

    return 0;
}

double side_area(double r, double h) {
    double area;
    r *= conversion; // converting r to inch
    h *= conversion; // converting h to inch
    area = (2 * PI * r) * h;
    return area;
}

double area(double r, double sideArea) {
    double area;
    r *= conversion; // converting r to inch
    area = 2 * (PI * pow(r, 2)) + sideArea;
    return area;
}

double volume(double r, double h) {
    double volume;
    r *= conversion; // converting r to inch
    h *= conversion; // converting h to inch
    volume = (PI * pow(r, 2)) * h;
    return volume;
}

double area(double r) {
    double area;
    r *= conversion; // converting r to inch
    area = 4 * PI * pow(r, 2);
    return area;
}

double volume (double r) {
    double volume;
    r *= conversion; // converting r to inch
    volume = (4.0/3.0) * PI * pow(r, 3);
    return volume;
}