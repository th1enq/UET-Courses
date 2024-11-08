#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node *left, *right;
    Node(int data) {
        this->data = data;
        left = right = NULL;
    }
};

class BinarySearchTree {
    Node *root;
public:
    BinarySearchTree() {
        root = NULL;
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
        }
        return root;
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
        return root;
    }

    bool searchRec(Node* root, int data) {
        if (root == NULL) return false;
        if (root->data == data) return true;
        if (data < root->data) return searchRec(root->left, data);
        return searchRec(root->right, data);
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    void remove(int data) {
        root = removeRec(root, data);
    }

    bool search(int data) {
        return searchRec(root, data);
    }

    int getMin() {
        Node* temp = root;
        while (temp->left != NULL) {
            temp = temp->left;
        }
        return temp->data;
    }

    int getMax() {
        Node* temp = root;
        while (temp->right != NULL) {
            temp = temp->right;
        }
        return temp->data;
    }
} BST;

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    return 0;
}
