#include <bits/stdc++.h>
using namespace std;

const int maxn = (int) 2e6 + 3;

int que[maxn];
int head = 0, tail = 0;

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int query; cin >> query;

    while(query--) {
        string s; cin >> s;
        if(s == "enqueue") {
            int x; cin >> x;
            que[tail++] = x;
        } else ++head;
    }
    for(int i = head; i < tail; i++) {
        cout << que[i] << ' ';
    }
    return 0;
}
