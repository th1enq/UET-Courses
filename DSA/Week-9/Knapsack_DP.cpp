#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    int n, W;
    cin >> n >> W;
    vector<int> w(n+1), v(n+1);
    for(int i = 1; i <= n; i++) {
        cin >> w[i] >> v[i];
    }

    vector<int> dp(W+1, 0);
    for(int i = 1; i <= n; i++) {
        for(int j = W; j >= w[i]; j--) {
            dp[j] = max(dp[j], dp[j-w[i]] + v[i]);
        }
    }
    cout << dp[W] << '\n';
    return 0;
}
