#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node* next;
};

Node* head;

void insert(int position, int data) {
    if(position == 0) {
        Node* temp = new Node();
        temp->data = data;
        temp->next = head;
        head = temp;
        return;
    }
    Node* temp = head;
    for(int i = 0; i < position - 1; i++) {
        temp = temp->next;
    }
    Node* newNode = new Node();
    newNode->data = data;
    newNode->next = temp->next;
    temp->next = newNode;
}

void Delete(int position) {
    Node* temp = head;
    if(position == 0) {
        head = temp->next;
        delete temp;
        return;
    }
    for(int i = 0; i < position - 1; i++) {
        temp = temp->next;
    }
    Node* toDelete = temp->next;
    temp->next = toDelete->next;
    delete toDelete;
}

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    int n; cin >> n;
    while(n--) {
        string s; cin >> s;
        if(s == "insert") {
            int position, data; cin >> position >> data;
            insert(position, data);
        } else {
            int position; cin >> position;
            Delete(position);
        }
    }

    Node* temp = head;
    while(temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next;
    }

    return 0;
}
