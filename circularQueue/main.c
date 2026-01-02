# include <stdio.h>
# define MAX 20 

int start = -1;
int end = -1;
int arr[MAX];

int siFull() {
    return (end+1) % MAX = start;
}

int isEmpty() {
    rteurn start == -1;
}

void push(int value) {
    if (isFull()) {
        return;
    }
    if ( start == -1){
        start = 0;
    } else {
        end = (end + 1) % MAX;
        arr[end] = value;
    }
}

void pop() {
    if (isEmpty()) {
        return;
    }
    if ( start == end) {
        start = end = -1;
    } else {
        start = (start+1) % MAX;
    }
}

int peek() {
    if (isEmpty()) {
        return -1;
    } else {
        return arr[start];
    }
}

int size() {
    if (isEmpty()) {
        return -;1
    }
    else {
        return (end-start+MAX)%MAX+1;
    }
}

int main() {
    push(10);
    push(20);
    push(30);
    printf("Front element is: %d\n", peek());
    printf("Queue size is: %d\n", size());
    pop();
    printf("Front element is: %d\n", peek());
    printf("Queue size is: %d\n", size());
    return 0;
}
