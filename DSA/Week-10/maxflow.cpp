#include <bits/stdc++.h>
using namespace std;

const int maxn = 1003;

vector<int> adj[maxn];
int n, m, s, t, maxFlow = 0;
int c[maxn][maxn], f[maxn][maxn], trace[maxn];

void bfs() {
    memset(trace, 0, sizeof(trace));

    trace[s] = -1;
    queue<int> que;
    que.push(s);
    while(!que.empty()) {
        int u = que.front(); que.pop();
        for(int v : adj[u]) {
            if(!trace[v] && f[u][v] < c[u][v]) {
                trace[v] = u;
                que.push(v);
            }
        }
    }
}

void incFlow() {
    int delta = INT_MAX;
    int v = t;
    while(v != s) {
        int u = trace[v];
        delta = min(delta, c[u][v] - f[u][v]);
        v = u;
    }
    maxFlow += delta;
    v = t;
    while(v != s) {
        int u = trace[v];
        f[u][v] += delta;
        f[v][u] -= delta;
        v = u;
    }
}

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    cin >> n >> m >> s >> t;
    for(int i = 1; i <= m; i++) {
        int u, v, w; cin >> u >> v >> w;
        adj[u].push_back(v);
        // adj[v].push_back(u);
        c[u][v] = w;
    }

    do {
        bfs();
        if(trace[t]) incFlow();
    } while(trace[t]);

    cout << maxFlow;
    return 0;
}
