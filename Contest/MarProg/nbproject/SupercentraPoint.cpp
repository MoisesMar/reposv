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
    int xs[200],ys[200];
    while(cin>>n){
      int num;
      For(i,n) cin>>xs[i]>>ys[i];
      
      int scoples=0;
      For(i,n){
          bool lower=false,upper=false,right=false,left=false;
          For(j,n){
              if(i!=j){
                  if(xs[i]==xs[j]){
                      if(ys[j]<ys[i]) lower = true;
                      if(ys[j]>ys[i]) upper = true;
                  }
                  if(ys[i]==ys[j]){
                      if(xs[j]<xs[i]) left = true;
                      if(xs[j]>xs[i]) right = true;
                  }
                  
              }
          }
          if(lower and upper and left and right) scoples++;
      }
      cout<<scoples<<endl;
    }
  return 0;
  
}
  

