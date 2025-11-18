#include<iostream>
using namespace std;


class student {
   public:
   void avg(int  maths,int  english,int science){
    int average = (maths+ english + science )/3;
    cout<< average <<endl; 
   }
   void display(string name, int  maths, int english, int science){
    cout << "Name:"<< name<<endl;
    cout << "marks of maths:"<< maths <<endl;
    cout << "marks of english :"<< english <<endl;
    cout << "marks of science :"<< science<<endl;
   }


};
int main()
{
    string name;
    int maths;
    int english;
    int science;


    cout <<"Enter name:"<< endl;
    cin >> name;
    cout <<"Enter maths marks"<< endl;
    cin>> maths;
    cout << "Enter marks of english"<< endl;
    cin>>english;
    cout <<"Enter marks of science"<< endl;
    cin>> science;

    student obj;
    obj.avg(maths, english, science);
    obj.display(name, maths, english, science);
}