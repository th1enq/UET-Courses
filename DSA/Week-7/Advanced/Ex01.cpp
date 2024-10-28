#include <bits/stdc++.h>
using namespace std;

const int maxn = (int) 1e5 + 3;

int n, m;
int deg[maxn];
vector<int> adj[maxn];

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    freopen("jobs.txt", "r", stdin);
    freopen("jobs.out", "w", stdout);

    cin >> n >> m;
    for(int i = 1; i <= m; i++) {
        int u, v; cin >> u >> v;
        adj[u].push_back(v);
        ++deg[v];
    }

    queue<int> que;
    for(int i = 1; i <= n; i++) if(!deg[i]) que.push(i);

    while(!que.empty()) {
        int u = que.front(); que.pop();
        cout << u << " ";
        for(int v : adj[u]) {
            if(--deg[v] == 0) que.push(v);
        }
    }

    return 0;
}
