/**
* findCycle.cc
* 
* This file will define a linked list
* and determine if there exist a cycle
* list.
*/
#include <stdlib.h>
#include <stdio.h>

/**
* Simple Node struct
*/
typedef struct Node {
   struct Node *next;
   int data;
}  NodeType;

void insert(NodeType** head, int data){

   if(*head == NULL){

      *head = (NodeType *)malloc(sizeof(NodeType));
      (*head)->data = data;
      (*head)->next = NULL;
      return;
   }

   while(*head != NULL){ 
      *head = (*head)->next;
   }

      *head = (NodeType *)malloc(sizeof(NodeType));
      (*head)->data = data;
      (*head)->next = NULL;
      return;
}

void printList(NodeType* head){
   if(head == NULL) return;
   while(head->next != NULL){
      printf("Number %d\n", head->data);
   }
}

int main(){
   NodeType* head = NULL;
   
   for(int i = 0; i < 10; i++){
      insert(&head,i);
   }

   printList(head);

   return 0;
}
