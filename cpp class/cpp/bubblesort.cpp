#include <iostream>
using namespace std;

int main (){
    int n;
    cout << "enter the size ";
    cin>> n;
    int arr[n];
    cout << "Enter elements: ";
    for (int i=0; i<n; i++){
        cin>> arr[i];
    }
    int size = sizeof(arr)/sizeof(arr[0]);
     for (int i = 0; i<size; i++){
        for (int j= 0 ; j< size; j++){
            if (arr[j]> arr[j+1]){
                swap(arr[j], arr[j+1]);
            }
        }
     }
        cout << "sorted array";
        for (int i=0; i<size; i++){
            cout << arr[i] << " ";
        }

    return 0;
}