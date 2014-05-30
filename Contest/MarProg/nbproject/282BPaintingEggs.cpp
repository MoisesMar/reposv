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

#define pii pair<int,int>
#define vpii vector< pii >

bool compareSecond (const pii& a, const pii& b) { 
    return (a.second<b.second); 
}

bool compareFirst(const pii& a, const pii& b) { 
    return (a.first<b.first); 
}

int main(){
  #ifdef SV
    freopen("in","r",stdin);
  #endif
    int n,a,g;
    vpii money;
    while(cin>>n){
        For(i,n){
            cin>>a>>g;
            money.pb(mp(i,a));
        }
        
        sort(money.begin(),money.end(),compareSecond);
        int piv = n/2;
        int suma = 0;
        For(i,n){
            if(i<piv){
                money[i].second-=1000;
                suma+=money[i].second;
            }
            else suma+=money[i].second;
        }
        bool impossible=false;
        if(suma>500){
           for(int i=piv; i<n; i++){
               money[i].second-=1000;
               if(money[i].second==0) money[i].second=-1;
               suma-=1000;
               if(abs(suma)<=500){
                  break; 
               }
               if(suma<-500){
                   impossible=true;
                   break;
               }
           }     
        }
        else if(suma < -500){
            for(int i=piv-1;i>=0; i--){
                money[i].second+=1000;
                suma+=1000;
                if(abs(suma)<=500) break;
                if(suma>500){
                   impossible=true;
                   break;
               }
                
            }
        }
        
        if(impossible) cout<<-1<<endl;
        else{
            string solution="";
            sort(money.begin(),money.end(),compareFirst);
            For(i,n){
                if(money[i].second>=0) solution+="A";
                else solution+="G";
            }
            cout <<solution<<endl;
        }
    }
    
    return 0;
}



