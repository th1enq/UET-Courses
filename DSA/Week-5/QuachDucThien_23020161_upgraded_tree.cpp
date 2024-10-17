#include <bits/stdc++.h>
using namespace std;

class Node {
    int data; // Dữ liệu của Node
    Node* fatherNode; // Node cha
    vector<Node*> children; // Mảng các con
    unordered_set<int> childDataSet; // Tập hợp các giá trị con để kiểm tra nhanh trùng lặp
public:
    Node() {
        // Khởi tạo Node
        fatherNode = nullptr;
    }
    Node(int data) {
        // Khởi tạo Node với dữ liệu
        this->data = data;
        fatherNode = nullptr;
    }
    friend class Tree;
};

// Lớp Cây
class Tree {
    // Chứa một Node gốc
    Node* root;
public:
    Tree() {
        // Khởi tạo cây
        root = nullptr;
    }

    Node* getRoot() {
        return root;
    }

    // Hàm tìm Node theo giá trị
    Node* findNode(Node *node, int data) {
        if (node == nullptr) return nullptr;
        if (node->data == data) return node;

        for (Node* child : node->children) {
            Node* temp = findNode(child, data);
            if (temp != nullptr) return temp;
        }
        return nullptr;
    }

    // Hàm thêm một Node vào cây
    bool insert(int father, int data) {
        if (root == nullptr) {
            root = new Node(data);  // Nếu cây rỗng, Node này sẽ là gốc
            return true;
        }

        Node* parentNode = findNode(root, father);  // Tìm Node cha
        if (parentNode == nullptr || parentNode->childDataSet.count(data)) {
            return false;  // Node cha không tồn tại hoặc đã có con với giá trị này
        }

        // Thêm Node mới vào danh sách con
        Node* newNode = new Node(data);
        newNode->fatherNode = parentNode;
        parentNode->children.push_back(newNode);
        parentNode->childDataSet.insert(data);

        return true;
    }

    // Hàm trả về số lượng con của một Node
    int getNumOfChild(Node *node) {
        if (node == nullptr) return 0;
        int cnt = 0;

        for (Node* child : node->children) {
            cnt++;
            cnt += getNumOfChild(child);
        }
        return cnt;
    }

    // Hàm xoá một Node trên cây
    int remove(int data) {
        if (root == nullptr) return 0;
        if (root->data == data) {
            // Xoá Node gốc
            int numOfChild = getNumOfChild(root);
            delete root;
            root = nullptr;
            return numOfChild + 1;
        }
        Node* temp = findNode(root, data);
        if (temp == nullptr) return 0;

        // Xoá Node lá hoặc Node không phải lá
        Node* parent = temp->fatherNode;
        if (parent != nullptr) {
            parent->children.erase(
                remove_if(parent->children.begin(), parent->children.end(),
                          [temp](Node* child) { return child == temp; }),
                parent->children.end()
            );
            parent->childDataSet.erase(temp->data);
        }
        int numOfChild = getNumOfChild(temp);
        delete temp;
        return numOfChild + 1;
    }

    // Hàm in ra các Node theo thứ tự preorder
    void preorder(Node *node) {
        if (node == nullptr) return;
        cout << node->data << " ";
        for (Node* child : node->children) {
            preorder(child);
        }
    }

    void postorder(Node *node) {
        if (node == nullptr) return;
        for (Node* child : node->children) {
            postorder(child);
        }
        cout << node->data << " ";
    }

    // Hàm kiểm tra cây nhị phân
    bool isBinaryTree(Node *node) {
        if (node == nullptr) return true;
        if (node->children.size() > 2) return false;

        for (Node* child : node->children) {
            if (!isBinaryTree(child)) return false;
        }
        return true;
    }

    // Hàm kiểm tra cây tìm kiếm nhị phân
    bool isBinarySearchTree(Node *node) {
        if (isBinaryTree(root) == false) return false;
        if (node == nullptr) return true;

        if (node->children.size() == 2) {
            int leftData = node->children[0]->data;
            int rightData = node->children[1]->data;
            if (!(leftData < node->data && node->data < rightData)) {
                return false;
            }
        }

        for (Node* child : node->children) {
            if (!isBinarySearchTree(child)) return false;
        }
        return true;
    }

    // Hàm kiểm tra cây max-heap
    bool isMaxHeapTree(Node *node) {
        if (node == nullptr) return true;

        for (Node* child : node->children) {
            if (node->data < child->data) return false;
            if (!isMaxHeapTree(child)) return false;
        }
        return true;
    }

    // Hàm trả về độ cao của cây
    int height(Node *node) {
        if (node == nullptr) return 0;

        int mx = 0;
        for (Node* child : node->children) {
            mx = max(mx, height(child));
        }
        return mx + 1;
    }

    // Hàm đếm số lượng lá
    int numOfLeaves(Node *node) {
        if (node == nullptr) return 0;
        if (node->children.empty()) return 1;

        int count = 0;
        for (Node* child : node->children) {
            count += numOfLeaves(child);
        }
        return count;
    }

    // Hàm trả về Node có giá trị lớn nhất
    int findMax(Node *node) {
        if (node == nullptr) return -1;

        int mx = node->data;
        for (Node* child : node->children) {
            mx = max(mx, findMax(child));
        }
        return mx;
    }

    // Hàm trả về Node có nhiều con nhất
    int findMaxChild(Node *node) {
        if (node == nullptr) return -1;

        int mx = node->children.size();
        for (Node* child : node->children) {
            mx = max(mx, findMaxChild(child));
        }
        return mx;
    }
};

void test(Tree a) {
    cout << "Preorder: ";
    a.preorder(a.getRoot());
    cout << endl;

    cout << "Postorder: ";
    a.postorder(a.getRoot());
    cout << endl;

    cout << "Height: " << a.height(a.getRoot()) << endl;
    cout << "Number of leaves: " << a.numOfLeaves(a.getRoot()) << endl;
    cout << "Max: " << a.findMax(a.getRoot()) << endl;
    cout << "Max child: " << a.findMaxChild(a.getRoot()) << endl;

    if (a.isBinaryTree(a.getRoot())) {
        cout << "This is a binary tree" << endl;
    } else {
        cout << "This is not a binary tree" << endl;
    }

    if (a.isBinarySearchTree(a.getRoot())) {
        cout << "This is a binary search tree" << endl;
    } else {
        cout << "This is not a binary search tree" << endl;
    }

    if (a.isMaxHeapTree(a.getRoot())) {
        cout << "This is a max heap tree" << endl;
    } else {
        cout << "This is not a max heap tree" << endl;
    }
}

int Left[40], Right[40];

int find_par(int u, int data){
  if(u > data){
    if(Left[u] == 0){
      Left[u] = data;
      return u;
    }
    return find_par(Left[u], data);
  }
  else{
    if(Right[u] == 0){
      Right[u] = data;
      return u;
    }
    return find_par(Right[u], data);
  }
}

Tree CreateABinaryTree() {
    Tree tree = Tree();

    bool checking = tree.insert(-1, 5);
    int root = 5;

    for(int i = 1; i <= 10; i++){
      if(i == 5) continue;
      int par = find_par(root, i);
      checking = tree.insert(par, i);
    }

    return tree;
}

Tree CreateAMaxHeapTree() {
    vector<int> v;
    Tree tree = Tree();
    for(int i = 10; i >= 1; i--) v.push_back(i);
    tree.insert(-1, v[0]);
    for(int i = 0; i < v.size(); i++) {
        if(i * 2 + 1 < v.size()) {
            bool ans = tree.insert(v[i], v[i * 2 + 1]);
        }
        if(i * 2 + 2 < v.size()) {
            bool ans = tree.insert(v[i], v[i * 2 + 2]);
        }
    }
    return tree;
}

Tree generateRandomTree(int numNode) {
    vector<int> randomNumber(numNode);
    for (int i = 0; i < numNode; i++) {
        randomNumber[i] = i;
    }
    random_shuffle(randomNumber.begin(), randomNumber.end());
    Tree a;
    a.insert(-1, randomNumber[0]);
    vector<int> existNode;
    existNode.push_back(randomNumber[0]);
    for (int i = 1; i < numNode; i++) {
        int father = existNode[rand() % existNode.size()];
        a.insert(father, randomNumber[i]);
        existNode.push_back(randomNumber[i]);
    }
    return a;
}

int main(int argc, char const *argv[]) {
    srand(time(NULL));
    Tree a = generateRandomTree(30);
    test(a);

    // Tạo ra một cây thoả mãn tính chất là Binary Search Tree và test lại
    Tree b = CreateABinaryTree();
    test(b);
    // Tạo ra một cây thoả mãn tính chất là Max Heap Tree và test lại
    Tree c = CreateAMaxHeapTree();
    test(c);
    return 0;
}
