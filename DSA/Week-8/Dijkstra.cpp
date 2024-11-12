#include <bits/stdc++.h>
using namespace std;

const int maxn = (int) 1e5 + 3;

int numNodes, numEdges;
vector<array<int, 2>> adj[maxn];

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    cin >> numNodes >> numEdges;
    for (int i = 0; i < numEdges; i++) {
        int u, v, w;
        cin >> u >> v >> w;
        adj[u].push_back({v, w});
    }

    vector<long long> dp(numNodes + 1, LLONG_MAX);
    priority_queue<array<long long, 2>, vector<array<long long, 2>>, greater<array<long long, 2>>> pq;

    dp[1] = 0;
    pq.push({dp[1], 1});
    while(!pq.empty()) {
        auto [d, u] = pq.top();
        pq.pop();
        if (d != dp[u]) continue;
        for (auto [v, w] : adj[u]) {
            if (dp[v] > dp[u] + w) {
                dp[v] = dp[u] + w;
                pq.push({dp[v], v});
            }
        }
    }

    cout << dp[numNodes] << '\n';
    return 0;
}
