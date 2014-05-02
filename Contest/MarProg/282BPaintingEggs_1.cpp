#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <cmath>
#include <climits>
#include <cassert>
#include <iostream>
#include <string>
#include <sstream>
#include <algorithm>
#include <vector>
#include <stack>
#include <queue>
#include <set>
#include <map>

using namespace std;

#define D(x) cout << #x << " : " << x << endl;

#define For(i,a) for(int i=0; i<a; i++)
#define Fori(i,a,b) for(int i=a; i<b; i++)
#define Forn(i,a,b,c) for(int i=a; i<b; i+=c)
#define pb push_back
#define mp make_pair

#define pii pair<int,int>
#define vpii vector< pii >

bool compareSecond (const pii& a, const pii& b) { 
    return (a.second<b.second); 
}

bool compareFirst(const pii& a, const pii& b) { 
    return (a.first<b.first); 
}

int main(){
  #ifdef SV
    freopen("in","r",stdin);
  #endif
    int n,a,g;
    vpii money;
    while(cin>>n){
        For(i,n){
            cin>>a>>g;
            money.pb(mp(i,a));
        }
        
        sort(money.begin(),money.end(),compareSecond);
        
        For(i,n){
            cout<<"ind:"<<money[i].first<<" val:"<<money[i].second<<endl;
        }
        cout<<endl<<endl;
        sort(money.begin(),money.end(),compareFirst);
        For(i,n){
            cout<<"ind:"<<money[i].first<<" val:"<<money[i].second<<endl;
        }
//        cout<<"ind:"<<money[i].first<<" val:"<<money[i].second<<endl;
    }
    
    return 0;
}






