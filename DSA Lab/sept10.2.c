#include<stdio.h>
#include<stdlib.h>
struct node{
    int coff;
    // int pow;
    struct node*next;
};
struct node* creatnode(int a ){
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    newNode->coff=a;
    // newNode->pow=b;
    newNode->next=0;
}
void insetEnd(struct node** head, int a ){
    struct node* newNode = creatnode(a );
if(*head == NULL){
    *head=newNode;
    return;
    struct node*temp = *head;
    while (temp->next != NULL){
temp=temp->next;
    }
    temp->next=newNode;
}
}

void printLL(struct node*head){
    struct node*temp= head;
    while (temp != NULL){
        printf("%d->",temp->coff);
        temp=temp->next;
    }
}
int main()
{printf("\n");
    struct node*head=NULL;
  insetEnd(&head,5);
  insetEnd(&head,7);
  insetEnd(&head,9);
  printLL(head);
return 0;
}