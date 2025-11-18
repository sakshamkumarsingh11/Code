// the main aim is  to apply insert, del and traverse through linkedlist 
#include <iostream>
using namespace std;

struct Node{
    int data;
    Node* next;
    Node(int val){
        data = val;
        next = NULL;
    }
};
// insert at beg end and desired pos
Node * insertatbeg(Node* head){
    Node* newnode= new Node(10);
    newnode->next = head;
    return newnode;
}
Node* insertatend(Node* head){
    Node* newnode = new Node(20);
    if (head== NULL){
        head = newnode;
        return head;
    }
    Node * temp = head;
    while(temp->next != NULL){
        temp = temp->next;

    }
    temp->next= newnode;
    return head;
}

Node * insertatpos(Node* head, int pos, int val){
    Node * newnode = new Node(10);
    if (pos==0){
        newnode -> next = head;
        return newnode;
    }// insert at head
    Node* temp = head;
    for (int i = 0; i <pos-1; i++){
        temp = temp->next;
    } 
    newnode->next = temp->next;
    temp->next = newnode;
    return head;

}

Node* insertafteraval(Node*head, int val){
    Node * newnode = new Node(15);
    Node* temp = head;
    while(temp->data != val){
        temp = temp->next;
    }
    newnode ->next = temp->next;
    temp-> next = newnode;
    return head;

}

// deletion 
Node* deleteatbeg(Node* head){
    if(head== NULL){
        return NULL;
    }
    Node* temp= head;
    head = head->next;
    delete temp;
    return head;
}
Node * deleteatend(Node * head){
    if (head == NULL|| head->next == NULL){
        return NULL;

    }
    Node* temp = head;
    while(temp->next->next !=NULL){
        temp = temp->next;
    }
    delete temp->next;
    return head;

    
}
Node * deleteatpos(Node* head, int pos){
    if (head==NULL){
        return NULL;

    }
    if (pos==0){
        Node* temp = head;
        head = head->next;
        delete temp;
        return head;// delete at beg wali chiz
    }
    Node * temp = head;
    for(int i = 0 ; i < pos-1; i++){
        temp = temp->next;

    }
    Node* todel = temp->next;
    temp->next = temp->next->next;
    delete todel;
    return head;
}

// delete after a value 

Node* deltatpos(Node*head, int val){
    if (head == NULL){
        return NULL;
    }
    Node* temp = head;
    while(temp->next->data!= val){
        temp = temp->next;

    }
    Node* todel = temp->next;
    temp->next = temp->next->next;
    delete todel;
}
//---------------------------------------------------------------------------------
// doubly 

struct DNode{
    int data;
    DNode* next;
    DNode* prev;
    DNode(int val){
        data = val;
        next = NULL;
        prev = NULL;
    }
};
DNode * insertatbeg (DNode* head){
    DNode* newnode = new DNode(10);
    newnode->next = head;
    if (head != NULL){
        head->prev = newnode;
    }
    return newnode;
}
DNode* insertatend(DNode* head){
    DNode* newnode = new DNode(20);
    if (head== NULL){
        head = newnode;
        return head;
    }
    DNode * temp = head;
    while(temp->next != NULL){
        temp = temp->next;

    }
    temp->next= newnode;
    newnode->prev = temp;
    return head;
}
DNode * insertatpos(DNode* head, int pos, int val){
    DNode * newnode = new DNode(10);
    if (pos==0){
        newnode -> next = head;
        if (head != NULL){
            head->prev = newnode;
        }
        return newnode;
    }// insert at head

    DNode* temp = head;
    for (int i = 0; i <pos-1; i++){
        temp = temp->next;
    } 
    newnode->next = temp->next;
    if (temp->next != NULL){
        temp->next->prev = newnode;
    }
    temp->next = newnode;
    newnode->prev = temp;
    return head;

}
DNode* insertafteraval(DNode*head, int val){
    DNode * newnode = new DNode(15);
    DNode* temp = head;
    while(temp->data != val){
        temp = temp->next;
    }
    newnode ->next = temp->next;
    if (temp->next != NULL){
        temp->next->prev = newnode;
    }
    temp-> next = newnode;
    newnode->prev = temp;
    return head;

}

DNode* deleteatbeg(DNode* head){
    if(head== NULL){
        return NULL;
    }
    DNode* temp= head;
    head = head->next;
    if (head != NULL){
        head->prev = NULL;
    }
    delete temp;
    return head;
}
DNode * deleteatend(DNode * head){
    if (head == NULL|| head->next == NULL){
        return NULL;

    }
    DNode* temp = head;
    while(temp->next->next !=NULL){
        temp = temp->next;
    }
    delete temp->next;
    temp->next = NULL;
    return head;

    
}

DNode * deleteatpos(DNode* head, int pos){
    if (head==NULL){
        return NULL;

    }
    if (pos==0){
        DNode* temp = head;
        head = head->next;
        if (head != NULL){
            head->prev = NULL;
        }
        delete temp;
        return head;// delete at beg wali chiz
    }
    DNode * temp = head;
    for(int i = 0 ; i < pos-1; i++){
        temp = temp->next;

    }
    DNode* todel = temp->next;
    temp->next = temp->next->next;
    if (temp->next != NULL){
        temp->next->prev = temp;
    }
    delete todel;
    return head;
}
