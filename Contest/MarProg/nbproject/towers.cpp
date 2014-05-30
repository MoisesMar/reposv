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

//typedef long long int lld;
typedef vector<int> vi;
//typedef vector<lld> vlld;
typedef vector<string> vs;
typedef pair<int,int> pii;
typedef vector<pii> vpii;

typedef map<int,int> mii;


int main(){
  mii mymap;
  int n;
#ifdef HOME
    freopen("in","r",stdin);
#endif
  while(cin>>n){
      int num;
      For(i,n){
          cin>>num;
          mymap[num]+=1;
      }
      int may = 0;
      for (mii::iterator it=mymap.begin(); it!=mymap.end(); ++it)
          if((it->second) > may) may = it->second;
      
      cout<<may<<" "<<mymap.size()<<endl;
      mymap.clear();
      
  }
  return 0;
}
