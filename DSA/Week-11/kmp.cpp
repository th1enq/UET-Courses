#include <bits/stdc++.h>
using namespace std;

int n, m, q;
long long d[111][111];

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    cin >> n >> m >> q;

    // gan oo cho moi cap dinh
    memset(d, 0x3f, sizeof d);
    for(int i = 1; i <= n; i++) d[i][i] = 0;

    for(int i = 1; i <= m; i++) {
        int u, v, w; cin >> u >> v >> w;
        d[u][v] = d[v][u] = w;
    }
    for(int k = 1; k <= n; k++) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                d[i][j] = min(d[i][j], d[i][k] + d[k][j]);
            }
        }
    }
    while(q--) {
        int op, u, v; cin >> op >> u >> v;

        cout << d[u][v] << "\n";
    }

    return 0;
}
