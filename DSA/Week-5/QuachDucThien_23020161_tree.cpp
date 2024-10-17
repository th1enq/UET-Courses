#include <bits/stdc++.h>
using namespace std;

class Node {
    int data; // Dữ liệu của Node
    Node* fatherNode; // Node cha
    Node* firstChild; // Con trỏ đến Node con đầu tiên
    Node* nextSibling; // Con trỏ đến Node anh em kế tiếp
    int numOfChild; // Số lượng con
public:
    Node() {
        // Khởi tạo Node
        fatherNode = firstChild = nextSibling = NULL;
        numOfChild = 0;
    }
    Node(int data) {
        // Khởi tạo Node với dữ liệu
        this->data = data;
        fatherNode = firstChild = nextSibling = NULL;
        numOfChild = 0;
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
        root = NULL;
    }
    // Các hàm khởi tạo khác nếu cần thiết

    Node* getRoot() {
        return root;
    }

    Node* findNode(Node *node, int data) {
        if(node == NULL) {
            return NULL;
        }
        if(node->data == data) {
            return node;
        }
        Node* temp = findNode(node->firstChild, data);
        if(temp != NULL) {
            return temp;
        }
        return findNode(node->nextSibling, data);
    }

    // Hàm thêm một Node vào cây
    // Hàm trả về false nếu Node cha không tồn tại trên cây
    // hoặc Node father đã có con là data
    bool insert(int father, int data) {
        if (root == nullptr) {
            root = new Node(data);  // Nếu cây rỗng, Node này sẽ là gốc
            return true;
        }

        Node* parentNode = findNode(root, father);  // Tìm Node cha
        if (parentNode == nullptr) return false;  // Node cha không tồn tại

        // Kiểm tra xem Node cha đã có con với giá trị tương tự chưa
        Node* currentChild = parentNode->firstChild;
        while (currentChild != nullptr) {
            if (currentChild->data == data) return false;  // Node con đã tồn tại
            currentChild = currentChild->nextSibling;
        }

        // Thêm Node mới vào danh sách con
        Node* newNode = new Node(data);
        newNode->fatherNode = parentNode;

        if (parentNode->firstChild == nullptr) {
            parentNode->firstChild = newNode;  // Nếu cha chưa có con, đây là con đầu tiên
        } else {
            // Thêm vào vị trí cuối của danh sách các Node con
            Node* temp = parentNode->firstChild;
            while (temp->nextSibling != nullptr) {
                temp = temp->nextSibling;
            }
            temp->nextSibling = newNode;
        }
        return true;
    }

    // Hàm trả về số lượng con của một Node
    int getNumOfChild(Node *node) {
        if(node == NULL) {
            return 0;
        }
        int cnt = 0;
        Node* temp = node->firstChild;
        while(temp != NULL) {
            cnt++;
            cnt += getNumOfChild(temp);
            temp = temp->nextSibling;
        }
        return cnt;
    }

    // Hàm xoá một Node trên cây
    // Nếu không phải Node lá xoá Node đó và toàn bộ các Node con của nó
    // Hàm trả về số lượng Node đã xoá
    // Nếu Node data không tồn tại trả về 0 (zero)
    int remove(int data) {
        if(root == NULL) {
            return 0;
        }
        if(root->data == data) {
            // Xoá Node gốc
            int numOfChild = getNumOfChild(root);
            delete root;
            return numOfChild + 1;
        }
        Node* temp = findNode(root, data);
        if(temp == NULL) {
            return 0;
        }
        if(temp->firstChild == NULL) {
            // Node lá
            if(temp->fatherNode->firstChild == temp) {
                temp->fatherNode->firstChild = temp->nextSibling;
            } else {
                Node* temp2 = temp->fatherNode->firstChild;
                while(temp2->nextSibling != temp) {
                    temp2 = temp2->nextSibling;
                }
                temp2->nextSibling = temp->nextSibling;
            }
            delete temp;
            return 1;
        }
        // Node không phải lá
        int numOfChild = getNumOfChild(temp);
        delete temp;
        return numOfChild + 1;
    }

    // Hàm in ra các Node theo thứ tự preorder
    void preorder(Node *node) {
        if(node == NULL) {
            return;
        }
        cout << node->data << " ";
        preorder(node->firstChild);
        preorder(node->nextSibling);
    }

    void postorder(Node *node) {
        if(node == NULL) {
            return;
        }
        postorder(node->firstChild);
        cout << node->data << " ";
        postorder(node->nextSibling);
    }

    // Hàm kiểm tra cây nhị phân
    bool isBinaryTree(Node *node) {
        if(node == NULL) {
            return true;
        }
        if(node->numOfChild > 2) {
            return false;
        }
        return isBinaryTree(node->firstChild) && isBinaryTree(node->nextSibling);
    }

    // Hàm kiểm tra cây tìm kiếm nhị phân
    bool isBinarySearchTree(Node *node) {
        if(isBinaryTree(root) == false) {
            return false;
        }
        if(node == NULL) {
            return true;
        }
        int data = node->data;
        if(node->firstChild != NULL) {
            if(node->firstChild->nextSibling != NULL) {
                int a = node->firstChild->data;
                int b = node->firstChild->nextSibling->data;
                if(!((a < data && data < b) || (a > data && data > b))) {
                    return false;
                }
            }
        }
        return isBinarySearchTree(node->firstChild) && isBinarySearchTree(node->nextSibling);
    }

    // Hàm kiểm tra cây max-heap
    bool isMaxHeapTree(Node *node) {
        if(node == NULL) {
            return true;
        }
        if(node->firstChild != NULL && node->data < node->firstChild->data) {
            return false;
        }
        if(node->nextSibling != NULL && node->data < node->nextSibling->data) {
            return false;
        }
        return isMaxHeapTree(node->firstChild) && isMaxHeapTree(node->nextSibling);
    }

    // Hàm in ra các Node theo thứ tự inorder nếu là cây nhị phân
    void inorder(Node *node) {
        if(node == NULL) {
            return;
        }
        inorder(node->firstChild);
        cout << node->data << " ";
        if(node->firstChild != NULL && node->firstChild->nextSibling != NULL) {
            inorder(node->firstChild->nextSibling);
        }
    }

    // Hàm trả về độ cao của cây
    int height(Node *node) {
        if(node == NULL) {
            return 0;
        }
        int mx = 0;
        Node* temp = node->firstChild;
        while(temp != NULL) {
            mx = max(mx, height(temp));
            temp = temp->nextSibling;
        }
        return mx + 1;

    }

    // Hàm trả về độ sâu của một Node
    int depth(int data) {
        Node *node = findNode(root, data);
        if(node == NULL) {
            return -1;
        }
        int d = 0;
        while(node->fatherNode != NULL) {
            d++;
            node = node->fatherNode;
        }
        return d;
    }

    // Hàm đếm số lượng lá
    int numOfLeaves(Node *node) {
        if(node == NULL) {
            return 0;
        }
        if(node->firstChild == NULL) {
            return 1;
        }
        int count = 0;
        Node* temp = node->firstChild;
        while(temp != NULL) {
            count += numOfLeaves(temp);
            temp = temp->nextSibling;
        }
        return count;
    }

    // Hàm trả về Node có giá trị lớn nhất
    int findMax(Node *root) {
        if(root == NULL) {
            return -1;
        }
        int mx = root->data;
        Node* temp = root->firstChild;
        while(temp != NULL) {
            mx = max(mx, findMax(temp));
            temp = temp->nextSibling;
        }
        return mx;
    }

    // Hàm trả về Node có nhiều con nhất
    int findMaxChild(Node *root) {
        if(root == NULL) {
            return -1;
        }
        int mx = root->numOfChild;
        Node* temp = root->firstChild;
        while(temp != NULL) {
            mx = max(mx, findMaxChild(temp));
            temp = temp->nextSibling;
        }
        return mx;
    }
};

void test(Tree a) {
    // Test các hàm của lớp cây
    cout << "Preorder: ";
    a.preorder(a.getRoot());
    cout << endl;

    cout << "Postorder: ";
    a.postorder(a.getRoot());
    cout << endl;

    cout << "Inorder: ";
    a.inorder(a.getRoot());
    cout << endl;

    cout << "Height: " << a.height(a.getRoot()) << endl;

    cout << "Depth of 5: " << a.depth(5) << endl;

    cout << "Number of leaves: " << a.numOfLeaves(a.getRoot()) << endl;

    cout << "Max: " << a.findMax(a.getRoot()) << endl;

    cout << "Max child: " << a.findMaxChild(a.getRoot()) << endl;

    a.remove(rand() % 30);

    if(a.isBinaryTree(a.getRoot())) {
        cout << "This is a binary tree" << endl;
    } else {
        cout << "This is not a binary tree" << endl;
    }

    if(a.isBinarySearchTree(a.getRoot())) {
        cout << "This is a binary search tree" << endl;
    } else {
        cout << "This is not a binary search tree" << endl;
    }

    if(a.isMaxHeapTree(a.getRoot())) {
        cout << "This is a max heap tree" << endl;
    } else {
        cout << "This is not a max heap tree" << endl;
    }
}

Tree generateRandomTree(int numNode) {
    vector<int> randomNumber(numNode);
    for(int i = 0; i < numNode; i++) {
        randomNumber[i] = i;
    }
    random_shuffle(randomNumber.begin(), randomNumber.end());
    Tree a;
    a.insert(-1, randomNumber[0]);
    vector<int> existNode;
    existNode.push_back(randomNumber[0]);
    for(int i = 1; i < numNode; i++) {
        int father = existNode[rand() % existNode.size()];
        a.insert(father, randomNumber[i]);
        existNode.push_back(randomNumber[i]);
    }
    return a;
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

int main(int argc, char const *argv[]) {
    // Tạo ra một cây ngẫu nhiên có tối thiểu 30 Node
    // Test thử các hàm của lớp cây
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
