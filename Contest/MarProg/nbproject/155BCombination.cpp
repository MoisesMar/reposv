
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
  #ifdef SV
    freopen("in","r",stdin);
  #endif
    int n;
    int vals[1005];
    int turns=0,t;
    while(cin>>n){
        For(i,n){
            cin>>vals[i];
            cin>>t;
            turn+=t;
        }
    }
    
  return 0;
}

