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
    int n,m,k;
  
  while(cin>>n>>m>>k){
      int num,plato1,plato2;
      int cant1=0,cant2=0;
      For(i,n){
          cin>>num;
          if(num==1) cant1++;
          else  cant2++;
      }
      if(cant1-m > 0)
        plato1 = cant1-m;
      else{
          plato1=0;
          k += m-cant1;
      }
      if(cant2-k>0) plato2 = cant2-k;
      else plato2=0;
      
      cout<<plato1+plato2<<endl;
  }
  return 0;
}
