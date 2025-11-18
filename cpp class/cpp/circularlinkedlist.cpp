#include<iostream>
using namespace std;

 struct Node {
    public:
    int data;
    Node* next;

 };

 void addbeg(Node* head, int data){
    Node * newNode = new Node();
    newNode->data = data;

    if (head == NULL){
        newNode -> next = newNode;
        head = newNode;
    }
    else{
        Node * temp = head;
        while (temp->next != head){
            temp = temp->next;
        }
        newNode -> next = head;
        temp -> next = newNode; // insert 
        head = newNode;
    }
 }

  void addend(Node * head, int data){
    Node * newNode = new Node();
    newNode->data = data;
    if (head == NULL){
        newNode -> next = newNode;
        head = newNode;
    }
    else{
        Node *temp = head;
        while (temp-> next != head){
            temp= temp->next;
        }
        temp->next = newNode; // end 
        newNode->next = head;

    }
  }

int main()
{
    return 0;
}