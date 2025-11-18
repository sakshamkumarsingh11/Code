#include<iostream>
using namespace std;

struct Node {
    int data;
    Node*next;
};

void Intersect(Node* head1, Node* head2){
    if (head1 == NULL || head2 == NULL){
        return;
    }
    Node* temp1= head1;
    while (head1->next != NULL){
        head1= head1->next;

    }
    head1->next = head2;
    
}

int main()
{
    
    return 0;
}