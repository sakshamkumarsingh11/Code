#include <iostream>
using namespace std;

int main (){
    string name;
    string university;
    int marks1;
    int marks2;
    cout << "Enter the university name: "<< endl;
    cin >> university;
    cout << "Enter the student name: "<< endl;
    cin >> name;
    cout << "Enter the marks of the first subject: "<< endl;
    cin >> marks1;
    cout << "Enter the marks of the second subject: "<< endl;
    cin >> marks2;

    cout << "University: " << university << endl;
    cout << "Student Name: " << name << endl;
    cout<< "Total marks: " << marks1 + marks2 << endl;

}