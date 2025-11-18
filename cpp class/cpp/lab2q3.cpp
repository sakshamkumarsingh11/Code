#include<iostream>
using namespace std;

class BA{
    public:
    void depo(int deposit, int balance){
        balance += deposit;
        cout<< "New balance:"<< balance;
    }
    
};
int main()
{      
    string name ;
    int bank_number;
    int balance;
    int deposit;
    cout <<"enter the amount to be deposited "<< endl;
    cin>> deposit;
    cout <<"Enter your name, account number and ur balance. press enter after entering value "<<endl;
    cin >> name;
    cin>> bank_number;
    cin>> balance;
    BA obj;
    obj.depo(deposit, balance );
    

    return 0;
}