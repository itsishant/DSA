# include <stdio.h>
# include <stdlib.h>
 
struct Node {
    int data;
    struct Node* next;
};

struct Node* head = NULL;

// insert at beginning
void insertBegin(int value) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));

    temp->data = value;
    temp->next = head;
    head = temp;

}

// delete from end
void deleteEnd() {
    if (head == NULL) {
        return;
    }

    struct Node* temp = head;

    while (temp->next->next != NULL) {
        head = head->next;
    }

    free(temp->next);
    temp->next = NULL;
}

// delete from beginning
void deleteBegin() {
    if ( head == NULL ){
        return;
    }

    struct Node* temp = head;
    head = head->next;
    free(temp);
}

// insert at last
void insertEnd ( int value ) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));

    temp->data = value;
    temp->next = NULL;

    if ( head == NULL ){
        head = temp;
        return;
    }

    struct Node* t = head;
    while (t->next != NULL) {
        t = t->next;
    }
    t->next = temp;
}

insertAtKth( int value, int k ){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = value;

    struct Node* p = head;

    if ( p->next == NULL ) {
        insertEnd(value);
        return;
    }

    if ( k == 1 ){
        insertBegin(value);
        return;
    }
    struct Node* p = head;;
    for( int i = 1; i<k-1 && p->next != NULL ; i++) {
        p = p->next;
    }
    temp->next = p->next;
    p->next = temp;
}

void traverse() {
    if (head == NULL){
        return;
    }

    struct Node* p = head;
    while ( p != NULL) { 
        print("%d ->", p->data);
        p = p->next;
    }
    printf("NULL\n");
}