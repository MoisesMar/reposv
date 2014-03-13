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


int sincero(int x){
    stringstream strnum;
    string num;
    strnum << x;
    strnum >> num;
    string sincero ="";
    For(i,num.size()){
        if (num[i]!='0'){
            sincero+=num[i];
        }
    }
    stringstream strnum2(sincero);
    strnum2 >> x;
    return x;
}

int main(){
  #ifdef SV
    freopen("in","r",stdin);
  #endif
    int a,b,c;
    while(cin>>a>>b){
       c=a+b;
       if(sincero(a)+sincero(b)==sincero(c)) cout<<"YES"<<endl;
       else cout<<"NO"<<endl;
    }
    return 0;
}




