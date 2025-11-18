#include<iostream>
using namespace std;
class rectangle{
    int length, width;
public:
    void setDimensions(int l, int w) {
        length = l;
        width = w;
    }
    int area() {
        return length * width;
    }
    int perimeter() {
        return 2 * (length + width);
    }
};

int main()
{
    int length, width;
    cout << "Enter the length: ";
    cin >> length;
    cout << "Enter width: ";
    cin >> width;
    rectangle obj;
    obj.setDimensions(length, width);
    cout << obj.area() << endl;
    cout <<  obj.perimeter() << endl;
    return 0;
}