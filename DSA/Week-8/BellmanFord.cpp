#include <bits/stdc++.h>
using namespace std;

const int maxn = 1003;

int numNodes, numEdges;
vector<array<int, 3>> edges;
long long dp[maxn];

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    cin >> numNodes >> numEdges;
    for (int i = 0; i < numEdges; i++) {
        int u, v, w;
        cin >> u >> v >> w;
        edges.push_back({u, v, w});
    }

    for (int i = 1; i <= numNodes; i++) {
        dp[i] = LLONG_MAX;
    }
    dp[1] = 0;
    for(int t = 1; t < numNodes; t++) {
        for(auto [u, v, w] : edges) {
            if(dp[u] != LLONG_MAX && dp[u] + w < dp[v]) {
                dp[v] = dp[u] + w;
            }
        }
    }
    cout << dp[numNodes] << '\n';
    return 0;
}
