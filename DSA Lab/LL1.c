#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node* next;
};
int main(){
    struct node*head;
    struct node*One=0;
    struct node*two=0;
    struct node*three=0;

    One=malloc(sizeof(struct node));
    two=malloc(sizeof(struct node));
    three=malloc(sizeof(struct node));

    One->data= 5;
    two->data= 8;
    three->data= 9;

    One->next=two;
    two->next=three;
    three->next=0;
    head=One;


// printf(data->One);
struct node* temp=head;
while(temp != NULL){
    printf("%d -> ",temp->data);
    temp=temp->next;
}
printf("NULL \n");
return 0;
}

//queue from home
//stack
//space matrix
//***********linked list************