
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
  int n,m;
  int pn[50],pm[50];
  while(cin>>n){
      For(i,n)cin>>pn[i];
      cin>>m;
      For(j,m)cin>>pm[j];
      
      int ratioMayor=0;
      int sumRatios =0;
      int div=0;
      For(i,n){
          For(j,m){
              if(pm[j]%pn[i]==0){
                  div=pm[j]/pn[i];
                  if(div>ratioMayor){
                      ratioMayor=div;
                      sumRatios=1;
                      continue;
                  }
                  if(div==ratioMayor) sumRatios++;
              }
          }
      }
      
      cout <<sumRatios<<endl;
  }
  return 0;
}

