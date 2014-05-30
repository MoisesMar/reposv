
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

int compare (const void* a, const void* b){
    return (*(int*)b-*(int*)a);
}


int main(){
  #ifdef SV
    freopen("in","r",stdin);
  #endif
    int n;
    int vals[1005];
    int turns=1,x,t;
    while(cin>>n){
        int maximo=0;
        int inV=0;
        For(i,n){
            cin>>x;
            cin>>t;
            if(t==0){
                vals[inV]=x;
                inV++;
            }
            else{
                maximo+=x;
                turns+=(t-1);
            }
        }
        qsort(vals,inV,sizeof(int),compare);
        for(int i=0; i<inV and turns>0; i++){
            maximo+=vals[i];
            turns--;
        }
        cout << maximo<<endl;
    }
    
  return 0;
}

