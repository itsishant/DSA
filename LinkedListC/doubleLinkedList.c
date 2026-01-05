# include <stdio.h>
# include <stdlib.h>

struct Node {
    int data;
    struct Node* next; 
    struct Node* prev;
};

struct Node* head = NULL;

// insert At Beginning
void insertAtBegin(int value) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));

    temp->data = value;
    temp->prev = NULL;
    temp->next = head;
    if (head != NULL) {
        head->prev = NULL;
    }
    head = temp;
}

// insert At End
void insertAtEnd(int value) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = value;
    temp->next = NULL;

    if ( head == NULL ) {
        temp->prev = NULL;
        head = temp;
        return;
    }

    struct Node* tp = head;
    while ( tp->next != NULL) {
        tp = tp->next;
    }
    tp->next = temp;
    temp->prev = tp;
}

// delete from start
void deleteStart() {
    if ( head == NULL ){
        return;
    }

    struct Node* tp = head;
    head = head->next;
    if (head!=NULL) {
        head->prev = NULL;
    }
    free(tp);
}

//delete from end 
void deleteEnd() {
    if (head == NULL) return;

    struct Node *tp = head;
    while (tp->next != NULL)
        tp = tp->next;

    if (tp->prev != NULL)
        tp->prev->next = NULL;
    else
        head = NULL;

    free(tp);
}

void traverse() {
    struct Node* tp = head;

    while ( tp!=NULL ) {
        printf("%d <->", tp->data);
        tp = tp->next;
    }
    printf("NULL\n")
}
