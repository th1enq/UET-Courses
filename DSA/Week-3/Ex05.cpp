#include <bits/stdc++.h>
using namespace std;

const int maxn = (int) 2e6 + 3;

int st[maxn];
int top = 0;

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    int query; cin >> query;
    while(query--) {
        string s; cin >> s;
        if(s == "push") {
            int x; cin >> x;
            st[top++] = x;
        } else --top;
    }
    for(int i = 0; i < top; i++) {
        cout << st[i] << ' ';
    }
    return 0;
}
