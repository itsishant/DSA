# include <stdio.h>
# include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* head = NULL;

void insertAtStart(int value) {
    struct Node* temap = (struct Node*)malloc(sizeof(struct Node));
    temp->data = value;

     if ( head == NULL ){
        temp->next = temp;
        head = temp;
        return;
     }

          struct Node* p = head;

    while (p->next != head) {
        p = p->next;
    }
    temp->next = head;
    p->next = temp;
    head = temp;

}

void insertAtEnd(int value) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = value;

    if (head == NULL) {
        temp->next = temp;
        head = temp;
        return;
    }

    struct Node* p = head;
    while (p->next != head) {
        p = p->next;
    }

    p->next = temp;
    temp->next = head;

}

void deleteAtFirst() {
    if ( head == NULL ) {
        return;
    }

    if ( head->next == head) {
        free(head);
        head = NULL;
        return;
    }

    struct Node* p = head;
    while ( p->next != head ){
        p = p->next;
    }

    struct Node* temp = head;
    head = head->next;
    free(temp);
    p->next = head;
}

void deleteAtEnd() {
    if (head == NULL ){
        return;
    }

    
    if ( head->next == head) {
        free(head);
        head = NULL;
        return;
    }

    struct Node* p = head;
    while ( p->next->next != head) {
        p = p->next;
    }

    free(p->next);
    p->next = head;
}

void traverse() {
    struct Node* temp = head;
    while ( temp->next != head) {
        printf("%d ->", temp->data);
        temp = temp->next;
    }
    printf("%d last (back node for circular)", temp->data);
}