#include <bits/stdc++.h>
using namespace std;

const int maxn = (int) 1e5 + 1;

int numNodes, numEdges, x, y;
vector<int> adj[maxn];

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    cin >> numNodes >> numEdges >> x >> y;
    for(int i = 0; i < numEdges; i++) {
        int u, v;
        cin >> u >> v;
        adj[u].push_back(v);
    }

    queue<int> que;
    vector<int> dp(numNodes + 1, -1);
    que.push(x);
    dp[x] = 0;
    while(!que.empty()) {
        int u = que.front();
        que.pop();
        for(int v : adj[u]) {
            if(dp[v] == -1) {
                dp[v] = dp[u] + 1;
                que.push(v);
            }
        }
    }
    cout << dp[y];
    return 0;
}
