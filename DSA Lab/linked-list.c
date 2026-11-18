#include<stdio.h>
#include<stdlib.h>

typedef struct Node
{
int data;
struct Node*next;
} Node ;

Node * createrNode(int data){
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data=data;
    newNode->next=NULL;
    return newNode;
}
void traverse(Node*head){
    Node*current = head;
    while (current != NULL)
    {
        printf("%d->",current->data);
        current=current->next;
    }
    printf("NULL");
}

int main(){
    Node*head = createrNode(5);
    head->next=createrNode(49);
    head->next->next=createrNode(9);
    printf("list:");
    traverse(head);
}

