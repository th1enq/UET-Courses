#include<bits/stdc++.h>

#define FOR(i, a, b) for(int i = a; i <= b; i++)
#define FORD(i, a, b) for(int i = a; i >= b; i--)

using namespace std;

const int MAXN = 1e6 + 5;
const int MOD = 1e9 + 7;
const int INF = 1e9;

string S;
int N;
int f[MAXN], g[MAXN];
int res = 0;

int getf(int l, int r) {
    return f[r] - f[l - 1];
}

int getg(int l, int r) {
    return g[r] - g[l - 1];
}

int findpos(int l, int len) {
    for(int i = l; i <= N; i++) {
        if (getg(l, i) >= len && i < N && S[i] == '0') continue;
        if (getg(l, i) >= len && i == N) return i;
        if (getg(l, i) >= len) return i - 1;
    }
    return -1;
}

void solve(int len) {
    int remove = 0;
    int l = 1;
    while(l <= N) {
        int r = findpos(l, len);
        if (r == -1) {
            remove += getf(l, N);
            break;
        }
        remove += getf(l, r);
        l = r + 2;
    }
    if (S[l - 1] == '1') remove++;
    int remain = f[N] - remove;
    int ans = (remain + 1) * len + remain;
    // cout << len << " " << ans << '\n';
    if (remain > 0) res = max(res, (remain + 1) * len + remain);
}

int main() {
    cin.tie(0) -> sync_with_stdio(0);
    freopen(".inp", "r", stdin);
    freopen(".out", "w", stdout);
    cin >> N >> S;
    S = " " + S;
    S += "0"; S += "0";
    FOR(i, 1, N) f[i] = f[i - 1] + (S[i] == '1');
    FOR(i, 1, N) g[i] = g[i - 1] + (S[i] == '0');

    FOR(i, 1, N) solve(i);
    res = max(res, N - g[N]);
    cout << res;
}
