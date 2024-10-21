#include <bits/stdc++.h>
using namespace std;

const int maxn = (int) 1e5 + 1;

int numNodes, numEdges;
vector<int> adj[maxn];
int visited[maxn];

void dfs(int u) {
    visited[u] = true;
    for(int v : adj[u]) if(visited[v] == false) dfs(v);
}

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    cin >> numNodes >> numEdges;
    for(int i = 0; i < numEdges; i++) {
        int u, v;
        cin >> u >> v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    int numComponents = 0;

    for(int i = 1; i <= numNodes; i++) if(visited[i] == false) dfs(i), numComponents++;

    cout << numComponents;
    return 0;
}
