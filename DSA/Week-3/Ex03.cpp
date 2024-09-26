#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node *next, *prev;
};

Node* head;

void insert(int x) {
    if(head == NULL) {
        head = new Node();
        head->data = x;
        return;
    }
    Node* temp = head;
    while(temp->next != NULL) {
        temp = temp->next;
    }
    Node* newNode = new Node();
    newNode->data = x;
    temp->next = newNode;
    newNode->prev = temp;
}

int res = 0;

void Try(Node* cur) {
    if(cur == NULL) return;
    if(cur->prev != NULL && cur->next != NULL) {
        if(cur->data + cur->prev->data + cur->next->data == 0) ++res;
    }
    Try(cur->next);
}

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    for(int i = 1; i <= n; i++) {
        int x; cin >> x;
        insert(x);
    }
    Try(head);
    cout << res;
    return 0;
}
