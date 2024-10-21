#include <bits/stdc++.h>
using namespace std;

vector<string> splice(string s, char c) {
    vector<string> v;
    string temp = "";
    for(int i = 0; i < (int) s.size(); i++) {
        if(s[i] == c) {
            v.push_back(temp);
            temp = "";
        } else {
            temp += s[i];
        }
    }
    v.push_back(temp);
    return v;
}

int main() {
    string s;
    map<string, array<string, 2>> mp;
    while(cin >> s) {
        if(s == "") break;
        if(s.find("Insert") != string::npos) {
            vector<string> v = splice(s.substr(7, (int) s.size() - 8), ',');
            mp[v[0]] = {v[1], v[2]};
            cout << "Insert " << v[0] << " " << v[1] << " " << v[2] << "\n";
        }
        else if(s.find("Infor") != string::npos) {
            string ID = s.substr(6, (int) s.size() - 7);
            cerr << "Infor of " << ID << "\n";
            if(mp.find(ID) == mp.end()) {
                cout << "NA,NA\n";
            } else {
                cout << mp[ID][0] << "," << mp[ID][1] << "\n";
            }
        }
        else {
            string ID = s.substr(7, (int) s.size() - 8);
            cout << "Erase " << ID << "\n";
            mp.erase(ID);
        }
    }

    return 0;
}
