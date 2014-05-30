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


int main(){
    int vn[3000]={0};
    int vm[3000]={0};
    int n,m;
#ifdef HOME
    freopen("in","r",stdin);
#endif
    while(cin>>n>>m){
        For(i,n) cin>>vn[i];
        For(i,m) cin>>vm[i];
        int ivn = 0;
        For(i,m){
            if(ivn==n) break;
            if(vm[i]>=vn[ivn]){
                ivn++;
            }
        }
        cout<<n-ivn<<endl;
    }
    
    
}

