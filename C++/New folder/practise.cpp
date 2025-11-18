//stack using linkedlist 

#include <iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* next;
    Node(int val){
        data=val;
        next=NULL;
    }
};



class implement {
    public :
    bool isempty(Node* head){
        if ( head){
            return true;
        }
        return false;
    }
    Node* push (Node* head, int val){
        Node* newNode = new Node(val);
        if (!head){
            head = newNode;
            return head;
        }
        newNode->next = head;
        head= newNode;
        return head;
    }
    Node* pop (Node* head){
        if (!head) return NULL;
        Node* temp = head;
        head = head-> next;
        temp->next =NULL;
        delete temp;
        return head;
    }
    int top(Node* head){
        if (!head) return -1;
        return head->data;

    }
    void display (Node* head){
        Node* temp = head;
        while (temp!=NULL){
            cout << temp->data<<" ";
            temp = temp->next;

        }

    }

};

// implementing queue using linked list

class queuenode{
    public: 
    int data;
    Node* next;
    queuenode(int val){
        data=val;
        next=NULL;
    }
    bool isempty(Node*head){
        if (!head){
            return false;
        }
        return true;
    }
    Node* emqueue(Node* head, int val){
        Node* newnode = new Node(val);
         if (!head){
            head = newnode;
            return head;
         }
         Node * temp =head;
         while(temp->next!=NULL){
            temp = temp->next;

         }
         temp->next = newnode;
            return head;
    }
    Node* dequeue(Node* head){
        if (!head) return NULL;
        Node* temp = head;
        head = head-> next;
        temp->next = NULL;
        delete temp;
        // first in and first out isliye head ko uda diya as voh pehla value hai
        return head;
    }
    int front(Node* head){
        if (!head) return -1;
        return head->data;
    }
};


// circular queue using array

class queue{
    int *arr;
    int front;
    int rear;
    int size;
    public:
    queue(int s){
        arr = new int[s];
        size = s;
        front = -1;
        rear = -1;
    }
     bool isempty(){
        if (front ==-1 && rear == -1){
            return true;
        }
        return false; // mtlb agar dono hi 01 hai  mtlb queue ek dum khali hai
     }
     bool isfull(){
        if ((rear+1)%size == front ){
            return true;
        }
        return false;
     }
     void engueue(int val){
        if (isfull()){
            return;
        }
        else if (isempty()){
            return;
        }
        else{
            rear = (rear+1)% size;
            arr[rear] = val;// jaise qeueue 5 size ka hai 3 tak filled hai for 4th index (rear+1)%5= 3+1)%5 = 4 or 4th hi index par dalna bhi tha
            if (front == -1){
                front = rear; // mtlb agar pehla element add kar rahe hai to front and rear dono same honge
            
        }

        }
     }
     void dequeue(){
        if(isempty()){
            return;
        }
        else if (front == rear){ // mtlb queue me ek hi element hai to dono ko -1 kar do
            front = rear = -1;
        }
        else{
            front = (front+1)%size; // circular queue me front ko aage badhana hai

        }

     }
        int Front(){
            if (isempty()){
                return -1;
            }
            return arr[front];
        }
        int Rear(){
            if (isempty()){
                return -1;
            }
            return arr[rear];
        }
        void display(){
            if (isempty()){
                return;
            }
            int i = front;
            while (i!=rear){
                cout << arr[i]<<" ";
                i = (i+1)%size;
            }
            cout << arr[rear]<<endl; // kyuki loop me rear tak nahi jaa paenge
        }
};


// deque using linked list
struct node{
    int val;;
    node*next;
    node*prev;
    node(int data){
        val = data;
        next = NULL;
        prev = NULL;
    }
    void insertathead(node* head, int val){
        if (!head){
            head = new node(val);
            return;
        }
        node* newnode = new node(val);
        newnode->next = head;
        head->prev = newnode;
        head = newnode;
      
    }
     void insertattail(node* head, int val){
        if(!head){
            head = new node(val);
            return;
        }
        node* newnode = new node(val);
        node * temp = head;
        while (temp->next){
            temp = temp->next;

        }
        temp->next = newnode;
        newnode->prev = temp;
     }

     void deleteathead(node* head){
        if (!head) return;
        node* temp = head;
        head = head->next;
        head->prev = NULL;
        temp->next = NULL;
        delete temp;

     }
     void deletattail(node* head){
        if(!head) return;
        node* temp = head;
        while (temp->next->next){
            temp = temp->next;
        }
        temp ->next = NULL;

     }
     
     


};

