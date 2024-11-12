#include <bits/stdc++.h>
using namespace std;

const int maxn = 103;

int numNodes, numEdges;
long long dp[maxn][maxn];

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    cin >> numNodes >> numEdges;
    for (int i = 1; i <= numNodes; i++) {
        for (int j = 1; j <= numNodes; j++) {
            dp[i][j] = LLONG_MAX;
        }
    }

    for (int i = 0; i < numEdges; i++) {
        int u, v, w;
        cin >> u >> v >> w;
        dp[u][v] = w;
    }

    for (int k = 1; k <= numNodes; k++) {
        for (int i = 1; i <= numNodes; i++) {
            for (int j = 1; j <= numNodes; j++) {
                if (dp[i][k] != LLONG_MAX && dp[k][j] != LLONG_MAX) {
                    dp[i][j] = min(dp[i][j], dp[i][k] + dp[k][j]);
                }
            }
        }
    }

    cout << dp[1][numNodes] << '\n';

    return 0;
}
