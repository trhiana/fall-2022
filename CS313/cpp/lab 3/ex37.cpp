////
//// Created by trhiana on 30/10/22.
////
//
//// P33_2.cpp This program illustrates the local and global variables and call-by-value.
//// This program computes the side area and the cross section area of a cylinder
//#include<iostream>
//#include<cmath>
//using namespace std;
//
//const double PI = 3.14159;  // This variable is defined globally, known to all functions in this program as PI
//const double conversion = 0.3937;
//
//double cross_area(double r);  // Function prototype for function cross_area
//double side_area(double r, double h);  // Function prototype for function Side_area
//double total_area(double crossArea, double sideArea); // Function prototype for function total_area
//
//int main(void)
//{
//    double h, r, crossArea, sideArea;  //variables local to the main function
//
//    cout << "Enter the radius and the height of the cylinder in Cm <Enter> ";
//    cin >> r >> h;
//    cout << endl;
//    cout << "Before I do any computation or call any function, I want to let you know that \n";
//    cout << "you have entered r = " << r << " and h = " << h << "." << endl;
//    cout << "I am planning to use inch, thus in the first function, I will convert r, and " << endl;
//    cout << "in the second one I will convert h \n";
//
//    crossArea = cross_area(r);
//    sideArea = side_area(r,h);
//    cout << "The cross section area of the cylinder is " << crossArea << "  inch-sqr" << endl;
//    cout << "The side area of the cylinder is " << sideArea << " inch-sqr" << endl;
//    cout << "The total surface area of the cylinder is " << total_area(crossArea, sideArea) << " inch-sqr" << endl;
//
//    return 0;
//}
//
//double cross_area(double r)
//{
//    //Cross-section area includes the disks at the bottom and the top
//    r = r * conversion;  // converting r to inch
//    return 2*PI*pow(r,2);
//}
//
//double side_area(double r, double h)
//{
//    double area; //variable local to Side_area function
//    h = h * conversion;  // converting h to inch
//    r = r * conversion; // converting r to inch
//    area = 2*PI*r*h;
//    return area;
//}
//
//double total_area(double crossArea, double sideArea) {
//    double total_surface_area;
//    total_surface_area = crossArea + sideArea;
//    return total_surface_area;
//}