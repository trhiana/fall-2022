//
// Created by trhiana on 21/10/22.
//

#include <iostream>
using namespace std;

int main( )
{
    int cases_per_day, bottles_per_day;
    int bottles_per_case = 12;
    double profit_per_bottle = 0.22;  // 22 cents per bottle profit
    double profit_per_day, profit_per_year;

    cout << "Press enter after entering each number \n";
    cout << "Enter number of cases: \n";
    cin >> cases_per_day;

    bottles_per_day = cases_per_day * bottles_per_case;
    profit_per_day = bottles_per_day * profit_per_bottle;
    profit_per_year = 365 * profit_per_day;

    cout << "The store has sold: " << bottles_per_day << " and made : ";
    cout << profit_per_day;
    cout << " per day. \n";
    cout << "That means the bottles sold are: " << bottles_per_day * 365 << ", making: " << profit_per_year <<
    " profit per year\n";
    cout << "In 10 years, the bottles sold are: " << (bottles_per_day * 365) * 10 << ", making a profit of " <<
    profit_per_year*10 << endl;

    cout << "Good business?! \n";
    return 0;
}
