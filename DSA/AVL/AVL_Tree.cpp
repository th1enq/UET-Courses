#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data, height;
    Node *left, *right;
    Node(int data) {
        this->data = data;
        height = 1;
        left = right = NULL;
    }
};

class AVLTree {
    Node *root;
public:
    AVLTree() {
        root = NULL;
    }

    int height(Node* node) {
        return node ? node->height : 0;
    }

    int getBalance(Node* node) {
        return node ? height(node->left) - height(node->right) : 0;
    }

    Node* rightRotate(Node* y) {
        Node* x = y->left;
        Node* T2 = x->right;
        x->right = y;
        y->left = T2;
        y->height = 1 + max(height(y->left), height(y->right));
        x->height = 1 + max(height(x->left), height(x->right));
        return x;
    }

    Node* leftRotate(Node* x) {
        Node* y = x->right;
        Node* T2 = y->left;
        y->left = x;
        x->right = T2;
        x->height = 1 + max(height(x->left), height(x->right));
        y->height = 1 + max(height(y->left), height(y->right));
        return y;
    }

    Node* balance(Node* root, int data) {
        root->height = 1 + max(height(root->left), height(root->right));
        int balance = getBalance(root);
        if (balance > 1 && data < root->left->data) {
            return rightRotate(root);
        }
        if (balance < -1 && data > root->right->data) {
            return leftRotate(root);
        }
        if (balance > 1 && data > root->left->data) {
            root->left = leftRotate(root->left);
            return rightRotate(root);
        }
        if (balance < -1 && data < root->right->data) {
            root->right = rightRotate(root->right);
            return leftRotate(root);
        }
        return root;
    }

    Node* insertRec(Node* root, int data) {
        if (root == NULL) {
            root = new Node(data);
            return root;
        }
        if (data < root->data) {
            root->left = insertRec(root->left, data);
        } else if (data > root->data) {
            root->right = insertRec(root->right, data);
        } else {
            return root;
        }
        return balance(root, data);
    }

    Node* removeRec(Node* root, int data) {
        if (root == NULL) return root;
        if (data < root->data) {
            root->left = removeRec(root->left, data);
        } else if (data > root->data) {
            root->right = removeRec(root->right, data);
        } else {
            if (root->left == NULL) {
                Node* temp = root->right;
                delete root;
                return temp;
            } else if (root->right == NULL) {
                Node* temp = root->left;
                delete root;
                return temp;
            }
            Node* temp = root->right;
            while (temp->left != NULL) {
                temp = temp->left;
            }
            root->data = temp->data;
            root->right = removeRec(root->right, temp->data);
        }
        if (root == NULL) return root;
        return balance(root, data);
    }

    void insert(int data) {
        root = insertRec(root, data);
    }
    void remove(int data) {
        root = removeRec(root, data);
    }
} AVL;

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    return 0;
}

/*
Stable sort :
    - Merge Sort
    - Bubble Sort
    - Insertion Sort
    - Radix Sort
    - Counting Sort
Unstable sort :
    - Quick Sort
    - Heap Sort
    - Selection Sort

    stack lifo
    queue fifo
*/
