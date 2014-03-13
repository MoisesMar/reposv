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
  int l=0,r=0;
  int a,b;
  while(cin>>n){
      For(i,n){
          cin>>a>>b;
          if(a==1)l++;
          if(b==1)r++;
      }
      int time=0;
      if(n-l>l)time+=l;
      else time+=(n-l);
      
      if(n-r>r) time+=r;
      else time+=(n-r);
      cout <<time<<endl;
  }
  return 0;
}



