#include<stdio.h>
struct node
{
    int data;
    struct node* next;
};

int main(){
    struct node* head , *newnode;
head = 0;
newnode=(struct node*)(sizeof(struct node));
   printf("Enter data: ");
   scanf("%d",&newnode->data);
   newnode->next=0;
    return 0;
}