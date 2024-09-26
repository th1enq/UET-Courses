#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    unordered_map<int, int> cnt;
    long long res = 0;

    for(int i = 1; i <= n; i++) {
        int x; cin >> x;
        if(cnt.count(x)) {
            res += cnt[x];
        }
        cnt[x]++;
    }
    cout << res;
    return 0;
}
