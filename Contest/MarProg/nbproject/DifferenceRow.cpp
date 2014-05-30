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


#define vi vector<int>

bool compare(int a, int b){return (a<b);}
int main(){
  #ifdef SV
    freopen("in","r",stdin);
  #endif
  int n,m;
  vi number;
  while(cin>>n){
      For(i,n){
          cin>>m;
          number.pb(m);
      }
      sort(number.begin(),number.end(),compare);
      int first = number[0];
      number[0]=number[n-1];
      number[n-1]=first;
      For(i,number.size()){
          cout<<number[i]<<" ";
      }
      cout<<endl;
      number.clear();
  }
  return 0;
}


