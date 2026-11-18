#include<stdio.h>
#include<stdlib.h>
struct node{
    int coff;
    int power;
    struct node* next;
};
int main()
{
struct node*temp = malloc(sizeof(struct node));
struct node*ptr2 = malloc(sizeof(struct node));
struct node*ptr3 = malloc(sizeof(struct node));
temp->coff=67;
temp->power=2;
temp->next=ptr2;
ptr2->coff=6;
ptr2->power=1;
ptr2->next=ptr3;
ptr3->coff=98;
ptr3->power=0;
ptr3->next=NULL;

struct node* tempr=temp;
while(tempr != NULL){
    printf("%d(X)^%d ",tempr->coff,tempr->power);
    if (tempr->next != NULL){
        printf(" + ");
    }
   
    tempr=tempr->next;
}
return 0;
}