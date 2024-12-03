// Mitsuhina43
#include <bits/stdc++.h>
#define Random(lf, rt) (lf + rand() % (rt - lf + 1))
#define oo 3000000007
#define mod 1000000007
#define PB push_back
#define all(z) z.begin(), z.end()
#define ii pair<int, int>
#define Getbit(z, l) ((z >> l) & 1)
#define sobit(z) __builtin_popcount(z)
#define sz(z) (int) z.size()
#define maxn 1011
#define F first
#define S second
#define FOR(i, a, b) for(ll i = a; i <= b; i++)
#define FORD(i, a, b) for(ll i = a; i >= b; i--)
#define reset(i, a) memset(i, a, sizeof(i))
#define TASK "SUBARRAY"
using namespace std;
typedef long long ll;
typedef long double ld;

ll n, m, k, res, N, M, kth, cnt;
ll a[maxn], b[maxn], c[1000011], d[1000011], s[1000011];

void Init(){
    cin >> n >> m >> k;
    FOR(i, 1, n) cin >> a[i];
    FOR(i, 1, m) cin >> b[i];
    FOR(i, 1, n) FOR(j, 1, n) c[++N] = a[i] + a[j];
    FOR(i, 1, m) FOR(j, 1, m) d[++M] = b[i] + b[j];
    sort(c+1, c+N+1);
    sort(d+1, d+M+1);
    s[0] = 0;
    FOR(i, 1, N) s[i] = s[i-1] + c[i];
}

bool Check(ll x){
//    ll ans = 0;
//    ll i = 1, j = M;
//    while(i <= N && j >= 0){
//        while(c[i] + d[j] < x && i <= N) ++i;
//        if(i <= N){
//            ans += N - i + 1;
//            --j;
//            if(ans >= k) return 1;
//        }
//    }
//    return 0;
    ll cnt = 0;
    ll j = M;
    FOR(i, 1, N){
        while(c[i] + d[j] >= x && j) --j;
        cnt += (M - j);
    }
    return (cnt >= k);
}

void Solve(){
    ll lf = -1e18, rt = 1e18;
    while(rt >= lf){
        ll mid = (lf + rt) >> 1;
        if(Check(mid)){
            kth = mid;
            lf = mid + 1;
        }
        else rt = mid - 1;
    }
   cout << kth << "\n";
    FOR(i, 1, M){
        ll nxt = upper_bound(c+1, c+N+1, kth - d[i]) - c - 1;
        res += (s[N] - s[nxt] + d[i] * (N - nxt));
        cnt += N - nxt;
    }
    cout << res + (k - cnt) * kth;
}

int main(){
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    Init();
    Solve();
    return 0;
}
