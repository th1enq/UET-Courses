#include <bits/stdc++.h>
using namespace std;

const int maxn = (int) 1e5 + 3;

int n, m;
int root[maxn];
vector<array<int, 3>> edges;

int getRoot(int u) {
    return ((root[u] == u) ? u : (root[u] = getRoot(root[u])));
}

void join(int u, int v) {
    u = getRoot(u);
    v = getRoot(v);
    if(u == v) return;
    root[v] = u;
}

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    freopen("connection.txt", "r", stdin);
    freopen("connection.out", "w", stdout);

    cin >> n >> m;
    for(int i = 1; i <= n; i++) root[i] = i;
    while(m--) {
        int u, v, w; cin >> u >> v >> w;
        edges.push_back({w, u, v});
    }
    sort(edges.begin(), edges.end());

    vector<array<int, 3>> ans;

    long long res = 0;

    for(auto [w, u, v] : edges) {
        if(getRoot(u) != getRoot(v)) {
            ans.push_back({u, v, w});
            join(u, v);
            res += w;
        }
    }

    cout << res << "\n";
    for(auto [u, v, w] : ans) {
        cout << u << " " << v << " " << w << "\n";
    }
    return 0;
}
