/**
 * Created by trhiana
 * In class exercise
 */

#include "iostream"
using namespace std;

// Declaring functions
double gross_pay(double grosspay, int work_hours);
double social_security(double grosspay);
double federal_income_tax(double grosspay);
double state_income_tax(double grosspay);
double insurance(double grosspay, int dependants);

// Constant variables
const int regular_hours = 40, insurance_rate = 35, union_rate = 10;
const double hourly_rate = 16.79;
const double overtime_rate = 1.5 * hourly_rate;
const double social_security_rate = 0.06, federal_income_tax_rate = 0.14, state_income_tax_rate = 0.05;

int main() {
    double grosspay, ssecurity, federal_tax, state_tax, insurance_, actualpay;
    int dependants, work_hours;

    cout << "Enter number of hours worked and dependants: ";
    cin >> work_hours >> dependants;

    grosspay = gross_pay(grosspay, work_hours);
    ssecurity = social_security(grosspay);
    federal_tax = federal_income_tax(grosspay);
    state_tax = state_income_tax(grosspay);
    insurance_ = insurance(grosspay, dependants);

    actualpay = grosspay - (ssecurity + federal_tax + state_tax + union_rate + insurance_);

    // printing the weekly summary
    cout << "Weekly payment summary: " << endl;
    cout << "GROSS PAY: $" << grosspay << endl;
    cout << "Social security: $" << ssecurity << endl;
    cout << "Federal income tax: $" << federal_tax << endl;
    cout << "State income tax: $" << state_tax << endl;
    cout << "ACTUAL PAY: $" << actualpay << endl;

    return 0;
}

/**
 * Calculating the gross pay
 * @param grosspay the salary of a worker before deductions
 * @param work_hours the total number of hours worked
 * @return
 */
double gross_pay(double grosspay , int work_hours) {
    double regular, overtime;

    if (work_hours > regular_hours) {
        regular = regular_hours * hourly_rate;
        overtime = overtime_rate * (work_hours - regular_hours);
    }

    grosspay = regular + overtime;
    return grosspay;
}

/**
 * Getting the insurance deduction given a number of dependants
 * @param grosspay the salary of a worker before deductions
 * @param dependants the number of dependants a worker has
 * @return
 */
double insurance(double grosspay, int dependants) {
    double insurance = 0;
    if (dependants >= 3) {
        insurance = grosspay - insurance_rate;
    }
    return insurance;
}

/**
 * Getting the social security deduction
 * @param grosspay the salary of a worker before deductions
 * @return
 */
double social_security(double grosspay) {
    return social_security_rate * grosspay;
}

/**
 * Getting the federal income tax deduction
 * @param grosspay the salary of a worker before deductions
 * @return
 */
double federal_income_tax(double grosspay) {
    return federal_income_tax_rate * grosspay;
}

/**
 * Getting the state income tax
 * @param grosspay the salary of a worker before deductions
 * @return
 */
double state_income_tax(double grosspay) {
    return state_income_tax_rate * grosspay;
}
