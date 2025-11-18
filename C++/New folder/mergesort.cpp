#include <iostream>
using namespace std;
void mergesort(int & arr, int left, int right){
    int  mid = left + (right-left)/2;
    mergesort( arr, 0, mid);
    mergesort(arr, mid+1, right);
    merge(arr, left, mid, right);
}
void merge (int& arr[], int left , int mid, int right){
    int n1 = left-mid +1;
    int n2 = right - mid;
    int L[n1], R[n2];
    for (int i = 0 ; i< n1; i++){
        L[i] = arr[left+1];
    }
    for (int j = 0 ; j< n2; j++){
        R[j] = arr[mid +1+j];

    }

    int i =  0 , j = 0 , k = left;
    while(i< n1 && j< n2){
        if (L[i]>R[i]){
            arr[k] L[i];
            i++;
        }
        else{
            arr[k] = R[j];
            j++;
        }
        k++;
    }
    while(i<n1){
        arr[k] = L[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k] = R[j];
        j++;
        k++;
    }

}



int main (){
    int arr[4,3,56,3,2,5,7];
    // merge sort it 
    mergesort(arr,0, arr.size()-1);
}
// merge sort in linked list 


struct * Node {
    int data;
    struct * next;
    Node(int val){
        data = val;
        next = NULL;
    }
};
Node * mergesort(Node* head){
    if (head == NULL || head->next == NULL){
        return head;
    }
    Node * mid = getMid(head);
    Node * left = mergesort(head);
    Node * right = mergesort(mid);
    return merge(left, right);

}
Node * getMid(Node * head){
    Node * slow = head;
    Node * fast = head->next;
    while(fast != NULL && fast->next != NULL){
        slow = slow->next;
        fast = fast->next->next;
    }
    Node * mid = slow->next;
    slow->next = NULL;
    return mid;
}


// insertion  sort in array 
void insertioncode (int  arr[], int n){
    for (int i = 1; i< n; i++){
        arr[i]= key;
        int j = i-1;
        while (j>=0 && arr[j] > key ){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}
// selection sort 
void selectionsort(int arr[], int n ){
    for (int i = 0 ; i< n-1; i++){
        int minindex = i;
        for (int j = i+1; j<n; j++){
            if (arr[j]< arr[minindex]){
                minindex = j;
            }
        }
        swap(arr[minindex], arr[i]);
    }
}