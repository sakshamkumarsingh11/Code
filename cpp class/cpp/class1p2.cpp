#include <iostream>
using namespace std;

int main (){
    float number1;
    float number2;
    char op; // Renamed from 'operator' to 'op'
    float result;

    cout << "Enter first number: ";
    cin >> number1;
    cout << "Enter second number: ";
    cin >> number2;
    cout << "Enter operator (+, -, *, /): ";
    cin >> op;
    
    switch (op) {
        case '+':
            result = number1 + number2;
            cout << result << endl; 
            break;
        case '-':
            result = number1 - number2;
            cout << result << endl;
            break;
        case '*':
            result = number1 * number2;
            cout << result << endl; 
            break;
        case '/':
            if (number2 != 0) {
                result = number1 / number2;
                cout << result << endl;
            } else {
                cout << "Invalid input" << endl;
            }
            break;
        default:
            cout << "wrong inputs" << endl;
            break;
    }

}