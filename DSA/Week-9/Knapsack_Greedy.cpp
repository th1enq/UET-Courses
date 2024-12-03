#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    int n, W;
    cin >> n >> W;
    vector<pair<double, pair<int, int>>> a(n);

    for(int i = 0; i < n; i++) {
        cin >> a[i].second.first >> a[i].second.second;
        a[i].first = (double)a[i].second.second / a[i].second.first;
    }
    sort(a.begin(), a.end());

    int res = 0;

    for(int i = 0; i < n; i++) {
        if(W == 0) break;
        if(W >= a[i].second.first) {
            res += a[i].second.second;
            W -= a[i].second.first;
        }
    }

    cout << res;
    return 0;
}
