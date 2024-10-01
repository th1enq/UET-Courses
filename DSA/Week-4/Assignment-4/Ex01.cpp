#include <bits/stdc++.h>
using namespace std;

const int maxn = (int) 1e5 + 1; // Maximum number of nodes

int n; // Number of nodes
int m; // Number of edges
vector<int> adj[maxn]; // Adjacency list

void preorder(int u = 1, int par = -1) {
    cout << u << ' ';
    for(int v : adj[u]) {
        if(v == par) continue;
        preorder(v, u);
    }
}

void postorder(int u = 1, int par = -1) {
    for(int v : adj[u]) {
        if(v == par) continue;
        postorder(v, u);
    }
    cout << u << ' ';
}

bool isBinaryTree(int u = 1, int par = -1) {
    int cnt = 0;
    for(int v : adj[u]) {
        if(v == par) continue;
        if(!isBinaryTree(v, u)) return false;
        cnt++;
    }
    return cnt <= 2;
}

void inorder(int u = 1, int par = -1) {
    if(adj[u].size() == 1) {
        cout << u << ' ';
        return;
    }
    bool leftDone = false;
    for(int v : adj[u]) if(v != par) {
        inorder(v, u);
        if(!leftDone) cout << u << " ";
        leftDone = true;
    }
}

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    cin >> n >> m;

    for(int i = 0; i < m; i++) {
        int u, v;
        cin >> u >> v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }

    preorder();
    cout << "\n";
    postorder();
    cout << "\n";
    if(isBinaryTree()) inorder();
    else cout << "NO\n";
    return 0;
}
