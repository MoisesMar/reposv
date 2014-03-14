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
    int t,sx,sy,ex,ey;
    string dir;
    while(cin>>t>>sx>>sy>>ex>>ey){
        bool time=false;
        int i=0;
        cin>>dir;
        for(i;i<dir.size();i++){
            if(dir[i]=='N'){
                if(ey>sy) sy++; 
            }
            if(dir[i]=='S'){
                if(ey<sy) sy--;
            }
            if(dir[i]=='E'){
                if(ex>sx) sx++; 
            }
            if(dir[i]=='W'){
                if(ex<sx) sx--;
            }
            if(ex==sx && ey==sy){
                cout<<i+1<<endl;
                time=true;
                break;
            }
        }
        if(!time) cout<<-1<<endl;
    }
    
}





